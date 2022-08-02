package com.solvd.taxiCompany;

public class LightCar extends Car {
    private boolean babyChair;

    public LightCar() {
    }

    public LightCar(int capacity, boolean babyChair) {
        super(capacity);
        this.babyChair = babyChair;
    }
    public boolean isBabyChair() {
        return babyChair;
    }

    public void setBabyChair(boolean babyChair) {
        this.babyChair = babyChair;
    }

}
