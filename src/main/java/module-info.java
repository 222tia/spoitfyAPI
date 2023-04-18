module edu.bsu.spotifyapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.bsu.spotifyapi to javafx.fxml;
    exports edu.bsu.spotifyapi;
}