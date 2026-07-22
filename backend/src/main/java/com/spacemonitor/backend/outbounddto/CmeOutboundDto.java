package com.spacemonitor.backend.outbounddto;

import java.time.Instant;

public record CmeOutboundDto(
    Long id,
    String activityId,
    String catalog,
    Instant startTime,
    String note,
    String submissionTime,
    String link,
    Boolean isMostAccurate,
    Integer latitude,
    Integer longitude,
    Integer halfAngle,
    Integer speed,
    String type,
    Float tilt,
    Float minorHalfWidth,
    Float speedAtHeight
) {}
