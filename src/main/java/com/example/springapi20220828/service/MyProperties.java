package com.example.springapi20220828.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my")
@Data
public class MyProperties {
    private String message;
    private String address;

}
