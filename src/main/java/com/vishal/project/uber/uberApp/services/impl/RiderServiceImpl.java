package com.vishal.project.uber.uberApp.services.impl;

import com.vishal.project.uber.uberApp.dto.DriverDTO;
import com.vishal.project.uber.uberApp.dto.RideDTO;
import com.vishal.project.uber.uberApp.dto.RideRequestDTO;
import com.vishal.project.uber.uberApp.dto.RiderDTO;
import com.vishal.project.uber.uberApp.entities.RideRequest;
import com.vishal.project.uber.uberApp.entities.enums.RideRequestStatus;
import com.vishal.project.uber.uberApp.repositories.RideRequestRepository;
import com.vishal.project.uber.uberApp.services.RiderService;
import com.vishal.project.uber.uberApp.strategies.DriverMatchingStrategy;
import com.vishal.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        RideRequest rideRequest = modelMapper.map(rideRequestDTO, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);
        driverMatchingStrategy.findMatchingDrivers(rideRequest);
        return modelMapper.map(savedRideRequest, RideRequestDTO.class);
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
