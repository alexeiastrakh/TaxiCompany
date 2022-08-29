package com.solvd.taxiCompany;

public class LightCar extends Car {
    private boolean babyChair;


    public LightCar() {
    }

    public LightCar(String brand, String model, boolean babyChair) {
        super(brand, model);
        this.babyChair = babyChair;
    }

    public boolean isBabyChair() {
        return babyChair;
    }

    public void setBabyChair(boolean babyChair) {
        this.babyChair = babyChair;
    }

    @Override
    public String toString() {
        return "LightCar{" + getBrand() + getModel() +
                "babyChair=" + babyChair +
                '}';
    }
}
