package sample.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OrderController {

    private ShopController shopController ;
    String message = shopController.toString() ;
    @FXML
    private Label listLabel;


    @FXML
    public void initialize() {

    }
}
