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
//        Parent root = FXMLLoader.load(getClass().getResource("samplepoke.fxml"));
//        primaryStage.setScene(new Scene(root));
//        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
//        root.getStylesheets().add("https://fonts.googleapis.com/css?family=Press+Start+2P");
//        primaryStage.show();
        Main.primaryStage = primaryStage;
        changeView("start.fxml");
        Main.primaryStage.show();
//        Parent root = FXMLLoader.load(getClass().getResource("samplepoke.fxml"));
//        primaryStage.setScene(new Scene(root));
//        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
//        root.getStylesheets().add("https://fonts.googleapis.com/css?family=Press+Start+2P");

//        HBox hbox = new HBox();
//        hbox.setAlignment(Pos.CENTER);
//
//        Button button = new Button("Button");
//        Label label = new Label("Enter Pokemon Name");
//        TextField textField = new TextField();
//
//        button.setOnAction((event) -> {
//            label.setText("");
//            pokemon = pokemonContoller.serch(textField.getText());
//            label.setText(
//                    pokemon.getName() + "\n" +
//                    pokemon.getImage() + "\n" +
//                    pokemon.getType1() + "\n" +
//                    pokemon.getType2() + "\n" +
//                    pokemon.getRoar());
//        });
//
//        hbox.getChildren().add(button);
//        hbox.getChildren().add(textField);
//        hbox.getChildren().add(label);
//
//        ((Group) scene.getRoot()).getChildren().add(hbox);

//        primaryStage.setTitle("Button Test");
//        primaryStage.setScene(scene);
//        primaryStage.show();
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
