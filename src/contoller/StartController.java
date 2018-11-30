package contoller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartController {
    @FXML
    private Button startButton;

    @FXML
    void onStartButtonClick(ActionEvent event) {
        new Main().changeView("samplepoke.fxml");
    }
}
