module com.example.manageme {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.manageme to javafx.fxml;
    exports com.example.manageme;
}