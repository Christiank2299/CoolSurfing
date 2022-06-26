package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import backend.Trip;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewTrip implements Initializable{

    @FXML
    private Button backButton;

    @FXML
    private Button editTrip;

    @FXML
    private Label arrivalLabel;

    @FXML
    private Label journalLabel;

    @FXML
    private Label waveLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label nameLabel1;

    @FXML
    private Label nameLabel11;

    @FXML
    private Label nameLabel111;

    @FXML
    private Label departureLabel;

    @FXML
    void editTrip(ActionEvent event)throws IOException {
    	Main m = new Main();
		m.changeScene("editTrip.fxml");
    }

    @FXML
    void goBack(ActionEvent event) throws IOException{
    	Main m = new Main();
		m.changeScene( "viewTravelHistoryCurrent.fxml");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Trip currentTrip = Main.getCurrentTrip();
		arrivalLabel.setText(currentTrip.getArrivalDate());
		departureLabel.setText(currentTrip.getDepartutreDate());
		waveLabel.setText(currentTrip.getWave().getName());
		journalLabel.setText(currentTrip.getDescription());
		
		
	}
}
