package com.spacex.starlink.constellationmanager.repository;

import com.spacex.starlink.constellationmanager.domain.Satellite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatelliteRepository extends CrudRepository<Satellite, Long> {
}
