package com.solvd.taxiCompany;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class UncarriedPassengers implements Runnable {
    protected static final Logger LOGGER = LogManager.getLogger(UncarriedPassengers.class);
    private int numberOfUncarriedPassengers = 0;

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        numberOfUncarriedPassengers++;
    }

    public void decrement() {
        numberOfUncarriedPassengers--;
    }

    public int getValue() {
        return numberOfUncarriedPassengers;
    }

    @Override
    public void run() {
        synchronized (this) {

            this.increment();
            LOGGER.info("Picked up passengers " + Thread.currentThread().getName() + " " + this.getValue());
            this.decrement();
            LOGGER.info(("Took the passengers" + Thread.currentThread().getName() + " " + this.getValue()));
        }
    }
}