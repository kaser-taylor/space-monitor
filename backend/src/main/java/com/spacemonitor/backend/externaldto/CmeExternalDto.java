package com.spacemonitor.backend.externaldto;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CmeExternalDto(
     @JsonProperty("activityID") String activityId, String catalog, OffsetDateTime startTime, String note, OffsetDateTime submissionTime, String link, List <CmeAnalysis> cmeAnalyses
) {
   public record CmeAnalysis ( Boolean isMostAccurate, Integer latitude, Integer longitude, Integer halfAngle, Integer speed, String type, Float tilt, Float minorHalfWidth, @JsonProperty("speedMeasuredAtHeight") String speedAtHeight) {

   }
}
