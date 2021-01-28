package com.spacex.starlink.orbitcontroller.repository;

import com.spacex.starlink.orbitcontroller.domain.Satellite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SatelliteRepository extends CrudRepository<Satellite, Long> {


}
