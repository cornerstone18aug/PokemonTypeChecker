package contoller;

import dao.PokemonDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        pdao.search(inputName);


        // write code to change view


        pokeImg = new Image("sample1.png");

        weekLabelImg1 = new Image("samplelabel1.png");
        weekLabelImg2 = new Image("samplelabel2.png");


        pokemonImage.setImage(pokeImg);

        label1.setImage(weekLabelImg1);
        label2.setImage(weekLabelImg2);

        List<String> nameAll = pdao.allName();
        for (String pokeName: nameAll) {
            pokemonList.getItems().add(pokeName);
        }
    }


}
