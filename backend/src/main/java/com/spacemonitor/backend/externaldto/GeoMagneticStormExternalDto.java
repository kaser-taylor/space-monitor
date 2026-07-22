package com.spacemonitor.backend.externaldto;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public record GeoMagneticStormExternalDto(
    @JsonProperty("gstID") String gstId,
        OffsetDateTime startTime,
        String link,
        List<AllKpIndex>
        allKpIndex, List<LinkedEvent> linkedEvents,
        OffsetDateTime submissionTime
) {
    public record AllKpIndex (
        OffsetDateTime observedTime,
        Integer kpIndex,
        String source
    ) {}

    public record LinkedEvent (
        @JsonProperty("activityID") String activityId
    ) {}

}
