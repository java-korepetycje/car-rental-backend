package com.app.car.rental.backend.service;

import com.app.car.rental.backend.api.avis.model.location.AvisApiLocation;
import com.app.car.rental.backend.api.avis.model.vehicle.AvisApiVehicle;
import com.app.car.rental.backend.domain.web.LocationSearchRequestDto;
import com.app.car.rental.backend.service.avis.AvisLocationService;
import com.app.car.rental.backend.service.avis.AvisVehicleService;
import org.springframework.stereotype.Service;

@Service
public class CarRentalService {

    private AvisLocationService avisLocationService;
    private AvisVehicleService avisVehicleService;

    public CarRentalService(AvisLocationService avisLocationService,
                            AvisVehicleService avisVehicleService) {
        this.avisLocationService = avisLocationService;
        this.avisVehicleService = avisVehicleService;
    }

    public AvisApiLocation locationSearch(String location) {
        return avisLocationService.locations(location);

    }

    public AvisApiVehicle carSearch(LocationSearchRequestDto locationSearchRequestDto) {
        return avisVehicleService.vehicles(locationSearchRequestDto);
    }
}
