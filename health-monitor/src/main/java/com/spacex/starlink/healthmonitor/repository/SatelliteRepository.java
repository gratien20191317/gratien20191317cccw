package com.spacex.starlink.healthmonitor.repository;

import com.spacex.starlink.healthmonitor.domain.Satellite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SatelliteRepository extends CrudRepository<Satellite, Long> {

    List<Satellite> findAll();
}
