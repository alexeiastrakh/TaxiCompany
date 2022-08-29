package com.solvd.taxiCompany;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import com.solvd.taxiCompany.interfaces.IDispatcher;
import com.solvd.taxiCompany.exception.ZeroDistanceException;





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
        LOGGER.info("Highest price: " + highestPrice);
        return highestPrice;
    }

    @Override
    public double CalculatePrice(Car car, double distance, int carType) throws ZeroDistanceException {
        if (distance <= 0) {
            throw new ZeroDistanceException();
        }
        switch (carType) {
            case (1):
                return distance * 9;
            case (2):
                if (((LightCar) car).isBabyChair()) {
                    return (distance * 8) + 60;
                }
            case (3):
                if (((Limousine) car).isTV() && ((Limousine) car).isBar()) {
                    return (distance * 13) + 310;
                }
                if (((Limousine) car).isBar()) {
                    return (distance * 13) + 170;
                }
                if (((Limousine) car).isTV()) {
                    return (distance * 13) + 140;
                }
                return distance * 13;

            case (4):

                if (((Limousine) car).isTV() && ((Limousine) car).isBar()) {
                    return (distance * 13) + 310;
                }
                if (((Limousine) car).isBar()) {
                    return (distance * 13) + 170;
                }
                if (((Limousine) car).isTV()) {
                    return (distance * 13) + 140;
                }
                return distance * 13;
        }
                return 0;

    }



    @Override
    public double CalculateDuration(Car car, double distance,int carType) throws ZeroDistanceException {
        if (distance <= 0) {
            throw new ZeroDistanceException();
        }
        switch (carType){
            case (1) : return distance / 30;
            case (2) : return distance / 50;
            case (3) : return  distance / 40;
        }
        return 0;
    }

    @Override
    public String toString() {
        return  getFirstName()+" "+getLastName()
                ;
    }
    public void isEmpty(String string){
        if(StringUtils.isEmpty(string)) { throw new IllegalArgumentException("This field cannot be empty");}
    }
}

