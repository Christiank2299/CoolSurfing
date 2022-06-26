package application;

import java.io.IOException;

import backend.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class NorthAmericaPage {

	@FXML
	private Button hawaii;
	
	@FXML
	private Button california;
	
	@FXML
	private Button newYork;
	
	@FXML
	private Button backButton;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		User currentUser = Main.getCurrentUser();
		if(currentUser.isAdmin() == true) {
			m.changeScene( "bossTools.fxml");
		} else {
	
		m.changeScene( "afterLogin.fxml");
		}
	}
	
	public void goToHawaii(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "hawaiiPage.fxml");
	}
	
	public void goToNewYork(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "newyorkPage.fxml");
	}
	
	public void goToCalifornia(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "californiaPage.fxml");
	}
}

