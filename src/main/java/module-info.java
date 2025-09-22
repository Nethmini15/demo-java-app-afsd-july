module org.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demofx to javafx.fxml;
    exports org.example.demofx;
    exports org.example.demofx.controller;
    opens org.example.demofx.controller to javafx.fxml;
}