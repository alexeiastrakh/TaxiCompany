package com.solvd.taxiCompany;



public class TaxiDriver {

    String name;
    public TaxiDriver() {
    }

    public TaxiDriver( String name) {

        this.name = name;
    }



    public void tookPassengers(TaxiDriver taxiDriver) {
        synchronized (this) {
            System.out.println(this.name + " - TAXI DRIVER ");
            taxiDriver.pickUpPassengers(this);
        }
        // }
    }

    public void pickUpPassengers(TaxiDriver taxiDriver) {
       synchronized (this) {

            System.out.println(this.name + " - PASSENGER ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}