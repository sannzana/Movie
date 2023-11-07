module com.example.tesst {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tesst to javafx.fxml;
    exports com.example.tesst;
}