module com.example.tarea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea to javafx.fxml;
    exports com.example.tarea;
}