package contoller;

import dao.PokemonDAO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import model.Pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by katayama on 2018/11/20.
 */
public class PokemonContoller {


    @FXML
    private TextField searchName;

    @FXML
    private ListView<String> pokemonList;


    @FXML
    private ImageView pokemonImage;

    @FXML
    private ImageView label1;

    @FXML
    private ImageView label2;




    Pokemon pokemon;
    PokemonDAO pdao = new PokemonDAO();
    Image pokeImg;
    Image weekLabelImg1;
    Image weekLabelImg2;

//    public Pokemon search(String inputName) {
//        pokemon = pdao.search(inputName);
//        return pokemon;
//    }


    @FXML
    void onSerchButton(ActionEvent event) {

        // get text from user input in search box
        String inputName = searchName.getText();

        // search name from Database
        /////////
        pokemon = pdao.search(inputName);

        // write code to change view

        display(pokemon);


        weekLabelImg1 = new Image("samplelabel1.png");
        weekLabelImg2 = new Image("samplelabel2.png");


        pokemonImage.setImage(pokeImg);

        label1.setImage(weekLabelImg1);
        label2.setImage(weekLabelImg2);

        // display pokemon Name in ListView
        List<String> nameAll = pdao.allName();
        ObservableList<String> items = FXCollections.observableArrayList(nameAll);
        pokemonList.setItems(items);
        System.out.println(items);
    }

    @FXML
    void selectName(MouseEvent event) {
        boolean doubleClicked = event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2;
        if (doubleClicked) {
            // write code when name double is double-clicked in ListView
            String selectedItem = pokemonList.getSelectionModel().getSelectedItem();
            System.out.println(selectedItem);

            pokemon =  pdao.search(selectedItem);
            display(pokemon);
        }
    }

    public void display(Pokemon dispalyPokemon) {
        pokeImg = new Image(dispalyPokemon.getImage());
        pokemonImage.setImage(pokeImg);
    }



}
