package com.vishal.project.uber.uberApp.strategies.impl;

import com.vishal.project.uber.uberApp.dto.RideRequestDTO;
import com.vishal.project.uber.uberApp.entities.RideRequest;
import com.vishal.project.uber.uberApp.services.DistanceService;
import com.vishal.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(), rideRequest.getDropoffLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}