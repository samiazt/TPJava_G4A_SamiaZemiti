module com.edyu.new_rpg {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.rpglite to javafx.fxml;
    exports com.rpglite;
    exports com.rpglite.utils;
    opens com.rpglite.utils to javafx.fxml;
}