package com.company;

import java.io.Serial;
import java.io.Serializable;

public class PersonData implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private Integer yearOfBirth;
    private String address;

    public PersonData(String firstName, String lastName, Integer yearOfBirth, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
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

    public Integer getDiplomacyInfo() {
        return yearOfBirth;
    }

    public void setDiplomacyInfo(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\"firstName\": " + '"' + firstName + '"' +
                ", \n\t\"lastName\": " + '"' + lastName + '"' +
                ", \n\t\"yearOfBirth\": " + '"' + yearOfBirth.toString() + '"' +
                ", \n\t\"address\": " + '"' + address + '"' +
                "\n}";
    }
}

