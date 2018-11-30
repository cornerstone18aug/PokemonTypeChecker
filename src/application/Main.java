package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("samplepoke.fxml"));
        primaryStage.setScene(new Scene(root));
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        root.getStylesheets().add("https://fonts.googleapis.com/css?family=Press+Start+2P");
        primaryStage.show();
        primaryStage.setMinWidth(680);
        primaryStage.setMinHeight(600);
        primaryStage.setMaxWidth(680);
        primaryStage.setMaxHeight(600);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
