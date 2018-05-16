package sample.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OrderController {

    private ShopController shopController ;
    private String message ;

    @FXML
    private Label listLabel;


    @FXML
    public void initialize() {
    }

    public void setMessage(String message) {
        listLabel.setText(message);
    }
}
