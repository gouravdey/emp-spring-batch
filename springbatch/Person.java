package com.example.springbatch;

public class Person {
    private int id;
    private String name;
    private String designation;
    private String dateOfBirth;

    public Person(int id, String name, String designation, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
