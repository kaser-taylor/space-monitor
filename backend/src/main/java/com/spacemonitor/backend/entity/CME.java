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
    private String catalog;

    @Column()
    private Instant startTime;

    @Column()
    private String note;

    @Column()
    private String submissionTime;

    @Column()
    private String link;

    @Column()
    private String isMostAccurate;

    @Column()
    private int latitude;

    @Column()
    private int longitude;

    @Column()
    private int halfAngle;

    @Column()
    private int speed;

    @Column()
    private int type;

    @Column()
    private float tilt;

    @Column()
    private float minorHalfWidth;

    @Column()
    private float speedAtHeight;

}
