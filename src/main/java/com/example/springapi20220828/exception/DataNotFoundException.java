package com.example.springapi20220828.exception;

import com.example.springapi20220828.model.MassageInfo;
import lombok.Data;

@Data
public class DataNotFoundException extends RuntimeException{
    private MassageInfo massageInfo;

    public DataNotFoundException(MassageInfo massageInfo){
        this.massageInfo = massageInfo;
    }

}
