package application;

import java.io.IOException;

import backend.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SouthAmericaPage {
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button chile;
	
	@FXML
	private Button peru;
	
	@FXML
	private Button brazil;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		User currentUser = Main.getCurrentUser();
		if(currentUser.isAdmin() == true) {
			m.changeScene( "bossTools.fxml");
		} else {
	
		m.changeScene( "afterLogin.fxml");
		}
	}

	
	public void goToPeru(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("peruPage.fxml");
	}
	
	public void goToBrazil(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("brazilPage1.fxml");
	}

}
