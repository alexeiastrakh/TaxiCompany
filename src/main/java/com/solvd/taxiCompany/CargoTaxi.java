package com.solvd.taxiCompany;

import com.solvd.taxiCompany.exception.ZeroLengthBodyCargoTaxiException;


public class CargoTaxi extends Car{
    private int length;


    public CargoTaxi() {
    }

    public CargoTaxi( String brand, String model, int length) {
        super( brand, model);
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) throws ZeroLengthBodyCargoTaxiException {
        if (length >= 0) {
            this.length = length;
        } else {
            throw new ZeroLengthBodyCargoTaxiException("Length can't be less than zero");
        }

    }


    @Override
    public String toString() {
        return "CargoTaxi{" +getBrand()+getModel()+
                "length=" + length +
                '}';
    }
}
