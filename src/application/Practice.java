package application;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ResourceBundle;

import backend.Condition;
import backend.Continent;
import backend.Place;
import backend.Trip;
import backend.Wave;
import backend.WaveMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Practice implements Initializable{
	
	Wave ditchPlains;
	Wave duneRoad;
	
	WaveMap waves;

    @FXML
    private ListView<String> listOfNames;

    @FXML
    private Button add;

    @FXML
    private TextField name;

    @FXML
    private Button remove;

    @FXML
    void addName(MouseEvent event) {

  //  	listOfNames.getItems().add(name.getText());
    	listOfNames.getItems().add(ditchPlains.getName());
    	listOfNames.getItems().add(duneRoad.getName());
    	listOfNames.getItems().addAll("hello", "surfing");
    }

    @FXML
    void addToList(ActionEvent event) {

    }

    @FXML
    void removeName(MouseEvent event) throws IOException{
     int selectedID = listOfNames.getSelectionModel().getSelectedIndex();
//    	listOfNames.getItems().remove(selectedID);
    	String selectedWave = listOfNames.getItems().get(selectedID);      /// this string is the name of the selected wave 
    	System.out.println(selectedWave);
//    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//    	ListIterator<Wave> iterator = waveList.listIterator();
//		while(iterator.hasNext()) {
//			Wave temp = iterator.next();
			if(selectedWave.contentEquals("Ditch Plains")) {
				Main m = new Main();
				m.changeScene( "DitchPlainsPage.fxml");
			
			}
		}
    
		
		

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		waves = Main.getWaves();
		ditchPlains = waves.search("0");
		duneRoad = waves.search("1");
		
	}
	

	
}
