package application;

import java.io.IOException;

import backend.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EuropePage {
	@FXML
	private Button backButton;
	
	@FXML
	private Button portugal;
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		User currentUser = Main.getCurrentUser();
		if(currentUser.isAdmin() == true) {
			m.changeScene( "bossTools.fxml");
		} else {
	
		m.changeScene( "afterLogin.fxml");
		}
	}
	public void goToPortugal(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "portugalPage.fxml");
	}
}
