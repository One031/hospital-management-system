module com.admin.hospitalmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.admin.hospitalmanagementsystem to javafx.fxml;
    exports com.admin.hospitalmanagementsystem;
}
