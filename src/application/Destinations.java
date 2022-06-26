package application;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ResourceBundle;

import backend.User;
import backend.UserMap;
import backend.Wave;
import backend.WaveMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Destinations implements Initializable {

	@FXML
	private Button viewWaveButton;
	
	@FXML
	private Button editWaveButton;
	
	@FXML
	private Button removeWaveButton;
	
	@FXML
	private ListView<Wave> waveList = new ListView<Wave>();
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "AddDestinations.fxml");
		
	}
	
	public void viewWave(ActionEvent event) throws IOException {
		 int selectedID = waveList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	Wave selectedUser = waveList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedUser);
//	    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//	    	ListIterator<Wave> iterator = waveList.listIterator();
//			while(iterator.hasNext()) {
//				Wave temp = iterator.next();
				
	    
	    	Main m = new Main();
			m.changeScene( "viewSelectedUser.fxml");
	
	}
	
	public void removeWave(ActionEvent event) throws IOException {
		 int selectedID = waveList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	Wave selectedWave = waveList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedWave);
//	    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//	    	ListIterator<Wave> iterator = waveList.listIterator();
//			while(iterator.hasNext()) {
//				Wave temp = iterator.next();
				
	    	WaveMap waves = Main.getWaves();
	    	waves.remove(selectedWave.getId());
	    
	    	Main m = new Main();
			m.changeScene( "destinations.fxml");
	
	}
	
	public void editWave(ActionEvent event) throws IOException {
		 int selectedID = waveList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	Wave selectedWave = waveList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedWave);
	    	
	    	Main.setSelectedWave(selectedWave);
	    	
	       	Main m = new Main();
	    	m.changeScene( "updateDestination.fxml");

	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		WaveMap waves = Main.getWaves();
		LinkedList<Wave> waveLinkedList = waves.returnAllWavesInLinkedListForm();
		ListIterator<Wave> iterator2 = waveLinkedList.listIterator();
	    while(iterator2.hasNext()) {
			Wave wave = iterator2.next();
			waveList.getItems().add(wave); // adding names of waves in string form to listView
		}
		
	}
}
