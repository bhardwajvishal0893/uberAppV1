package com.vishal.project.uber.uberApp.repositories;

import com.vishal.project.uber.uberApp.entities.Driver;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
    @Query("SELECT d.*, ST_Distance(d.current_location, :pickupLocation) AS distance " +
            "FROM drivers AS d " +
            "where available = true AND ST_DWithin(d.currentLocation, :pickupLocation, 10000) " +
            "ORDER BY distance" +
            "LIMIT 10")

    List<Driver> findMatchingDriver(Point pickupLocation);
}