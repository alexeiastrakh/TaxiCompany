package com.solvd.taxiCompany;

import com.solvd.taxiCompany.exception.PassengersNotFoundException;
import com.solvd.taxiCompany.interfaces.IDriver;
import org.apache.log4j.Logger;

import java.util.ArrayList;


public class Driver extends Employee implements IDriver {
    protected static final Logger LOGGER = Logger.getLogger(Driver.class);
    private License license;
    Order order;
    ArrayList<Passenger> passengers = new ArrayList<>();

    public Driver() {
    }

    public Driver(License license, String name, String surname) {
        super(name, surname);
        this.license = license;
        passengers.add(order.getPassenger());
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public License getLicense() {
        return license;
    }

    public void showPassengers() {
        if (passengers.size() == 0) {
            throw new PassengersNotFoundException("Can't find passengers");

        } else {
            passengers.stream().forEach(e -> LOGGER.info("Passengers" + ":\n" + e));

        }

    }


    @Override
    public void drive() {

    }
}
