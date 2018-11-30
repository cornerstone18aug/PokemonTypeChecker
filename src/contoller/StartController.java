package contoller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class StartController implements Initializable {
    @FXML
    private Button startButton;

    @FXML
    private ImageView pikachuImage;

    @FXML
    private ImageView icon1;

    @FXML
    private ImageView icon2;

    @FXML
    private ImageView icon3;

    @FXML
    private ImageView icon4;

    @FXML
    private ImageView icon5;

    @FXML
    private ImageView icon7;

    @FXML
    private ImageView icon8;

    @FXML
    private ImageView icon9;

    @FXML
    private ImageView icon6;

    @FXML
    private ImageView icon11;

    @FXML
    private ImageView icon12;

    @FXML
    private ImageView icon13;

    @FXML
    private ImageView icon10;

    @FXML
    private ImageView icon14;

    @FXML
    private ImageView icon15;

    @FXML
    private ImageView icon16;

    @FXML
    void onStartButtonClick(ActionEvent event) {
        new Main().changeView("samplepoke.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image_pikachu = new Image("img/start_material/Pikachu.png");
        pikachuImage.setImage(image_pikachu);
        Image image_icon1 = new Image("img/start_material/icon1.png");
        icon1.setImage(image_icon1);
        Image image_icon2 = new Image("img/start_material/icon2.png");
        icon2.setImage(image_icon2);
        Image image_icon3 = new Image("img/start_material/icon3.png");
        icon3.setImage(image_icon3);
        Image image_icon4 = new Image("img/start_material/icon4.png");
        icon4.setImage(image_icon4);
        Image image_icon5 = new Image("img/start_material/icon5.png");
        icon5.setImage(image_icon5);
        Image image_icon6 = new Image("img/start_material/icon6.png");
        icon6.setImage(image_icon6);
        Image image_icon7 = new Image("img/start_material/icon7.png");
        icon7.setImage(image_icon7);
        Image image_icon8 = new Image("img/start_material/icon8.png");
        icon8.setImage(image_icon8);
        Image image_icon9 = new Image("img/start_material/icon9.png");
        icon9.setImage(image_icon9);
        Image image_icon10 = new Image("img/start_material/icon10.png");
        icon10.setImage(image_icon10);
        Image image_icon11 = new Image("img/start_material/icon11.png");
        icon11.setImage(image_icon11);
        Image image_icon12 = new Image("img/start_material/icon12.png");
        icon12.setImage(image_icon12);
        Image image_icon13 = new Image("img/start_material/icon13.png");
        icon13.setImage(image_icon13);
        Image image_icon14 = new Image("img/start_material/icon14.png");
        icon14.setImage(image_icon14);
        Image image_icon15 = new Image("img/start_material/icon15.png");
        icon15.setImage(image_icon15);
        Image image_icon16 = new Image("img/start_material/icon16.png");
        icon16.setImage(image_icon16);
    }
}
