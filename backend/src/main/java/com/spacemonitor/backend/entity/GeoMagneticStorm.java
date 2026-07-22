package com.spacemonitor.backend.entity;

import java.time.Instant;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "geo_magnetic_storm")
public class GeoMagneticStorm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String gstId;

    @Column(nullable = false)
    private Instant startTime;

    @Column(nullable = false)
    private Instant observedTime;

    @Column()
    private String link;

    @Column()
    private String activityId;

    @Column()
    private Instant submissionTime;

    @Column()
    private Integer kpIndex;

    @Column()
    private String source;



}
