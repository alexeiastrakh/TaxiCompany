package com.solvd.taxiCompany;

public class Order {

    private Passenger passenger;
    private int destination;
    private double distance;
    private double amount;
    private Dispatcher dispatcher;
    private Tariff tariff;
    private Taxi taxi;

    public Order() { }

    public Order(Passenger passenger,int destination,double distance, double amount,Dispatcher dispatcher,Tariff tariff,Taxi taxi) {
        this.passenger = passenger;
        this.destination = destination;
        this.distance = distance;
        this.amount = amount;
        this.dispatcher = dispatcher;
        this.tariff = tariff;
        this.taxi = taxi;
    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }



    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }



    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }



    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



    public com.solvd.taxiCompany.Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(com.solvd.taxiCompany.Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }


    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }



    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }



}
