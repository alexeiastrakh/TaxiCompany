package com.solvd.taxiCompany.utils;

import com.solvd.taxiCompany.Driver;
import com.solvd.taxiCompany.Passenger;

import java.util.ArrayList;

public class DriverUtil {

    public static ArrayList<Driver> createDrivers() {
        ArrayList<Driver> drivers = new ArrayList<>();
        Driver driver = new Driver("James","Bond");
        Driver driver1 = new Driver("Elon","Musk");
        drivers.add(driver);
        drivers.add(driver1);
        return drivers;
    }
}
