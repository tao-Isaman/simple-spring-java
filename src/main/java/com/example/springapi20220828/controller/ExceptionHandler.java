package com.example.springapi20220828.controller;

import com.example.springapi20220828.exception.DataNotFoundException;
import com.example.springapi20220828.exception.UnProcessnableException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity handleDataNotFound(DataNotFoundException exception){
        return new ResponseEntity<>(exception.getMassageInfo(), HttpStatus.NOT_FOUND);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(UnProcessnableException.class)
    public ResponseEntity unProcessnable(UnProcessnableException exception){
        return new ResponseEntity<>(exception.getMassageInfo(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

}
