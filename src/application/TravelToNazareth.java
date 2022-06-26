package application;

import java.io.IOException;

import backend.Trip;
import backend.TripStore;
import backend.User;
import backend.Wave;
import backend.WaveMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class TravelToNazareth {

	@FXML
	private Button backButton;
	
	@FXML 
	private DatePicker arrive;
	
	private String arrival;
	
	private String departure;
	
	@FXML
	private DatePicker depart;
	
	@FXML
	private TextField journal;
	
	@FXML
	private Button add;
	
	@FXML
	private Button home;
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "nazarethPage.fxml");
	}

	
	public void setArrival(ActionEvent event) throws IOException {
		arrival  = arrive.getValue().toString();
		System.out.println("arrival" + arrival);
	}
	
	public void setDeparture(ActionEvent event) throws IOException {
		departure = depart.getValue().toString();
		System.out.println("Departure " + departure);
	}
	
	
	public void goHome(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "afterLogin.fxml");
	}
	
	public void addToTravelHistory(ActionEvent event) throws IOException {
		WaveMap waves = Main.getWaves();
		Wave thisWave = waves.search("11");
		System.out.println("wave" + thisWave.toString());
		 
		User currentUser = Main.getCurrentUser();
		TripStore trips = currentUser.getTravelHistory();
		Trip trip = new Trip(currentUser, arrival, departure, thisWave, journal.getText());
		trips.insert(trip);
		System.out.println("Display History");
		currentUser.getTravelHistory().display();
		
		Main m = new Main();
		m.changeScene( "profilePage.fxml");
		
	}
}
