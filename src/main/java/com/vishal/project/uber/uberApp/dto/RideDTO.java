package com.vishal.project.uber.uberApp.dto;

import com.vishal.project.uber.uberApp.entities.enums.PaymentMethod;
import com.vishal.project.uber.uberApp.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class RideDTO {

    private Long id;


    private Point pickupLocation;

    private Point dropoffLocation;

    private LocalDateTime createdTime;

    private RiderDTO riderDTO;

    private DriverDTO driverDTO;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;
    private String otp;

    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
