package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BrazilPage1 {

	@FXML
	private Button florionapolis;
	
	@FXML
	private Button home;
	
	@FXML
	private Button backButton;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "southAmericaPage.fxml");
	}
	
	public void goToFlorionapolis1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "florionapolisPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
