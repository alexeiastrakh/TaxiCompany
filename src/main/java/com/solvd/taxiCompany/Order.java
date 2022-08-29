package com.solvd.taxiCompany;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.solvd.taxiCompany.exception.ZeroDistanceException;

public class Order {

    protected static final Logger LOGGER = LogManager.getLogger(Order.class);
    private Passenger passenger;
    private String destination;
    private String startPoint;
    private int duration;
    private double distance;
    private double price;
    private Dispatcher dispatcher;
    private Taxi taxi;


    public Order() {
    }

    public Order(Passenger passenger, String destination, String startPoint, double distance, Dispatcher dispatcher, Taxi taxi) {
        this.passenger = passenger;
        LOGGER.info("Information about your order:");
        this.destination = destination;
        LOGGER.info("You are going to " + destination);
        this.distance = distance;
        this.startPoint = startPoint;
        LOGGER.info("You are coming from " + startPoint);
        this.dispatcher = dispatcher;
        LOGGER.info("Your dispatcher: " + dispatcher);
        this.taxi = taxi;
        LOGGER.info("Your taxi: " + taxi);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration() throws ZeroDistanceException {

        LOGGER.info("Duration trip = " + duration + " hour");
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice() throws ZeroDistanceException {

        LOGGER.info("Trip price = " + price);
        this.price = price;
        return 0;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public com.solvd.taxiCompany.Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(com.solvd.taxiCompany.Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }


    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

}
