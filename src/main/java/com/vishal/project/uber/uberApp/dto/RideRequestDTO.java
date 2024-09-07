package com.vishal.project.uber.uberApp.dto;

import com.vishal.project.uber.uberApp.entities.enums.PaymentMethod;
import com.vishal.project.uber.uberApp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDTO {


    private Long id;

    private PointDto pickupLocation;

    private PointDto dropoffLocation;

    private LocalDateTime requestedTime;


    private RiderDTO riderDTO;

    private PaymentMethod paymentMethod;


    private RideRequestStatus rideRequestStatus;
}
