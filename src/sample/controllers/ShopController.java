package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ShopController {

    private String message ="Zamówiono: ";

    private MainController mainController ;
    @FXML
    private CheckBox CheryCh;

    @FXML
    private CheckBox BananaCh;

    @FXML
    private CheckBox CarrotCh;

    @FXML
    private Button AcceeptButton;

    @FXML
    private CheckBox AppleCh;

    @FXML
    public void initialize(){
        CarrotCh.setSelected(true);
    }
    @FXML
    void SendOnAction(ActionEvent event) {
        handleOptions(CheryCh, BananaCh, CarrotCh, AppleCh);

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../fxml/order.fxml")) ;
        VBox vBox = null ;
        try {
            vBox = loader.load() ;
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainController.setScreen(vBox);

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    private void handleOptions(CheckBox CheryCh, CheckBox BananaCh,  CheckBox CarrotCh, CheckBox AppleCh ) {
        if(CheryCh.isSelected()) message += "czereśnie, " ;
        if(BananaCh.isSelected()) message+="banany, " ;
        if(CarrotCh.isSelected()) message+="marchewki, " ;
        if(AppleCh.isSelected()) message+="jabłka, " ;
    }

    @Override
    public String toString() {
        return  message;
    }
}
