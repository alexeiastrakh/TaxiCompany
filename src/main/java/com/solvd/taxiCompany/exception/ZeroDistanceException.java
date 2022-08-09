package com.solvd.taxiCompany.exception;

public class ZeroDistanceException extends Exception {
    public ZeroDistanceException() {
        super("Distance must be greater than zero");
    }

    public ZeroDistanceException(String message) {
        super(message);
    }
}