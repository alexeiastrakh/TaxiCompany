package com.solvd.taxiCompany;

public class Taxi {

    private Car car;
    private Driver driver;

    public Taxi() {
    }

    public Taxi(Car car,Driver driver) {
        this.car = car;
        this.driver = driver;
    }
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
