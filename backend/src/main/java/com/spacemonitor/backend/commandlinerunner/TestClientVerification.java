package com.spacemonitor.backend.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spacemonitor.backend.client.NasaApiTest;

@Component
public class TestClientVerification implements CommandLineRunner{
    private final NasaApiTest testClient;

    public TestClientVerification(NasaApiTest testClient) {
        this.testClient = testClient;
    }

    @Override
    public void run(String... args) {
        var results = testClient.recentEvent();
        System.out.println("Got " + results.size() + "CME events");
    }
}
