package com.solvd.taxiCompany.exception;

public class IncorrectNameException extends IllegalArgumentException{
    public IncorrectNameException(String string) {
        super(string);
    }
}
