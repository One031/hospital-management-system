package com.admin.hospitalmanagementsystem;  // Defines the package where this class belongs.

public class Patients {
    // Private fields for the patient's first name, last name, medical condition, and age.
    private String firstName;
    private String lastName;
    private String condition;
    private int Age;
    
    // Default constructor (no-args constructor).
    public Patients() {}

    // Parameterized constructor to initialize all the fields when creating a new Patient object.
    public Patients(String firstName, String lastName, int Age, String condition) {
        this.firstName = firstName;    // Initialize firstName field with the passed value.
        this.lastName = lastName;      // Initialize lastName field with the passed value.
        this.condition = condition;    // Initialize condition field with the passed value.
        this.Age = Age;                // Initialize Age field with the passed value.
    }

    // Getter for firstName.
    public String getFirstName() {
        return firstName;
    }

    // Setter for firstName.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for lastName.
    public String getLastName() {
        return lastName;
    }

    // Setter for lastName.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for condition.
    public String getCondition() {
        return condition;
    }

    // Setter for condition.
    public void setCondition(String condition) {
        this.condition = condition;
    }

    // Getter for Age.
    public int getAge() {
        return Age;
    }

    // Setter for Age.
    public void setAge(int Age) {
        this.Age = Age;
    }

    // Overrides the default toString() method to provide a custom string representation of the Patient object.
    @Override
    public String toString() {
        // Returns a formatted string combining the patient's name, age, and condition.
        return firstName + " " + lastName + " " + "(" + Age + ")" + " " + condition;
    }
}
