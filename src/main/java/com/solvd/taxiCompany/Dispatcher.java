package com.solvd.taxiCompany;

import com.solvd.taxiCompany.exception.ZeroDistanceException;
import com.solvd.taxiCompany.interfaces.IDispatcher;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher extends Employee implements IDispatcher {

    protected static final Logger LOGGER = Logger.getLogger(Dispatcher.class);
    List<Double> prices = new ArrayList<>();
    public Dispatcher() {
    }

    public Dispatcher(String firstName, String lastName) {
        super(firstName, lastName);

    }



    public <T> T getHighestPrice(Order order) {
        prices.add((order.getPrice()));
       T highestPrice = (T) prices.stream().max(Double::compare).get();
       LOGGER.info("Highest price: "+highestPrice);
       return highestPrice;
    }
    @Override
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

    @Override
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

