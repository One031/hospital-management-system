package com.admin.hospitalmanagementsystem;

/** * * 
 * 
 * 
  @author Oné Taboshe
  student number: CON-1469563-H6J5
 */

import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author oneaz
 */
public class MainController {

    @FXML
     private ListView<String> listView;
    @FXML
    private TextField txt;
    
     private Patients[]  patientList = new Patients[8];
    
    
    public void initialize() {
       
        
        
        patientList[0] = new Patients("Gomolemo", "Bokaba", 25, "Type 2 diabetes");
        patientList[1] = new Patients("Thapelo", "Gama", 30, "Allergies to penicillin");
        patientList[2] = new Patients("John", "Smith", 22, "No significant medical history");
        patientList[3] = new Patients("Alice", "Botha", 33, "Allergies to penicillin");
        patientList[4] = new Patients("Karabo", "Molefe", 23, "Type 2 diabetes");
        patientList[5] = new Patients("Elsa", "Bella", 34, "No significant medical history");
        patientList[6] = new Patients("Lerato", "Nkosi", 35, "Hypertension");
        patientList[7] = new Patients("Venod", "Pillay", 44, "Allergies to penicillin");
        
       
        showPatients();
       
        
    }
    
    public void btnSortName(ActionEvent e) {
        Arrays.sort(patientList, (p1, p2)->
        p1.getFirstName().compareTo(p2.getFirstName()));
        showPatients();
    }
    
    public void btnSortAge(ActionEvent e) {
        Arrays.sort(patientList, (Patients p1, Patients p2) ->
        {
            return Integer.compare(p1.getAge(), p2.getAge());
        });
        showPatients();
    }
    
    public void btnSearch(ActionEvent e) {
        String search = txt.getText().trim();
       
            for (Patients patient : patientList) {
                if (patient.getFirstName().equalsIgnoreCase(search)) {
                    listView.getItems().clear();
                    
                    listView.getItems().add(patient.toString());
                }
            }
     
    }
    
    private void showPatients() {
        listView.getItems().clear();
        
        for(Patients patient : patientList) {
            
                listView.getItems().add(patient.toString());
            
            
        }
    }

}

