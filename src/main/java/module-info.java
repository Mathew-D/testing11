module dusome {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens dusome.testing11 to javafx.fxml;
    exports dusome.testing11;
}