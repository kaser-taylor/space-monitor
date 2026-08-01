package com.spacemonitor.backend.repository;

import java.time.Instant;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spacemonitor.backend.entity.CME;

public interface CmeRepository extends JpaRepository<CME, Long> {

    CME findByActivityId(String activityId);

    Boolean existsByActivityId(String activityId);
    List<CME> findBySubmissionTime(Instant submissionTime);




}
