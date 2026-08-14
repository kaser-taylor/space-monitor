package com.spacemonitor.backend.client;

import java.net.http.HttpClient;
import java.time.Duration;

import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.spacemonitor.backend.config.NasaProperties;

@Component
public class DonkiClient {

    private final NasaProperties nasaProperties;

    private final RestClient restClient;

    private RestClient.Builder restBuilder(RestClient.Builder builder, NasaProperties nasaProperties) {
        HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(40)).build();

        JdkClientHttpRequestFactory httpRequestFactory = new JdkClientHttpRequestFactory(httpClient);

        httpRequestFactory.setReadTimeout(1000);

        return builder
            .baseUrl(nasaProperties.baseURL()).requestFactory(httpRequestFactory);
    }

    public DonkiClient(RestClient.Builder builder, NasaProperties nasaProperties) {
        this.nasaProperties = nasaProperties;
        this.restClient = restBuilder(builder, nasaProperties).build();

    }




}
