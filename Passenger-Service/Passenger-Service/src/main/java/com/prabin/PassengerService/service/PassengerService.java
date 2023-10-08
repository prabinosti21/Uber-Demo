package com.prabin.PassengerService.service;

import com.prabin.DriverService.dto.Driver;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
    @KafkaListener(topics = AppConstants.locationTopicName, groupId = AppConstants.GROUP_ID)
    public void listenToTopic(Driver driver){
        System.out.println("The received message is = " + driver.toString());
    }
}
