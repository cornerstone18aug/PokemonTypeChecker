package contoller;

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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
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
    void onSearchButton(ActionEvent event) {

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
                display(pokemon);
                printWeaknessTypes(pokemon);
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
                    printWeaknessTypes(pokemon);
                }
            }
        }
    }
// add Enter function
  @FXML
  void onEnter(ActionEvent event) {
      String inputName = searchName.getText();

      if(inputName.equals("")) {
        System.out.println("It's Empty");
      } else {
        pokemon = pdao.search(inputName);
        if(pokemon.getId() == 0) {
          System.out.println("It's Invalid Name");
        } else {
          display(pokemon);
          printWeaknessTypes(pokemon);
          }
        }
      }

  @FXML
  void onEnterList(KeyEvent event) {
    boolean pushedEnter = event.getCode().equals(KeyCode.ENTER);
    if (pushedEnter) {
      // show name in the TextField when push the enter key
      String selectedItem = pokemonList.getSelectionModel().getSelectedItem();
      System.out.println(selectedItem);

      if(selectedItem.equals("")) {
        System.out.println("It's Empty");
      } else {
        pokemon =  pdao.search(selectedItem);
        if(pokemon.getId() == 0) {
          System.out.println("It's Empty");
        } else {
           searchName.setText(selectedItem);
          display(pokemon);
          printWeaknessTypes(pokemon);
        }
      }
    }

  }


  @FXML
    void onRoarButtonclick(ActionEvent event) {
        play_audio();
    }

    public void play_audio() {
        AudioClip note = new AudioClip("file:src/sound/bulbasaur.wav");
        note.play();
    }

    public void display(Pokemon displayPokemon) {
        Image bodyImg = new Image(displayPokemon.getImage());

        int displayPokemonId;
        displayPokemonId = displayPokemon.getId();

        String displayPokemonName;
        displayPokemonName = displayPokemon.getName();


        // check pokemon original type
        Image typeImg1 = new Image(typeImageURL(displayPokemon.getType1()));
        System.out.println(typeImageURL(displayPokemon.getType1()));
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

    public void printWeaknessTypes(Pokemon pokemon) {
       Map<String, Double> weakness = TypeCheckArray.weaknesses(pokemon.getType1(), pokemon.getType2());
        System.out.println(pokemon.getType2());
        for(Map.Entry<String, Double> weakenesses : weakness.entrySet()) {
            if(weakenesses.getValue().equals(4.0)) {
                Image weaknessType = new Image(typeImageURL(weakenesses.getKey()));
                label1.setImage(weaknessType);
            }
        }
    }

    public String typeImageURL(String type) {
        String imageUrl;
        switch (type) {
            case "1":
            case "Normal":
                imageUrl = "img/nomal.png";
                break;
            case "2":
            case "Grass":
                imageUrl = "img/grass.png";
                break;
            case "3":
            case "Water":
                imageUrl = "img/water.png";
                break;
            case "4":
            case "Fire":
                imageUrl = "img/fire.png";
                break;
            case "5":
            case "Electric":
                imageUrl = "img/electric.png";
                break;
            case "6":
            case "Fighting":
                imageUrl = "img/fighting.png";
                break;
            case "7":
            case "Flying":
                imageUrl = "img/flying.png";
                break;
            case "8":
            case "Ground":
                imageUrl = "img/ground.png";
                break;
            case "9":
            case "Rock":
                imageUrl = "img/rock.png";
                break;
            case "10":
            case "Dark":
                imageUrl = "img/dark.png";
                break;
            case "11":
            case "Ghost":
                imageUrl = "img/ghost.png";
                break;
            case "12":
            case "Bug":
                imageUrl = "img/bug.png";
                break;
            case "13":
            case "Dragon":
                imageUrl = "img/dragon.png";
                break;
            case "14":
            case "Ice":
                imageUrl = "img/ice.png";
                break;
            case "15":
            case "Steel":
                imageUrl = "img/steel.png";
                break;
            case "16":
            case "Fairy":
                imageUrl = "img/fairy.png";
                break;
            case "17":
            case "Poison":
                imageUrl = "img/poison.png";
                break;
            case "18":
            case "Phychic":
                imageUrl = "img/phychic.png";
                break;
            default:
                imageUrl = null;
        }
        return imageUrl;
    }



}
