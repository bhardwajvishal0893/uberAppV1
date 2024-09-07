package com.vishal.project.uber.uberApp.strategies.impl;

import com.vishal.project.uber.uberApp.dto.RideRequestDTO;
import com.vishal.project.uber.uberApp.entities.RideRequest;
import com.vishal.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {


    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
