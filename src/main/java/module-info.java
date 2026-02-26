module com.example.lab2_f {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.lab2_f to javafx.fxml;
    exports com.example.lab2_f;
}