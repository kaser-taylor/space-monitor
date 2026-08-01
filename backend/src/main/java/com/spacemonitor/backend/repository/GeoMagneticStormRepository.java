package com.spacemonitor.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spacemonitor.backend.entity.GeoMagneticStorm;

public interface GeoMagneticStormRepository extends JpaRepository<GeoMagneticStorm, Long>{

    GeoMagneticStorm findByGstId(String gstId);

    GeoMagneticStorm findByKpIndex(Integer kpIndex);

    Boolean existsByGstId(String gstId);
}
