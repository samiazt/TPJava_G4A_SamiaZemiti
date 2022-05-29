module com.edyu.new_rpg {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.isep to javafx.fxml;
    exports com.isep;
    exports com.isep.rpg;
    opens com.isep.rpg to javafx.fxml;
}