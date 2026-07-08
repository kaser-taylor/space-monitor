package com.spacemonitor.backend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Validated
@ConfigurationProperties(prefix = "nasa")
public record NasaProperties(
    @NotBlank String apiKey,
    @NotBlank String baseURL
) {
}
