module com.basicproject.streamingvideo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires com.dlsc.formsfx;

    opens com.basicproject.streamingvideo to javafx.fxml;
    exports com.basicproject.streamingvideo;
    exports com.basicproject.streamingvideo.auth;
    exports com.basicproject.streamingvideo.client;
}