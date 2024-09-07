package com.vishal.project.uber.uberApp.services;

import com.vishal.project.uber.uberApp.dto.DriverDTO;
import com.vishal.project.uber.uberApp.dto.SignUpDTO;
import com.vishal.project.uber.uberApp.dto.UserDTO;

public interface AuthService {
    String login(String email, String password);
    UserDTO signup(SignUpDTO signUpDTO);
    DriverDTO onboardNewDriver(Long userId);
}
