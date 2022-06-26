package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FlorionapolisPage {

	@FXML
	private Button travel;;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button home;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "brazilPage1.fxml");
	}
	
	public void travelToFlorionapolis(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "travelToFlorionapolis1.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
