package com.prabin.DriverService.controller;

import com.prabin.DriverService.dto.Driver;
import com.prabin.DriverService.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class DriverController {
    @Autowired
    private DriverService driverService;
    @PostMapping()
    public String updateDriverLocation(@RequestBody Driver driver){
        driver.setCurrentLocation(String.valueOf(Math.random()));
        return driverService.updateDriverLocation(driver);
    }
}
