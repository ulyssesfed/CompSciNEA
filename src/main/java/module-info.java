module com.example.compscinea {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.datatransfer;
    requires java.desktop;

    opens com.example.compscinea to javafx.fxml;
    exports com.example.compscinea;
}