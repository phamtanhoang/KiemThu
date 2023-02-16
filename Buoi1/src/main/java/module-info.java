module com.mycompany.buoi1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.buoi1 to javafx.fxml;
    exports com.mycompany.buoi1;
}
