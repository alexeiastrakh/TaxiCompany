package com.solvd.taxiCompany;

import java.time.LocalDate;

public abstract class Employee extends Person {

    private double salary;
    private LocalDate startDate;

    public Employee() {

    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);

    }

    public Employee(String firstName, String lastName, LocalDate startDate) {
        super(firstName, lastName);
        this.startDate = startDate;

    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
