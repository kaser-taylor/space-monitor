package com.spacemonitor.backend.client;

import java.time.Duration;
import java.util.List;

import org.springframework.boot.micrometer.observation.autoconfigure.ObservationProperties.Http;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.spacemonitor.backend.config.NasaProperties;
import com.spacemonitor.backend.externaldto.TestResponseDto;
import com.spacemonitor.exceptions.DonkiClientException;

@Component
public class NasaApiTest {

    private final NasaProperties nasaProperties;
    private final RestClient restClient;

    String startdate = "2026-06-20";
    String enddate = "2026-08-30";

    public NasaApiTest(RestClient.Builder builder, NasaProperties properties) {
        this.nasaProperties = properties;
        this.restClient = builder
            .baseUrl(properties.baseURL())
            .requestFactory(clientHttpRequestFactory())
            .build();


    }

    public List<TestResponseDto> recentEvent() {
        return restClient.get()
            .uri(uriBuilder -> uriBuilder
                .path("/DONKI/CME")
                .queryParam("startDate", startdate)
                .queryParam("endDate", enddate)
                .queryParam("api_key", nasaProperties.apiKey())
                .build())
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                throw new DonkiClientException(
                    "Donki request failed with client error " + response.getStatusCode());
            } )
            .onStatus(HttpStatusCode::is5xxServerError, (request, response) -> {
                throw new DonkiClientException(
                    "DONKI service unavailable " + response.getStatusCode());
            })
            .body(new ParameterizedTypeReference<List<TestResponseDto>>() {});


    }

    private org.springframework.http.client.ClientHttpRequestFactory clientHttpRequestFactory() {
        var factory = new org.springframework.http.client.SimpleClientHttpRequestFactory();
        factory.setConnectTimeout((int) Duration.ofSeconds(5).toMillis());
        factory.setReadTimeout((int) Duration.ofSeconds(10).toMillis());
        return factory;
    }


}
