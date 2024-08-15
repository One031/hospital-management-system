package com.admin.hospitalmanagementsystem;

/** * * 
 * 
 * 
  @author Oné Taboshe
  student number: CON-1469563-H6J5
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
   public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
       Scene scene = new Scene(root, 550, 350);
       stage.setTitle("Search and Sort App");
       stage.setScene(scene);
       stage.show();
      
   }
   
    public static void main(String[] args) {
        launch(args);
    }

}