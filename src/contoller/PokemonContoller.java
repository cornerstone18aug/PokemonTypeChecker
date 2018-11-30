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
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import model.Pokemon;
import typeChecker.TypeCheckArray;

import java.io.File;
import java.net.URL;
import java.util.*;

/**
 * Created by katayama on 2018/11/20.
 */
public class PokemonContoller implements Initializable {

    @FXML
    private TextField searchName;

    @FXML
    private AnchorPane background2;

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

    @FXML
    private ImageView fourTimeslabel1;
    @FXML
    private ImageView fourTimeslabel2;
    @FXML
    private ImageView fourTimeslabel3;
    @FXML
    private ImageView fourTimeslabel4;
    @FXML
    private ImageView fourTimeslabel5;
    @FXML
    private ImageView fourTimeslabel6;
    @FXML
    private ImageView fourTimeslabel7;
    @FXML
    private ImageView fourTimeslabel8;
    @FXML
    private ImageView fourTimeslabel9;
    @FXML
    private ImageView fourTimeslabel10;
    @FXML
    private ImageView twoTimeslabel1;
    @FXML
    private ImageView twoTimeslabel2;
    @FXML
    private ImageView twoTimeslabel3;
    @FXML
    private ImageView twoTimeslabel4;
    @FXML
    private ImageView twoTimeslabel5;
    @FXML
    private ImageView twoTimeslabel6;
    @FXML
    private ImageView twoTimeslabel7;
    @FXML
    private ImageView twoTimeslabel8;
    @FXML
    private ImageView twoTimeslabel9;
    @FXML
    private ImageView twoTimeslabel10;
    @FXML
    private ImageView halfTimeslabel1;
    @FXML
    private ImageView halfTimeslabel2;
    @FXML
    private ImageView halfTimeslabel3;
    @FXML
    private ImageView halfTimeslabel4;
    @FXML
    private ImageView halfTimeslabel5;
    @FXML
    private ImageView halfTimeslabel6;
    @FXML
    private ImageView halfTimeslabel7;
    @FXML
    private ImageView halfTimeslabel8;
    @FXML
    private ImageView halfTimeslabel9;
    @FXML
    private ImageView halfTimeslabel10;
    @FXML
    private ImageView quarterTimeslabel1;
    @FXML
    private ImageView quarterTimeslabel2;
    @FXML
    private ImageView quarterTimeslabel3;
    @FXML
    private ImageView quarterTimeslabel4;
    @FXML
    private ImageView quarterTimeslabel5;
    @FXML
    private ImageView quarterTimeslabel6;
    @FXML
    private ImageView quarterTimeslabel7;
    @FXML
    private ImageView quarterTimeslabel8;
    @FXML
    private ImageView quarterTimeslabel9;
    @FXML
    private ImageView quarterTimeslabel10;
    @FXML
    private ImageView nonelabel1;
    @FXML
    private ImageView nonelabel2;
    @FXML
    private ImageView nonelabel3;
    @FXML
    private ImageView nonelabel4;
    @FXML
    private ImageView nonelabel5;
    @FXML
    private ImageView nonelabel6;
    @FXML
    private ImageView nonelabel7;
    @FXML
    private ImageView nonelabel8;
    @FXML
    private ImageView nonelabel9;
    @FXML
    private ImageView nonelabel10;



    private Pokemon pokemon;
    private PokemonDAO pdao = new PokemonDAO();
    private List<ImageView> fourWeelknessLabellist;
    private List<ImageView> twoWeelknessLabellist;
    private List<ImageView> halfWeelknessLabellist;
    private List<ImageView> quarterWeelknessLabellist;
    private List<ImageView> noneWeelknessLabellist;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // display pokemon Name in ListView
        List<String> nameAll = pdao.allName();
        ObservableList<String> items = FXCollections.observableArrayList(nameAll);
        pokemonList.setItems(items);


