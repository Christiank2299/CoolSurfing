package application;

import java.io.IOException;

import backend.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AntarcticaPage {

	

	@FXML
	private Button back;
	
	@FXML
	private Button antarcticaWave;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		User currentUser = Main.getCurrentUser();
		if(currentUser.isAdmin() == true) {
			m.changeScene( "bossTools.fxml");
		} else {
	
		m.changeScene( "afterLogin.fxml");
		}
	}
		
	public void goToAntarcticaWave(ActionEvent event) throws IOException {
			Main m = new Main();
			m.changeScene( "antarcticaWavePage.fxml");
	
}
}
