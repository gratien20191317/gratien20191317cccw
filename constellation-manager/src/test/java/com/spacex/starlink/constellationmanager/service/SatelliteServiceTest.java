package com.spacex.starlink.constellationmanager.service;

import com.spacex.starlink.constellationmanager.controller.ConstellationManager;
import com.spacex.starlink.constellationmanager.domain.Satellite;
import com.spacex.starlink.constellationmanager.repository.SatelliteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SatelliteServiceTest {

    @Autowired
    SatelliteService satelliteService;

    @MockBean
    private SatelliteRepository satelliteRepository;

    @Test
    public void getDataTest() {
//        constellationManager.listAll();

        ArrayList<Satellite> arrayList = new ArrayList<Satellite>(){{add(new Satellite(10L, "SPX1", "MD-1"));}};
        Mockito.when(satelliteRepository.findAll()).thenReturn(arrayList);

        List<Satellite> iterable = satelliteService.listAll();

    }
}
