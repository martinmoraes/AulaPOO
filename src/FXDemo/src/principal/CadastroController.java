package FXDemo.src.principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroController {

    @FXML
    private TextField tfFone;

    @FXML
    private TextField tfNome;

    @FXML
    private Label lbResultado;
    
    
    
    

    @FXML
    void mostrar(ActionEvent event) {
    	lbResultado.setText(tfNome.getText() +" - "+ tfFone.getText());

    }

}
