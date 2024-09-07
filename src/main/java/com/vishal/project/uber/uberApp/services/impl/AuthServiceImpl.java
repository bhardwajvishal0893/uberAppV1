package com.vishal.project.uber.uberApp.services.impl;

import com.vishal.project.uber.uberApp.dto.DriverDTO;
import com.vishal.project.uber.uberApp.dto.SignUpDTO;
import com.vishal.project.uber.uberApp.dto.UserDTO;
import com.vishal.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignUpDTO signUpDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
