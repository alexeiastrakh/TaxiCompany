package com.solvd.taxiCompany.utils;

import com.solvd.taxiCompany.Car;
import com.solvd.taxiCompany.Dispatcher;
import com.solvd.taxiCompany.Driver;
import com.solvd.taxiCompany.Taxi;

import java.util.ArrayList;

public class TaxiUtil {
    public static ArrayList<Taxi> createTaxi() {
        ArrayList<Taxi> taxi = new ArrayList<>();
        Driver driver = DriverUtil.createDrivers().get(0);
        Driver driver1 = DriverUtil.createDrivers().get(1);
        Car car = CarUtil.createCars().get(0);
        Car car1 = CarUtil.createCars().get(1);


        Taxi taxi1= new Taxi(car,driver);
        Taxi taxi2= new Taxi(car1,driver1);
        taxi.add(taxi1);
        taxi.add(taxi2);

        return taxi;
    }
}
