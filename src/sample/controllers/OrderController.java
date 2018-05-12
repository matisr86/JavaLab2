package sample.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OrderController {

    private ShopController shopController ;

    @FXML
    private Label listLabel;

    @FXML
    public void initialize() {
    listLabel.setText(shopController.getMessage());
    }

}
