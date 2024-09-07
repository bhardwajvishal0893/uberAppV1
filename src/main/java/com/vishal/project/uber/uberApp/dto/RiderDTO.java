package com.vishal.project.uber.uberApp.dto;

import com.vishal.project.uber.uberApp.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiderDTO {




    private User user;

    private Double ratings;
}
