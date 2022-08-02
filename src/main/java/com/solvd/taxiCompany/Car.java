package com.solvd.taxiCompany;

import com.solvd.taxiCompany.enums.EngineType;

public abstract class Car {

    private int capacity;
    private EngineType engineType;

    public Car() {
    }

    public Car(int capacity) {

        this.capacity = capacity;

    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



}
