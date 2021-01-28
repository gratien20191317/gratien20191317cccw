package com.spacex.starlink.healthmonitor.controller;

import com.spacex.starlink.healthmonitor.domain.Satellite;
import com.spacex.starlink.healthmonitor.service.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health-monitor")
public class HealthMonitor {

    @Autowired
    SatelliteService satelliteService;

    @GetMapping("/list")
    public ResponseEntity listAll() {
        return ResponseEntity.ok(this.satelliteService.listAll());
    }
}
