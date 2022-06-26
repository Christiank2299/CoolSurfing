package application;

import java.io.IOException;

import backend.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AfricaPage {

	
	
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button southAfrica;
	
	@FXML
	private Button namibia;
	
	@FXML
	private Button homePage;
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		User currentUser = Main.getCurrentUser();
		if(currentUser.isAdmin() == true) {
			m.changeScene( "bossTools.fxml");
		} else {
	
		m.changeScene( "afterLogin.fxml");
		}
	}
	
	public void goToSouthAfrica(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("southAfricaPage.fxml");
	}
	
	public void goToNamibia(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("namibiaPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException{
		Main m = new Main();
		m.changeScene("afterLogin.fxml");
	}
}
