package com.solvd.taxiCompany.utils;

import com.solvd.taxiCompany.*;

import java.util.ArrayList;

public class CarUtil {
    public static ArrayList<Car> createCars() {
        ArrayList<Car> cars = new ArrayList<>();
        CargoTaxi minivan = new CargoTaxi("Ford","Ford Galaxy",4615);
        Limousine limousine = new Limousine("Mercedes-benz","MERCEDES-BENZ S-600 PULLMAN",false,true);
        LightCar standard = new LightCar("Renault","Renault Logan",false);
        cars.add(minivan);
        cars.add(limousine);
        cars.add(standard);
        return cars;
    }
}
