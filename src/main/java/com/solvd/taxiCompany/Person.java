package com.solvd.taxiCompany;

import com.solvd.taxiCompany.exception.IncorrectNameException;

import java.time.LocalDate;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;



    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) throws IncorrectNameException {
        if (firstName.isEmpty()) {
            throw new IncorrectNameException("First name can't be empty");
        } else {
            this.firstName = firstName;
        }
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) throws IncorrectNameException {
        if (lastName.isEmpty()) {
            throw new IncorrectNameException("First name can't be empty");
        } else {
            this.lastName = lastName;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String telNumber) {
        this.phoneNumber = telNumber;
    }


}
