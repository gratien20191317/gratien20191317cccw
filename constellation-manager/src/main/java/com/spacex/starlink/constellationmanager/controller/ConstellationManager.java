package com.spacex.starlink.constellationmanager.controller;

import com.spacex.starlink.constellationmanager.domain.Satellite;
import com.spacex.starlink.constellationmanager.service.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/constellation-manager")
public class ConstellationManager {

    @Autowired
    SatelliteService satelliteService;

    @PostMapping("/add-update-satellite")
    public ResponseEntity addOrUpdateSatellite(@RequestBody Satellite satellite) {
        this.satelliteService.addOrUpdateSatellite(satellite);
        return ResponseEntity.ok(satellite);
    }

    @DeleteMapping("/remove-satellite/{id}")
    public ResponseEntity removeSatellite(@PathVariable("id") Long id) {
        this.satelliteService.removeSatellite(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list")
    public ResponseEntity listAll() {
        return ResponseEntity.ok(this.satelliteService.listAll());
    }
}
