package com.admin.hospitalmanagementsystem;

/**
 * MainController class handles the interaction between the view (UI) and the data (patients list).
 * 
 * Author: Oné Taboshe
 * Student Number: CON-1469563-H6J5
 */

import java.util.Arrays;                        // For sorting arrays.
import javafx.event.ActionEvent;                // For handling button events.
import javafx.fxml.FXML;                        // For linking FXML UI components to the controller.
import javafx.scene.control.ListView;           // UI component to display a list of patients.
import javafx.scene.control.TextField;          // UI component to accept user input.

/**
 * MainController is responsible for handling user input events and updating the view accordingly.
 */
public class MainController {

    // Linking the ListView UI component to display the list of patients.
    @FXML
    private ListView<String> listView;
    
    // TextField to accept user input for searching patients.
    @FXML
    private TextField txt;
    
    // Array to store patient objects, initialized with 8 patients.
    private Patients[] patientList = new Patients[8];
    
    /**
     * The initialize() method is called automatically when the controller is loaded.
     * It populates the patientList array and displays the patients in the ListView.
     */
    public void initialize() {
        // Initializing the array with 8 patient objects.
        patientList[0] = new Patients("Gomolemo", "Bokaba", 25, "Type 2 diabetes");
        patientList[1] = new Patients("Thapelo", "Gama", 30, "Allergies to penicillin");
        patientList[2] = new Patients("John", "Smith", 22, "No significant medical history");
        patientList[3] = new Patients("Alice", "Botha", 33, "Allergies to penicillin");
        patientList[4] = new Patients("Karabo", "Molefe", 23, "Type 2 diabetes");
        patientList[5] = new Patients("Elsa", "Bella", 34, "No significant medical history");
        patientList[6] = new Patients("Lerato", "Nkosi", 35, "Hypertension");
        patientList[7] = new Patients("Venod", "Pillay", 44, "Allergies to penicillin");
        
        // Displaying all the patients in the ListView by calling showPatients().
        showPatients();
    }
    
    /**
     * btnSortName() method is triggered when the sort-by-name button is clicked.
     * It sorts the patientList by first name in alphabetical order and updates the ListView.
     */
    public void btnSortName(ActionEvent e) {
        // Sorting the array based on the first name using the lambda expression.
        Arrays.sort(patientList, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        
        // Update the ListView after sorting.
        showPatients();
    }
    
    /**
     * btnSortAge() method is triggered when the sort-by-age button is clicked.
     * It sorts the patientList by age in ascending order and updates the ListView.
     */
    public void btnSortAge(ActionEvent e) {
        // Sorting the array based on age using Integer.compare().
        Arrays.sort(patientList, (Patients p1, Patients p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        
        // Update the ListView after sorting.
        showPatients();
    }
    
    /**
     * btnSearch() method is triggered when the search button is clicked.
     * It searches for a patient by their first name (case-insensitive) and displays the result.
     */
    public void btnSearch(ActionEvent e) {
        // Retrieve the text input from the search TextField.
        String search = txt.getText().trim();
        
        // Iterate through the patientList to find a matching first name (case-insensitive).
        for (Patients patient : patientList) {
            if (patient.getFirstName().equalsIgnoreCase(search)) {
                // Clear the ListView before displaying the search result.
                listView.getItems().clear();
                
                // Add the found patient's details to the ListView.
                listView.getItems().add(patient.toString());
            }
        }
    }
    
    /**
     * showPatients() method displays all patients in the ListView.
     * It clears the ListView and repopulates it with the current state of patientList.
     */
    private void showPatients() {
        // Clear any existing items in the ListView.
        listView.getItems().clear();
        
        // Iterate through the patientList and add each patient's details to the ListView.
        for (Patients patient : patientList) {
            listView.getItems().add(patient.toString());
        }
    }

}
