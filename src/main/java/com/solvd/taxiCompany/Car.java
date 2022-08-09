package com.solvd.taxiCompany;

import com.solvd.taxiCompany.enums.EngineType;

public abstract class Car {

    private String model;

    private String brand;


    private EngineType engineType;

    public Car() {
    }

    public Car(String brand,String model) {

        this.brand=brand;
        this.model=model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }





}
