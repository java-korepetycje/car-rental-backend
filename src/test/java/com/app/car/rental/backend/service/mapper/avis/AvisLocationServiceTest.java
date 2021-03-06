package com.app.car.rental.backend.service.mapper.avis;

import com.app.car.rental.backend.service.avis.AvisLocationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AvisLocationServiceTest {
    @Autowired
    private AvisLocationService avisLocationService;

    @Test
    public void locations() {
        avisLocationService.locations("warszawa");
    }
}