        fourWeelknessLabellist = new ArrayList<>();
        fourWeelknessLabellist.add(fourTimeslabel1);
        fourWeelknessLabellist.add(fourTimeslabel2);
        fourWeelknessLabellist.add(fourTimeslabel3);
        fourWeelknessLabellist.add(fourTimeslabel4);
        fourWeelknessLabellist.add(fourTimeslabel5);
        fourWeelknessLabellist.add(fourTimeslabel6);
        fourWeelknessLabellist.add(fourTimeslabel7);
        fourWeelknessLabellist.add(fourTimeslabel8);
        fourWeelknessLabellist.add(fourTimeslabel9);
        fourWeelknessLabellist.add(fourTimeslabel10);

        twoWeelknessLabellist = new ArrayList<>();
        twoWeelknessLabellist.add(twoTimeslabel1);
        twoWeelknessLabellist.add(twoTimeslabel2);
        twoWeelknessLabellist.add(twoTimeslabel3);
        twoWeelknessLabellist.add(twoTimeslabel4);
        twoWeelknessLabellist.add(twoTimeslabel5);
        twoWeelknessLabellist.add(twoTimeslabel6);
        twoWeelknessLabellist.add(twoTimeslabel7);
        twoWeelknessLabellist.add(twoTimeslabel8);
        twoWeelknessLabellist.add(twoTimeslabel9);
        twoWeelknessLabellist.add(twoTimeslabel10);

        halfWeelknessLabellist = new ArrayList<>();
        halfWeelknessLabellist.add(halfTimeslabel1);
        halfWeelknessLabellist.add(halfTimeslabel2);
        halfWeelknessLabellist.add(halfTimeslabel3);
        halfWeelknessLabellist.add(halfTimeslabel4);
        halfWeelknessLabellist.add(halfTimeslabel5);
        halfWeelknessLabellist.add(halfTimeslabel6);
        halfWeelknessLabellist.add(halfTimeslabel7);
        halfWeelknessLabellist.add(halfTimeslabel8);
        halfWeelknessLabellist.add(halfTimeslabel9);
        halfWeelknessLabellist.add(halfTimeslabel10);

        quarterWeelknessLabellist = new ArrayList<>();
        quarterWeelknessLabellist.add(quarterTimeslabel1);
        quarterWeelknessLabellist.add(quarterTimeslabel2);
        quarterWeelknessLabellist.add(quarterTimeslabel3);
        quarterWeelknessLabellist.add(quarterTimeslabel4);
        quarterWeelknessLabellist.add(quarterTimeslabel5);
        quarterWeelknessLabellist.add(quarterTimeslabel6);
        quarterWeelknessLabellist.add(quarterTimeslabel7);
        quarterWeelknessLabellist.add(quarterTimeslabel8);
        quarterWeelknessLabellist.add(quarterTimeslabel9);
        quarterWeelknessLabellist.add(quarterTimeslabel10);

