package com.vishal.project.uber.uberApp.services;

import com.vishal.project.uber.uberApp.dto.DriverDTO;
import com.vishal.project.uber.uberApp.dto.RideDTO;
import com.vishal.project.uber.uberApp.dto.RiderDTO;
import com.vishal.project.uber.uberApp.entities.Ride;

import java.util.List;

public interface DriverService {
    RideDTO acceptRide(Long rideId);
    RideDTO cancelRide(Long rideId);
    RideDTO startRide(Long rideId);
    RideDTO endRide(Long rideId);
    RiderDTO rateRider(Long rideId, Integer rating);
    DriverDTO getMyProfile();
    List<RideDTO> getAllMyRides();
}
