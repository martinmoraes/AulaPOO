package fxApresentacoe.src.principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("../view/telamenu/TelaMenu.fxml"));
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

	
}
