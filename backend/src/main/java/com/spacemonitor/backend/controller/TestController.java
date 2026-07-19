package com.spacemonitor.backend.controller;

import java.time.Instant;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    @GetMapping("/status")
    public Map<String, Object> status() {
        return Map.of("service", "ground-system", "time", Instant.now().toString());
    }

}
