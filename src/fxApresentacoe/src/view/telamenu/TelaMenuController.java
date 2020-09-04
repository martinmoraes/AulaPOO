package fxApresentacoe.src.view.telamenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaMenuController {
	
    @FXML
    private TextField textName;

    @FXML
    private Button buttonMostra;

    @FXML
    void buttonMostra_Action(ActionEvent event) {
    	System.out.println(textName.getText());
    }
}



