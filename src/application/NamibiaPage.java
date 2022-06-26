package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class NamibiaPage {

	
	@FXML
	private Button backButton;
	
	@FXML
	private Button skeletonBay;
	
	@FXML
	private Button home;
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "africaPage.fxml");
	}
	
	public void goToSkeletonBay(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "skeletonBayPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
