package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PeruPage {

	
	@FXML
	private Button back;
	
	@FXML
	private Button lima;
	
	
	@FXML
	private Button home;
	
	@FXML
	private Button trujilo;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "southAmericaPage.fxml");
	}
	
	public void goToLima(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "limaPage.fxml");
	}
	
	public void goToTrujilo(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "trujiloPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
