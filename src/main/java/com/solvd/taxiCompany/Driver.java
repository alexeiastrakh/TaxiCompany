package com.solvd.taxiCompany;

import com.solvd.taxiCompany.exception.PassengersNotFoundException;
import com.solvd.taxiCompany.interfaces.IDriver;
import org.apache.log4j.Logger;


import java.util.ArrayList;
import java.util.Collection;


public class Driver extends Employee implements IDriver {
    protected static final Logger LOGGER = Logger.getLogger(Driver.class);
    private License license;
    Order order;
    ArrayList<String> passengers = new ArrayList<>();
    public Driver() {
    }
    public Driver(String name, String surname) {
        super(name, surname);


    }
    public void setLicense(License license) {
        this.license = license;
    }
    public License getLicense() {
        return license;
    }
    @Override
    public void showPassengers(Passenger passenger) {
        passengers.add(passenger.getLastName());
        if (passengers.size() == 0) {
            throw new PassengersNotFoundException("Can't find passengers");

        } else {
            LOGGER.info("I am a driver "+getFirstName()+" "+getLastName()+" and today I took such passengers");
            passengers.stream().forEach(p -> LOGGER.info("Passenger : "  + p));
        }

    }
    @Override
    public String toString() {
        return "Driver{" +getFirstName()+" "+getLastName()+
                ", license category-" + license.getLicenseCategory() +
                '}';
    }




}
