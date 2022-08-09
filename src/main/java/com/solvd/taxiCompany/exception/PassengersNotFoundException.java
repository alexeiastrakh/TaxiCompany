package com.solvd.taxiCompany.exception;

public class PassengersNotFoundException extends RuntimeException {

    public PassengersNotFoundException() {
    }

    public PassengersNotFoundException(String message) {
        super(message);
    }

}