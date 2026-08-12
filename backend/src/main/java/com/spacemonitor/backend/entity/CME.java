package com.spacemonitor.backend.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cme")
public class CME {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String activityId;

    @Column()
    private String catalogs;

    @Column(nullable = false)
    private Instant startTime;

    @Column()
    private String note;

    @Column(nullable = false)
    private Instant submissionTime;

    @Column()
    private String link;

    @Column()
    private Boolean isMostAccurate;

    @Column()
    private Integer latitude;

    @Column()
    private Integer longitude;

    @Column()
    private Integer halfAngle;

    @Column()
    private Integer speed;

    @Column()
    private String types;

    @Column()
    private Float tilt;

    @Column()
    private Float minorHalfWidth;

    @Column()
    private Float speedAtHeight;

}
