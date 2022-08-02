package com.solvd.taxiCompany;

public class Tariff {

    private String description ;
    private double pricePerKilometer ;
    private int bonus;
    private int bonusDriver;

    public Tariff() {
    }

    public Tariff(String description,double pricePerKilometer,int bonus,int bonusDriver) {
        this.description = description;
        this.pricePerKilometer = pricePerKilometer;
        this.bonus = bonus;
        this.bonusDriver = bonusDriver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public double getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setPricePerKilometer(double pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }



    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }



    public int getBonusDriver() {
        return bonusDriver;
    }

    public void setBonusDriver(int bonusDriver) {
        this.bonusDriver = bonusDriver;
    }





}
