package com.spacemonitor.backend.mapper;

import org.springframework.stereotype.Component;

import com.spacemonitor.backend.entity.TestEvent;
import com.spacemonitor.backend.externaldto.TestResponseDto;

@Component
public class TestResponseMapper {

    public TestEvent toEntity(TestResponseDto testResponseDto) {
        TestEvent event = new TestEvent();
        event.setActivityId(testResponseDto.activityId());
        event.setStartTime(testResponseDto.startTime());
        event.setNote(testResponseDto.note());
        return event;
    }

}
