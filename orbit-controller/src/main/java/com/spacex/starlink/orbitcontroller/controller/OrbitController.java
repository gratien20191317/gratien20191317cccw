package com.spacex.starlink.orbitcontroller.controller;

import com.spacex.starlink.orbitcontroller.domain.Satellite;
import com.spacex.starlink.orbitcontroller.service.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orbit-controller")
public class OrbitController {

    @Autowired
    SatelliteService satelliteService;

    @PostMapping("/update-orbit-radius")
    public ResponseEntity addOrUpdateOrbitRadius(@RequestBody Satellite satellite) {
        this.satelliteService.addOrUpdateOrbitRadius(satellite);
        return ResponseEntity.ok(satellite);
    }

    @PostMapping("/update-current_position_longitude")
    public ResponseEntity addOrUpdateCurrentPositionLongitude(@RequestBody Satellite satellite) {
        this.satelliteService.addOrUpdateCurrentPositionLongitude(satellite);
        return ResponseEntity.ok(satellite);
    }

    @PostMapping("/update-current_position_latitude")
    public ResponseEntity addOrUpdateCurrentPositionLatitude(@RequestBody Satellite satellite) {
        this.satelliteService.addOrUpdateCurrentPositionLatitude(satellite);
        return ResponseEntity.ok(satellite);
    }
}
