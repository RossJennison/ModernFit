module com.example.modernfit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modernfit to javafx.fxml;
    exports com.example.modernfit;
}