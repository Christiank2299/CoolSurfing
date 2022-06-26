package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AntarcticaWavePage {
	@FXML
	private Button travel;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button home;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "antarcticaPage.fxml");
	}
	
	public void travelToAntarcticaWave(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "travelToAntarcticaWave.fxml");
	}

	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
	
}
