package com.prabin.DriverService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private String driverName;
    private String vehicleType;
    private String vehicleNumber;
    private String currentLocation;
}
