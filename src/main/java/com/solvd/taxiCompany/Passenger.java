package com.solvd.taxiCompany;

import java.time.LocalDate;

public class Passenger extends Person{


    private int countOfTrips;

    public Passenger() {
    }

    public Passenger(String firstName, String lastName, LocalDate birthDate, int countOfTrips) {
        super(firstName, lastName, birthDate);
        this.countOfTrips = countOfTrips;
    }
    public int getCountOfTrips() {
        return countOfTrips;
    }

    public void setCountOfTrips(int countOfTrips) {
        this.countOfTrips = countOfTrips;
    }
}
