package com.solvd.taxiCompany;

import com.solvd.taxiCompany.exception.ZeroDistanceException;
import com.solvd.taxiCompany.interfaces.IDispatcher;

public class Dispatcher extends Employee implements IDispatcher {


    public Dispatcher() {
    }

    public Dispatcher(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    public void takeOrder() {

    }

    @Override
    public void sendOrder() {

    }

    public double CalculatePrice(Car car, double distance) throws ZeroDistanceException {
        if (distance <= 0) {
            throw new ZeroDistanceException();
        }
        if (car instanceof CargoTaxi)
        {
            return distance * 9;

        }

        if (car instanceof LightCar)
        {
            if (((LightCar) car).isBabyChair()){
                return (distance * 8)+60;
            }
            return distance * 8;
        }
        if (car instanceof Limousine) ;
        {
           if(((Limousine) car).isTV()&&((Limousine) car).isBar()){
               return (distance * 13)+310;
           }
            if(((Limousine) car).isBar()){
               return (distance * 13)+170;
           }
            if(((Limousine) car).isTV()){
               return (distance * 13)+140;
           }
            return distance * 13;
        }
    }
    public double CalculateDuration(Car car, double distance) throws ZeroDistanceException {
        if (distance <= 0) {
            throw new ZeroDistanceException();
        }
        if (car instanceof CargoTaxi)
        {

            return distance / 30;
        }

        if (car instanceof LightCar)
        {

            return distance / 40;
        }
        if (car instanceof Limousine) ;
        {

            return  distance / 30;
        }
    }

    @Override
    public String toString() {
        return  getFirstName()+" "+getLastName()
                ;
    }
}

