package com.vishal.project.uber.uberApp.services;

import com.vishal.project.uber.uberApp.dto.DriverDTO;
import com.vishal.project.uber.uberApp.dto.RideDTO;
import com.vishal.project.uber.uberApp.dto.RideRequestDTO;
import com.vishal.project.uber.uberApp.dto.RiderDTO;
import com.vishal.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface RiderService {
    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);
    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);
    RiderDTO getMyProfile();
    List<RideDTO> getAllMyRides();
}
