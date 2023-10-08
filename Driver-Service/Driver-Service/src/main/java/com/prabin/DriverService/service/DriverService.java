package com.prabin.DriverService.service;

import com.prabin.DriverService.dto.Driver;
import com.prabin.DriverService.kafka.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    KafkaTemplate<String,Object>kafkaTemplate; //key = topic name that's why it is always string.
                                                // value = the actual message to pass to the consumer.
                                                // In our case our message is driver info, so the value is Object.
    private final Logger logger = LoggerFactory.getLogger(DriverService.class);//to print the message if it is coming or not.
    public String updateDriverLocation(Driver driver) {
        this.kafkaTemplate.send(AppConstants.locationTopicName,driver); //key= topic name, value = actual message
        this.logger.info("Message produced successfully" + driver.toString());
        return "Success";
    }
}
