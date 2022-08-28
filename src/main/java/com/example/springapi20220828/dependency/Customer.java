package com.example.springapi20220828.dependency;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Customer {
    private String name = "customer";
    Address address;

    @Autowired
    public  Customer(Address address){
        this.address = address;
    }

    public Customer() {}
}
