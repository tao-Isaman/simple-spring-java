package com.example.springapi20220828.exception;

import com.example.springapi20220828.model.MassageInfo;
import lombok.Data;

@Data
public class UnProcessnableException extends RuntimeException{
    private MassageInfo massageInfo;

    public UnProcessnableException(MassageInfo massageInfo){
        this.massageInfo = massageInfo;
    }

}
