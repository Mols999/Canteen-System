module com.example.canteensystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.canteensystem to javafx.fxml;
    exports com.example.canteensystem;
}