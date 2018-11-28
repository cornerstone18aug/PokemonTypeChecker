package contoller;

import com.sun.glass.ui.CommonDialogs;
import dao.PokemonDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import model.Pokemon;
import typeChecker.TypeCheckArray;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by katayama on 2018/11/20.
 */
public class PokemonContoller implements Initializable {


    @FXML
    private TextField searchName;

    @FXML
    private ListView<String> pokemonList;

    @FXML
    private ImageView pokemonImage;

    @FXML
    private Label pokemonIdTag;

    @FXML
    private Label pokemonNameTag;

    @FXML
    private Button roarButton;

    @FXML
    private ImageView label1;

    @FXML
    private ImageView label2;

    @FXML
    private ImageView type_1Tag;

    @FXML
    private ImageView type_2Tag;


    private Pokemon pokemon;
    private PokemonDAO pdao = new PokemonDAO();
    private Image weekLabelImg1;
    private Image weekLabelImg2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // display pokemon Name in ListView
        List<String> nameAll = pdao.allName();
        ObservableList<String> items = FXCollections.observableArrayList(nameAll);
        pokemonList.setItems(items);
    }

    @FXML
    void onSerchButton(ActionEvent event) {

        // get text from user input in search box
        String inputName = searchName.getText();

        // search name from Database
        /////////

        if(inputName.equals("")) {
            System.out.println("It's Empty");
        } else {
            pokemon = pdao.search(inputName);
            if(pokemon.getId() == 0) {
                System.out.println("It's Empty");
            } else {
                // write code to change view
                // TODO: fix display method
                System.out.println("Not Empty");
                display(pokemon);
                printWeaknessTypes();

            }
        }
    }

    @FXML
    void selectName(MouseEvent event) {
        boolean doubleClicked = event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2;
        if (doubleClicked) {
            // write code when name double is double-clicked in ListView
            String selectedItem = pokemonList.getSelectionModel().getSelectedItem();
            System.out.println(selectedItem);

            if(selectedItem.equals("")) {
                System.out.println("It's Empty");
            } else {
                pokemon =  pdao.search(selectedItem);
                if(pokemon.getId() == 0) {
                    System.out.println("It's Empty");
                } else {
                    display(pokemon);

                }
            }
        }
    }

    @FXML
    void onRoarButtonclick(ActionEvent event) {

    }

    public void display(Pokemon displayPokemon) {
        Image bodyImg = new Image(displayPokemon.getImage());

        int displayPokemonId;
        displayPokemonId = displayPokemon.getId();

        String displayPokemonName;
        displayPokemonName = displayPokemon.getName();


        // check pokemon original type
        Image typeImg1 = new Image(typeImageURL(displayPokemon.getType1()));
        type_1Tag.setImage(typeImg1);
        if ((typeImageURL(displayPokemon.getType2())) == null) {
            type_2Tag.imageProperty().set(null);
        } else {
            Image typeImg2 = new Image(typeImageURL(displayPokemon.getType2()));
            type_2Tag.setImage(typeImg2);
        }

        pokemonIdTag.setText("NO." + displayPokemonId);
        pokemonNameTag.setText(displayPokemonName);
        pokemonImage.setImage(bodyImg);

    }

    public void printWeaknessTypes() {
        Map<String, Double> entry = TypeCheckArray.weaknesses("1", null);
        System.out.println(entry.keySet());
//        HashMap<Integer, String> n = new HashMap<>();
//        n.put(1, "Hi");
//        n.put(2, "Pokemon");
//        for (Map.Entry<Integer, String> entry : n.entrySet()) {
//            System.out.println(entry.getValue());
//        }
    }

    public String typeImageURL(String type) {
        String imageUrl;
        switch (type) {
            case "Normal":
                imageUrl = "img/nomal.png";
                break;
            case "Grass":
                imageUrl = "img/grass.png";
                break;
            case "Water":
                imageUrl = "img/water.png";
                break;
            case "Fire":
                imageUrl = "img/fire.png";
                break;
            case "Electric":
                imageUrl = "img/electric.png";
                break;
            case "Fighting":
                imageUrl = "img/fighting.png";
                break;
            case "Flying":
                imageUrl = "img/flying.png";
                break;
            case "Ground":
                imageUrl = "img/ground.png";
                break;
            case "Rock":
                imageUrl = "img/rock.png";
                break;
            case "Dark":
                imageUrl = "img/dark.png";
                break;
            case "Ghost":
                imageUrl = "img/ghost.png";
                break;
            case "Bug":
                imageUrl = "img/bug.png";
                break;
            case "Dragon":
                imageUrl = "img/dragon.png";
                break;
            case "Ice":
                imageUrl = "img/ice.png";
                break;
            case "Steel":
                imageUrl = "img/steel.png";
                break;
            case "Fairy":
                imageUrl = "img/fairy.png";
                break;
            case "Poison":
                imageUrl = "img/poison.png";
                break;
            case "Phychic":
                imageUrl = "img/phychic.png";
                break;
            default:
                imageUrl = null;
        }
        return imageUrl;
    }
}
