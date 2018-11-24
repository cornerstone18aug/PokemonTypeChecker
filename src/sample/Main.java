package sample;

import contoller.PokemonContoller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Pokemon;

public class Main extends Application {
    Pokemon pokemon = new Pokemon();
    PokemonContoller pokemonContoller = new PokemonContoller();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pokemon = pokemonContoller.serch("Pikachu");
        primaryStage.setTitle(pokemon.getImage());
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
