package com.spacemonitor.backend.service;

import org.springframework.stereotype.Service;

import com.spacemonitor.backend.client.DonkiClient;
import com.spacemonitor.backend.repository.CmeRepository;

@Service
public class testService {
    private final DonkiClient client;
    private final CmeRepository repository;

}
