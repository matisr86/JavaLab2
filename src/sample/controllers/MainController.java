package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Stack;

public class MainController {

    @FXML
    private StackPane StackPane;

    @FXML
    public void initialize() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../fxml/shop.fxml")) ;
        VBox vBox = null ;

        try {
            vBox = loader.load() ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        ShopController shopController = loader.getController() ;
        shopController.setMainController(this);
        setScreen(vBox);


    }

    public void setScreen(VBox vBox) {
        StackPane.getChildren().clear();
        StackPane.getChildren().add(vBox) ;
    }


}
