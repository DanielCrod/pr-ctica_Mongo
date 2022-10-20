module com.mycompany.practica_obligatoria_mongo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.practica_obligatoria_mongo to javafx.fxml;
    exports com.mycompany.practica_obligatoria_mongo;
}
