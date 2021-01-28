package com.spacex.starlink.orbitcontroller.service;

import com.spacex.starlink.orbitcontroller.domain.Satellite;
import com.spacex.starlink.orbitcontroller.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SatelliteService {

    @Autowired
    SatelliteRepository satelliteRepository;

    public Satellite addOrUpdateOrbitRadius(Satellite satellite) {
        satelliteRepository.save(satellite);
        return satellite;
    }

    public Satellite addOrUpdateCurrentPositionLongitude(Satellite satellite) {
        satelliteRepository.save(satellite);
        return satellite;
    }

    public Satellite addOrUpdateCurrentPositionLatitude(Satellite satellite) {
        satelliteRepository.save(satellite);
        return satellite;
    }
}
