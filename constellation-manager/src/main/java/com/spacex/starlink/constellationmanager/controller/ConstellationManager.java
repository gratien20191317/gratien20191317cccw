package com.spacex.starlink.constellationmanager.controller;

import com.spacex.starlink.constellationmanager.domain.Satellite;
import com.spacex.starlink.constellationmanager.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/constellation-manager")
public class ConstellationManager {

    @Autowired
    SatelliteRepository satelliteRepository;

    @PostMapping("/add-update-satellite")
    public ResponseEntity addOrUpdateSatellite(@RequestBody Satellite satellite) {
        this.satelliteRepository.save(satellite);
        return ResponseEntity.ok(satellite);
    }

    @DeleteMapping("/remove-satellite/{id}")
    public ResponseEntity addSatellite(@PathVariable("id") Long id) {
        this.satelliteRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list")
    public ResponseEntity listAll() {
        return ResponseEntity.ok(this.satelliteRepository.findAll());
    }
}
