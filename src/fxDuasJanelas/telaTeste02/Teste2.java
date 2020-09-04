package fxDuasJanelas.telaTeste02;

import java.io.IOException;
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Teste2 extends Application {

	@FXML
	private Button buttonMostra;

	@FXML
	void buttonMostra_OnAction(ActionEvent event) {
		this.mensagemAleta("Mensagem: É só uma mensagem. Não vai fechar!");
	}

	@Override
	public void start(Stage stage) {
		try {
			AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("Teste02.fxml"));
			this.controlaFechar(stage);
			stage.setTitle("Segunda janela");
			Scene sc = new Scene(pane, 300, 300);
			stage.setScene(sc);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void controlaFechar(Stage stage) {

		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent t) {
				t.consume();

				mensagemAleta("Parou tudo, vai fechar!");

				stage.close();
//                System.exit(0);
			}
		});

	}

	private void mensagemAleta(String mensagem) {

//		Alert alert = new Alert(AlertType.INFORMATION);
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("FECHAR");
		alert.setHeaderText("Vai fechar!");
		alert.setResizable(false);
		alert.setContentText(mensagem);

//		alert.show();
		Optional<ButtonType> result = alert.showAndWait();
		if (!result.isPresent()) {
			alert("Não foi preciosnado botões!");
		} else if (result.get() == ButtonType.OK) {
			alert("Foi precionado o botão OK");
		} else if (result.get() == ButtonType.CANCEL) {
			alert("Foi precionado o botão CANCEL");
		}
	}

	private void alert(String mensagem) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Informação");
		alert.setHeaderText(null);
		alert.setContentText(mensagem);
		alert.show();
	}

}
