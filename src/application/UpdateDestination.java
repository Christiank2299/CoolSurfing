package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import backend.Condition;
import backend.Continent;
import backend.Place;
import backend.Wave;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class UpdateDestination implements Initializable {

	  @FXML
	    private Button backButton;

	    @FXML
	    private TextField name;

	    @FXML
	    private ComboBox continentBox;

	    @FXML
	    private TextField place;

	    @FXML
	    private TextField risk;

	    @FXML
	    private TextField waveGrade;

	    @FXML
	    private ComboBox skillLevel;
	    

		private Continent thisContinent;
		
		private String skill;

		private Wave currentWave = Main.getSelectedWave();
		
	    @FXML
	    private Button updateDestinationButton;

	    @FXML
	    void goBack(ActionEvent event) throws IOException {
	    	Main m = new Main();
			m.changeScene( "destinations.fxml");
	    }

	    @FXML
	    void setContinent(ActionEvent event) {
	    	String continent = continentBox.getSelectionModel().getSelectedItem().toString();
	    	Continent[] continents = Main.getContinents();
	    	for(int i = 0; i<continents.length; i++) {
	    		Continent tempContinent = continents[i];
	    		if(tempContinent.getName().contentEquals(continent)) {
	    			currentWave.setContinent(tempContinent);
	    		}
	    	}
	    }

	    @FXML
	    void setSkillLevel(ActionEvent event) {
	    	skill = skillLevel.getSelectionModel().getSelectedItem().toString();
	    }

	    @FXML
	    void updateDestination(ActionEvent event) throws IOException {
	    	
             if(!(name.getText().contentEquals(""))) {
            	 currentWave.setName(name.getText());
             }
             
             if(!(place.getText().contentEquals(""))) {
            	 currentWave.setPlace(new Place(place.getText()));
             }
	    	
             if(!(risk.getText().contentEquals(""))) {
            	 currentWave.setRiskLevel(risk.getText());
             }
             
             if(!(waveGrade.getText().contentEquals(""))) {
            	 currentWave.setCondition(new Condition(waveGrade.getText()));
             }
             
             
         	Main m = new Main();
			m.changeScene( "destinations.fxml");
	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			 ObservableList<String> skillList = FXCollections.observableArrayList("Beginner", "Intermediate", "Advanced", "Expert", "Pro");
				skillLevel.setItems(skillList);
				
				 ObservableList<String> continentList = FXCollections.observableArrayList("North America", "South America", "Africa", "Asia", "Europe", "Antarctica", "Australia");
					continentBox.setItems(continentList);
			
		}
}
