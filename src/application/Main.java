package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws IOException {

        Main.primaryStage = primaryStage;
        changeView("start.fxml");
        Main.primaryStage.show();
        Main.primaryStage.setMinWidth(720);
        Main.primaryStage.setMinHeight(600);
        Main.primaryStage.setMaxWidth(720);
        Main.primaryStage.setMaxHeight(600);

    }
    public static void main(String[] args) {
        launch(args);
    }

    public void changeView(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            root.getStylesheets().add("https://fonts.googleapis.com/css?family=Press+Start+2P");
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
