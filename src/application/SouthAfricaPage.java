package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SouthAfricaPage {

	@FXML
	private Button backButton;
	
	@FXML
	private Button jBay;
	
	@FXML
	private Button capeTown;
	
	@FXML
	private Button home;
	
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "africaPage.fxml");
	}
	
	public void goToJBay(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "jBayPage.fxml");
	}
	
	public void goToCapeTown(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "capeTownPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
