package com.solvd.taxiCompany.interfaces;

import com.solvd.taxiCompany.Taxi;

import java.util.ArrayList;

@FunctionalInterface
public interface ITaxiUtil<Taxi> {
    public Taxi filterTaxiByCar(ArrayList<Taxi> taxi);
}
