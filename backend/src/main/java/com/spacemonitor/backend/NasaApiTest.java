package com.spacemonitor.backend;

import org.springframework.web.client.RestClient;

import com.spacemonitor.backend.config.NasaProperties;

public class NasaApiTest {

    private final NasaProperties nasaProperties;

    String startdate = "2026-06-20";
    String enddate = "2026-08-30";
    String apikey = nasaProperties.apiKey();


    RestClient restClient = RestClient.create();

    TestResponse[] testresponse = restClient.get()
        .uri("https://api.nasa.gov/DONKI/CME?startDate={startdate}&endDate={enddate}&api_key={key}}", startdate, enddate, apikey)
        .retrieve()
        .body(TestResponse[].class);

}
