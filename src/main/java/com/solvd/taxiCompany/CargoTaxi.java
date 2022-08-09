package com.solvd.taxiCompany;

public class CargoTaxi extends Car{
    private int length;


    public CargoTaxi() {
    }

    public CargoTaxi( String brand, String model, int length) {
        super( brand, model);
        this.length = length;
    }


    public int getLoadCapacity() {
        return length;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.length = loadCapacity;
    }


}
