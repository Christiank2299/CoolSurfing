package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PipelinePage {

	@FXML
	private Button travel;;
	
	@FXML
	private Button back;
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "hawaiiPage.fxml");
	}
	
	public void travelToPipeline(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "travelToPipeline.fxml");
	}
}
