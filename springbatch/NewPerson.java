package com.example.springbatch;


public class NewPerson {
    private int id;
    private String name;
    private String designation;
    private String dateOfBirth;
    private long age;

    public NewPerson() {
    }

    public NewPerson(int id, String name, String designation, String dateOfBirth, long age) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
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

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
