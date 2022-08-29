package com.solvd.taxiCompany.interfaces;

import com.solvd.taxiCompany.Car;
import com.solvd.taxiCompany.exception.ZeroDistanceException;

public interface IDispatcher {

    double CalculatePrice(Car car, double distance,int carType) throws ZeroDistanceException;
    double CalculateDuration(Car car, double distance,int carType) throws ZeroDistanceException;

}
