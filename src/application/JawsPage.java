package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class JawsPage {

	@FXML
	private Button travel;
	
	@FXML
	private Button back;
	
	@FXML
	private Button home;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "hawaiiPage.fxml");
	}
	
	public void travelToJaws(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "travelToJaws.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
