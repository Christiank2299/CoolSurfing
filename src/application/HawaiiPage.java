package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HawaiiPage {

	@FXML
	private Button backButton;
	
	@FXML
	private Button pipeline;
	
	@FXML
	private Button jaws;
	
	
	@FXML
	private Button home;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "northAmericaPage.fxml");
	}
	
	public void goToPipeline(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "pipelinePage.fxml");
	}
	
	public void goToJaws(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "jawsPage.fxml");
	}
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
	
}
