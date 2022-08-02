package com.solvd.taxiCompany;

public class Dispatcher extends Employee{
    private int countOfOrders;

    public Dispatcher (){}
    public Dispatcher (String firstName, String lastName, int id, int countOfOrders) {
        super(firstName, lastName);
        this.countOfOrders = countOfOrders;
    }
    public int getCountOfOrders() {
        return countOfOrders;
    }

    public void setCountOfOrders(int countOfOrders) {
        this.countOfOrders = countOfOrders;
    }
}
