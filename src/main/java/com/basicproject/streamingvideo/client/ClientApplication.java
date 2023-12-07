package com.basicproject.streamingvideo.client;

import com.basicproject.streamingvideo.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("/com/basicproject/streamingvideo/client.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Client");
        stage.setScene(scene);
        stage.show();
    }
}
