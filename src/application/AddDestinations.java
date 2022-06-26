package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import backend.Continent;
import backend.Place;
import backend.User;
import backend.UserMap;
import backend.Username;
import backend.Wave;
import backend.WaveMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddDestinations implements Initializable {

	

	
	@FXML
	private Button addDestinationButton;
	
	@FXML
	private TextField continent;
	
	private String thisContinent;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button viewUsers;
	
	@FXML
	private TextField place;
	
	@FXML
	private TextField risk;
	
	@FXML
	private TextField name;
	
	@FXML
	private ComboBox skillLevel;
	
	@FXML
	private ComboBox continentBox;
	
	@FXML
	private TextField waveGrade;
	
	
	private String skill;
	
	private WaveMap waveMap = Main.getWaves();
	


	public void viewDestination() throws IOException {	
		Main m = new Main();
		m.changeScene("destinations.fxml");
	}

		
		
	public void addDestination() throws IOException {	
		
		Main m = new Main();
	
			Wave newWave = new Wave( skill, risk.getText(), name.getText(), new Place( place.getText())) ;
			
			Continent[] continent = Main.getContinents();
			for (int i = 0; i < continent.length; i++) {
				if (continent[i].getName().contentEquals(thisContinent)) {
					newWave.setContinent(continent[i]);
				}
			}
			System.out.println("continent array" + continent);
		    
			
	
			
			waveMap.insert(newWave);
		
			
		    
			
			m.changeScene("destinations.fxml"); // will be viewUser page once the page is made 
			
		
		

		
	
	}


	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
	
			m.changeScene( "AdminToolsPage.fxml");
		
	}
	
	public void viewRegisteredUsers(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "users.fxml");
	}
	
	
	public void addWave(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "addDestinations.fxml");
	}
	
	
	

	
	
	public void returnToLogIn(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "sample.fxml");
	}
	

	
	public void setContinent(ActionEvent event) throws IOException {
		thisContinent = continentBox.getSelectionModel().getSelectedItem().toString();
	}
		
	
	
	public void setSkillLevel(ActionEvent event) throws IOException {
		skill = skillLevel.getSelectionModel().getSelectedItem().toString();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 ObservableList<String> skillList = FXCollections.observableArrayList("Beginner", "Intermediate", "Advanced", "Expert", "Pro");
			skillLevel.setItems(skillList);
			
			 ObservableList<String> continentList = FXCollections.observableArrayList("North America", "South America", "Africa", "Asia", "Europe", "Antarctica", "Australia");
				continentBox.setItems(continentList);
		
	}
}
