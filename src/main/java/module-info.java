module com.example.desafiopoojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiopoojava to javafx.fxml;
    exports com.example.desafiopoojava;
}