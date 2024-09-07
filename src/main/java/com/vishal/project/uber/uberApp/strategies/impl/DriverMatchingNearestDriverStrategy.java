package com.vishal.project.uber.uberApp.strategies.impl;

import com.vishal.project.uber.uberApp.dto.RideRequestDTO;
import com.vishal.project.uber.uberApp.entities.Driver;
import com.vishal.project.uber.uberApp.entities.RideRequest;
import com.vishal.project.uber.uberApp.repositories.DriverRepository;
import com.vishal.project.uber.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return driverRepository.findMatchingDriver(rideRequest.getPickupLocation());
    }
}
