package com.spacex.starlink.healthmonitor.service;

import com.spacex.starlink.healthmonitor.domain.Satellite;
import com.spacex.starlink.healthmonitor.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SatelliteService {

    @Autowired
    SatelliteRepository satelliteRepository;

    public List<Satellite> listAll(){
        return satelliteRepository.findAll();
    }
}
