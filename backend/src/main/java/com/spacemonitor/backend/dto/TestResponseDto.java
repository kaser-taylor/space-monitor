package com.spacemonitor.backend.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TestResponseDto(
    @JsonProperty("activityID") String activityId,
    @JsonProperty("startTime") Instant startTime,
    String note) {}
