package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class NewYorkPage {
	
	
	

		@FXML
		private Button ditchPlains;
		
		@FXML
		private Button duneRoad;
		
		@FXML
		private Button home;
		
		@FXML
		private Button backButton;
		
		
		public void goBack(ActionEvent event) throws IOException {
			Main m = new Main();
			m.changeScene("northAmericaPage.fxml");
		}
		
		public void goToDitchPlains(ActionEvent event) throws IOException {
			Main m = new Main();
			m.changeScene("ditchPlainsPage.fxml");
		}
		
		public void goToDuneRoad(ActionEvent event) throws IOException {
			Main m = new Main();
			m.changeScene("duneRoadPage.fxml");
		}
		
		
		public void goHome(ActionEvent event) throws IOException {
			Main m = new Main();
			m.changeScene( "afterLogin.fxml");
		}
}
