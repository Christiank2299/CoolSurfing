package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CaliforniaPage {

	@FXML
	private Button mavericks;
	
	@FXML
	private Button blacksBeach;
	
	@FXML
	private Button home;
	
	@FXML
	private Button backButton;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "northAmericaPage.fxml");
	}
	
	public void goToMavericks(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "mavericksPage.fxml");
	}
	
	public void goToBlacksBeach(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "BlacksBeachPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
	
	
}
