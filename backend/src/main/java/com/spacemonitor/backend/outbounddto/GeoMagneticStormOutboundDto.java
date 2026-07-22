package com.spacemonitor.backend.outbounddto;

import java.time.Instant;

public record GeoMagneticStormOutboundDto(
    Long id,
    String gstId,
    Instant startTime,
    Instant observedTime,
    String link,
    String activityId,
    Instant submissionTime,
    Integer kpIndex,
    String source
) {}
