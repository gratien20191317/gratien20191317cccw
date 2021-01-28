package com.spacex.starlink.constellationmanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Satellite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String modelNumber;
    private Long orbitRadius; // In Meters
    private Double currentPositionLongitude; // Four Decimal
    private Double currentPositionLatitude; // Four Decimal
    private Long constellationID; // attached constellation ID. null if independent
    private String healthStatus;

    public Satellite(){

    }

    public Satellite(Long id, String name, String modelNumber){
        this.id = id;
        this.name = name;
        this.modelNumber = modelNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Long getOrbitRadius() {
        return orbitRadius;
    }

    public void setOrbitRadius(Long orbitRadius) {
        this.orbitRadius = orbitRadius;
    }

    public Double getCurrentPositionLongitude() {
        return currentPositionLongitude;
    }

    public void setCurrentPositionLongitude(Double currentPositionLongitude) {
        this.currentPositionLongitude = currentPositionLongitude;
    }

    public Double getCurrentPositionLatitude() {
        return currentPositionLatitude;
    }

    public void setCurrentPositionLatitude(Double currentPositionLatitude) {
        this.currentPositionLatitude = currentPositionLatitude;
    }

    public Long getConstellationID() {
        return constellationID;
    }

    public void setConstellationID(Long constellationID) {
        this.constellationID = constellationID;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
