package com.solvd.taxiCompany.enums;

public enum EngineType {

    GASOLINE("Gasoline"),
    ELECTRIC("Electric"),
    DIESEL("Diesel");
    private final String value;

    EngineType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;

    }
}