package com.admin.hospitalmanagementsystem;

/**
 * App class serves as the entry point for the JavaFX application.
 * It sets up the primary stage and loads the main user interface from an FXML file.
 * 
 * Author: Oné Taboshe
 * Student Number: CON-1469563-H6J5
 */

import javafx.application.Application;     // Base class for JavaFX applications.
import javafx.fxml.FXMLLoader;             // Loads an object hierarchy from an FXML document.
import javafx.scene.Parent;                // Base class for all nodes that have children in the scene graph.
import javafx.scene.Scene;                 // Represents the container for all content in a scene graph.
import javafx.stage.Stage;                 // Represents the primary window of the application.

/**
 * The App class extends JavaFX's Application class, which provides the necessary framework
 * for launching a JavaFX application. It overrides the start method to set up the user interface.
 */
public class App extends Application {

    /**
     * The start method is the main entry point for all JavaFX applications.
     * It is called after the init method has returned, and after the system is ready
     * for the application to begin running.
     *
     * @param stage The primary stage for this application, onto which
     *              the application scene can be set.
     * @throws Exception If the FXML file cannot be loaded.
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file that defines the user interface.
        // The FXML file should be located in the same package as this App class.
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        
        // Create a new Scene with the loaded FXML root node.
        // The dimensions of the scene are set to 550 pixels wide and 350 pixels high.
        Scene scene = new Scene(root, 550, 350);
        
        // Set the title of the primary stage (window) to "Search and Sort App".
        stage.setTitle("Search and Sort App");
        
        // Set the scene for the stage to the one we just created.
        stage.setScene(scene);
        
        // Display the stage to the user.
        stage.show();
    }
    
    /**
     * The main method is ignored in JavaFX applications.
     * It serves as a fallback in case the application is launched in a way that bypasses JavaFX's launch mechanism.
     *
     * @param args The command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        // Launch the JavaFX application by calling the launch method inherited from Application.
        launch(args);
    }

}
