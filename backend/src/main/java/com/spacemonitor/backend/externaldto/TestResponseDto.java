package com.spacemonitor.backend.externaldto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TestResponseDto(
    @JsonProperty("activityID") String activityId,
    @JsonProperty("startTime") String startTime,
    String note) {}
