package com.kongzhong.mrpc.demo.model;

import java.io.Serializable;

public class FullName implements Serializable {
    private String firstName;
    private String lastName;

    public FullName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName(" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ')';
    }
}