package com.solvd.taxiCompany;


import com.solvd.taxiCompany.interfaces.IPassenger;
import org.apache.log4j.Logger;

public class Passenger extends Person implements IPassenger {


    public Passenger() {
    }
    public Passenger(String firstName, String lastName)  {
        super(firstName, lastName);

    }
    @Override
    public void makeOrder() {

    }
}
