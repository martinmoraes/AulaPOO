package fxDuasJanelas.telaTeste;

import java.io.IOException;

import fxDuasJanelas.telaTeste02.Teste2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Teste extends Application {

	
    @FXML
    private Button buttonMostraTela;

    @FXML
    void buttonMostraTela_OnAction(ActionEvent event) {
    	Stage stage = (Stage) buttonMostraTela.getScene().getWindow(); 
    	Teste2 t = new Teste2();
    	t.start(stage);
    	
//		t.start(new Stage());
//		t.start(new Stage());

    }
	
	
	
	@Override
	public void start(Stage stage) {

		try {
			AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("Teste.fxml"));
			stage.setTitle("Primeira janela");
			Scene sc = new Scene(pane);
			stage.setScene(sc);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	public void execute() {
		launch();
	}

	public static void main(String[] args) {
		launch();
	}

}
