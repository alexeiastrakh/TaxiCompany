package com.solvd.taxiCompany.utils;

import java.util.ArrayList;
import com.solvd.taxiCompany.Driver;




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
