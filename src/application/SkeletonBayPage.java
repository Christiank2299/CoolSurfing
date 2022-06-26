package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SkeletonBayPage {


	@FXML
	private Button travel;
	
	@FXML
	private Button home;
	
	@FXML
	private Button backButton;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "namibiaPage.fxml");
	}
	
	public void travelToSkeletonBay(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "travelToSkeletonBay.fxml");
	}
	
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
}
