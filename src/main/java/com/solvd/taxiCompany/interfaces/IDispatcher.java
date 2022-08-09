package com.solvd.taxiCompany.interfaces;

import com.solvd.taxiCompany.Car;
import com.solvd.taxiCompany.exception.ZeroDistanceException;

public interface IDispatcher {
    void takeOrder();
    void sendOrder();
    double CalculatePrice(Car car, double distance) throws ZeroDistanceException;
    double CalculateDuration(Car car, double distance) throws ZeroDistanceException;

}
