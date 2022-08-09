package com.solvd.taxiCompany.enums;

public enum EngineType {

    GASOLINE("Gasoline"),
    ELECTRIC("Electric"),
    DIESEL("Diesel");
    private final String engineType;

    EngineType(String value) {
        this.engineType = value;
    }

    public String getEngineType() {
        return engineType;

    }
}