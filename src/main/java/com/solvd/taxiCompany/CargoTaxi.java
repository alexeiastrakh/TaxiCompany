package com.solvd.taxiCompany;

public class CargoTaxi extends Car{
    private int loadCapacity;

    public CargoTaxi() {
    }

    public CargoTaxi(int capacity, int loadCapacity) {
        super(capacity);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


}
