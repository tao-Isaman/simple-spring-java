package com.example.springapi20220828.model;

import lombok.Data;

@Data
public class MassageInfo {
    private String code;
    private String description;

    public MassageInfo(String code, String description){
        this.code = code;
        this.description = description;

    }
}
