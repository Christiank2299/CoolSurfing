package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class JapanPage {

	@FXML
	private Button backButton;
	
	@FXML
	private Button shohan;
	
	@FXML
	private Button home;
	

	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "asiaPage.fxml");
	}
	
	public void goToShohan(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "johanPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
