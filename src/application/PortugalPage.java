package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PortugalPage {

	@FXML
	private Button nazareth;
	
	@FXML
	private Button home;
	
	@FXML
	private Button backButton;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "europePage.fxml");
	}
	
	public void goToNazareth(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "nazarethPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
