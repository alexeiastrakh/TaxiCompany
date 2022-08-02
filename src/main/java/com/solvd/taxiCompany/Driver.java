package com.solvd.taxiCompany;

public class Driver extends Employee {
    private License license;

    public Driver() {
    }

    public Driver(License license, String name, String surname) {
        super(name, surname);
        this.license = license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public License getLicense() {
        return license;
    }

}
