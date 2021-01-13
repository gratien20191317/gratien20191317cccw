package com.spacex.starlink.constellationmanager.service;

import com.spacex.starlink.constellationmanager.domain.Satellite;
import com.spacex.starlink.constellationmanager.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SatelliteService {

    @Autowired
    SatelliteRepository satelliteRepository;

    public Satellite addOrUpdateSatellite(Satellite satellite) {
        satelliteRepository.save(satellite);
        return satellite;
    }


    public void removeSatellite( Long id) {
        this.satelliteRepository.deleteById(id);
    }

    public List<Satellite> listAll(){
        return satelliteRepository.findAll();
    }
}