        noneWeelknessLabellist = new ArrayList<>();
        noneWeelknessLabellist.add(nonelabel1);
        noneWeelknessLabellist.add(nonelabel2);
        noneWeelknessLabellist.add(nonelabel3);
        noneWeelknessLabellist.add(nonelabel4);
        noneWeelknessLabellist.add(nonelabel5);
        noneWeelknessLabellist.add(nonelabel6);
        noneWeelknessLabellist.add(nonelabel7);
        noneWeelknessLabellist.add(nonelabel8);
        noneWeelknessLabellist.add(nonelabel9);
        noneWeelknessLabellist.add(nonelabel10);
        System.out.println("none");

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
          display(pokemon);
          printWeaknessTypes(pokemon);
        }
      }
    }

  }

  @FXML
    void onRoarButtonclick(ActionEvent event) {
      String selectedItem = pokemonList.getSelectionModel().getSelectedItem();
      pokemon =  pdao.search(selectedItem);
      String roarPath = "file:src/" + pokemon.getRoar();
      AudioClip note = new AudioClip(roarPath);
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
        searchName.setText(displayPokemonName);


        // set background color
        String type = displayPokemon.getType1();
        setBackgroundColor(type);


    }



    public void printWeaknessTypes(Pokemon pokemon) {
       Map<String, Double> weakness = TypeCheckArray.weaknesses(pokemon.getType1(), pokemon.getType2());

        List<Image> fourTimesList = new ArrayList<>();
        List<Image> twoTimesList = new ArrayList<>();
        List<Image> halfTimesList = new ArrayList<>();
        List<Image> quarterTimesList = new ArrayList<>();
        List<Image> noneTimesList = new ArrayList<>();

        for(Map.Entry<String, Double> weakenesses : weakness.entrySet()) {
            if(weakenesses.getValue().equals(4.0)) {
                Image weaknessTypeFour = new Image(typeImageURL(weakenesses.getKey()));
                fourTimesList.add(weaknessTypeFour);
            } else if (weakenesses.getValue().equals(2.0)) {
                Image weaknessTypeTwo = new Image(typeImageURL(weakenesses.getKey()));
                twoTimesList.add(weaknessTypeTwo);
            } else if (weakenesses.getValue().equals(0.5)) {
                Image weaknessTypeHalf = new Image(typeImageURL(weakenesses.getKey()));
                halfTimesList.add(weaknessTypeHalf);
            } else if (weakenesses.getValue().equals(0.25)) {
                Image weaknessTypeQuarter = new Image(typeImageURL(weakenesses.getKey()));
                quarterTimesList.add(weaknessTypeQuarter);
            } else if (weakenesses.getValue().equals(0)) {
                Image weaknessTypeNone = new Image(typeImageURL(weakenesses.getKey()));
                noneTimesList.add(weaknessTypeNone);
            }
        }
        int labelFourIndex = 0;
        int listFourIndex = 0;
        while (labelFourIndex < fourWeelknessLabellist.size()) {
            if (listFourIndex >= fourTimesList.size()) {
                fourWeelknessLabellist.get(labelFourIndex).setImage(null);
                labelFourIndex++;
            } else {
                fourWeelknessLabellist.get(labelFourIndex).setImage(fourTimesList.get(listFourIndex));
                labelFourIndex++;
                listFourIndex++;
            }
        }
        int labelTwoIndex = 0;
        int listTwoIndex = 0;
        while (labelTwoIndex < twoWeelknessLabellist.size()) {
            if (listTwoIndex >= twoTimesList.size()) {
                twoWeelknessLabellist.get(labelTwoIndex).setImage(null);
                labelTwoIndex++;
            } else {
                twoWeelknessLabellist.get(labelTwoIndex).setImage(twoTimesList.get(listTwoIndex));
                labelTwoIndex++;
                listTwoIndex++;
            }
        }
        int labelHalfIndex = 0;
        int listHalfIndex = 0;
        while (labelHalfIndex < halfWeelknessLabellist.size()) {
            if (listHalfIndex >= halfTimesList.size()) {
                halfWeelknessLabellist.get(labelHalfIndex).setImage(null);
                labelHalfIndex++;
            } else {
                halfWeelknessLabellist.get(labelHalfIndex).setImage(halfTimesList.get(listHalfIndex));
                labelHalfIndex++;
                listHalfIndex++;
            }
        }
        int labelQuarterIndex = 0;
        int listQuarterIndex = 0;
        while (labelQuarterIndex < quarterWeelknessLabellist.size()) {
            if (listQuarterIndex >= quarterTimesList.size()) {
                quarterWeelknessLabellist.get(labelQuarterIndex).setImage(null);
                labelQuarterIndex++;
            } else {
                quarterWeelknessLabellist.get(labelQuarterIndex).setImage(quarterTimesList.get(listQuarterIndex));
                labelQuarterIndex++;
                listQuarterIndex++;
            }
        }
        int labelNoneIndex = 0;
        int listNoneIndex = 0;
        while (labelNoneIndex < noneWeelknessLabellist.size()) {
            if (listNoneIndex >= noneTimesList.size()) {
                noneWeelknessLabellist.get(labelNoneIndex).setImage(null);
                labelNoneIndex++;
            } else {
                noneWeelknessLabellist.get(labelNoneIndex).setImage(noneTimesList.get(listNoneIndex));
                labelNoneIndex++;
                listNoneIndex++;
            }
        }

    }

    public void setBackgroundColor(String type) {
        switch (type) {
            case "1":
                background2.setStyle("-fx-background-color:linear-gradient(#FFFFFF, #CCCCCC, #AAAAAA);");
                break;
            case "2":
                background2.setStyle("-fx-background-color:linear-gradient(#D8FFDA, #91DEB8, #6FE5C5);");
                break;
            case "3":
                background2.setStyle("-fx-background-color:linear-gradient(#C7ECFF, #5FB3E0, #66ABE6);");
                break;
            case "4":
                background2.setStyle("-fx-background-color:linear-gradient(#FFCEC7, #EB8274, #FA8063);");
                break;
            case "5":
                background2.setStyle("-fx-background-color:linear-gradient(#FFFDC7, #E5D76B, #E2DC5A);");
                break;
            case "6":
                background2.setStyle("-fx-background-color:linear-gradient(#F4CECE, #ED7B7B, #D54141);");
                break;
            case "7":
                background2.setStyle("-fx-background-color:linear-gradient(#D7E3FA, #8EA5F0, #708FF7);");
                break;
            case "8":
                background2.setStyle("-fx-background-color:linear-gradient(#F0E0C2, #EABF6D, #D0A739);");
                break;
            case "9":
                background2.setStyle("-fx-background-color:linear-gradient(#FAF2D5, #C4AC6C, #BCA66A);");
                break;
            case "10":
                background2.setStyle("-fx-background-color:linear-gradient(#A2A2A2, #4E4E4E, #222222);");
                break;
            case "11":
                background2.setStyle("-fx-background-color:linear-gradient(#EFD5FA, #B68FC7, #8B6B9A);");
                break;
            case "12":
                background2.setStyle("-fx-background-color:linear-gradient(#ECF8C5, #9ECC47, #A7BC51);");
                break;
            case "13":
                background2.setStyle("-fx-background-color:linear-gradient(#D5DEFA, #4B6DDD, #363BAA);");
                break;
            case "14":
                background2.setStyle("-fx-background-color:linear-gradient(#D3FDF5, #7BEDD3, #41D5C3);");
                break;
            case "15":
                background2.setStyle("-fx-background-color:linear-gradient(#AAC0C7, #487C8D, #294953);");
                break;
            case "16":
                background2.setStyle("-fx-background-color:linear-gradient(#FEE8FF, #DCA2DE, #E48FE8);");
                break;
            case "17":
                background2.setStyle("-fx-background-color:linear-gradient(#E8CEF4, #BD7BED, #A241D5);");
                break;
            case "18":
                background2.setStyle("-fx-background-color:linear-gradient(#FAD7E4, #F77FAD, #F45B90);");
                break;
            default:
                background2.setStyle("-fx-background-color: grey;");
        }
    }

    public String typeImageURL(String type) {
        String imageUrl;
        switch (type) {
            case "1":
            case "Normal":
                imageUrl = "img/normal_label.png";
                break;
            case "2":
            case "Grass":
                imageUrl = "img/grass_label.png";
                break;
            case "3":
            case "Water":
                imageUrl = "img/water_label.png";
                break;
            case "4":
            case "Fire":
                imageUrl = "img/fire_label.png";
                break;
            case "5":
            case "Electric":
                imageUrl = "img/electric_label.png";
                break;
            case "6":
            case "Fighting":
                imageUrl = "img/fighting_label.png";
                break;
            case "7":
            case "Flying":
                imageUrl = "img/flying_label.png";
                break;
            case "8":
            case "Ground":
                imageUrl = "img/ground_label.png";
                break;
            case "9":
            case "Rock":
                imageUrl = "img/rock_label.png";
                break;
            case "10":
            case "Dark":
                imageUrl = "img/dark_label.png";
                break;
            case "11":
            case "Ghost":
                imageUrl = "img/ghost_label.png";
                break;
            case "12":
            case "Bug":
                imageUrl = "img/bug_label.png";
                break;
            case "13":
            case "Dragon":
                imageUrl = "img/dragon_label.png";
                break;
            case "14":
            case "Ice":
                imageUrl = "img/ice_label.png";
                break;
            case "15":
            case "Steel":
                imageUrl = "img/steel_label.png";
                break;
            case "16":
            case "Fairy":
                imageUrl = "img/fairy_label.png";
                break;
            case "17":
            case "Poison":
                imageUrl = "img/poison_label.png";
                break;
            case "18":
            case "Phychic":
                imageUrl = "img/phychic_label.png";
                break;
            default:
                imageUrl = null;
        }
        return imageUrl;
    }



}
