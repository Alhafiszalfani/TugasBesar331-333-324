module com.example.libaryfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.libaryfx to javafx.fxml;
    exports com.example.libaryfx;
}