package com.example.springapi20220828.dependency;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {
    private String addressNo = "35/20";
    private String addressName = "Bangkok ...";
}
