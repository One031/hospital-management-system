package com.admin.hospitalmanagementsystem;
public class Patients {
    private String firstName;
    private String lastName;
    private String condition;
    private int Age;
    public Patients() {}

    public Patients(String firstName, String lastName, int Age, String condition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.condition = condition;
        this.Age = Age;
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " "+ "(" + Age + ")" + " " + condition;
    }
    
}
