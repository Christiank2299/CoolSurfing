package application;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ResourceBundle;

import backend.Trip;
import backend.TripStore;
import backend.User;
import backend.UserMap;
import backend.Wave;
import backend.WaveMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ViewCurrentTravelHistory implements Initializable  {

	@FXML
	private Button viewTripButton;
	
	@FXML
	private Button removeTripButton;
	
	@FXML
	private Button editTripButton;
	
	@FXML
	private Button backButton;
	
	@FXML
	private ListView<Trip> tripList = new ListView<Trip>();
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "profilePage.fxml");
		
	}
	
	public void viewTrip(ActionEvent event) throws IOException {
		 int selectedID = tripList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	Trip selectedTrip = tripList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedTrip);
//	    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//	    	ListIterator<Wave> iterator = waveList.listIterator();
//			while(iterator.hasNext()) {
//				Wave temp = iterator.next();
	        Main.setCurrentTrip(selectedTrip);
	    	Main m = new Main();
			m.changeScene( "viewTrip.fxml");
	        
//	       WaveMap waves = Main.getWaves();
//	    LinkedList<Wave> wavesList = waves.returnAllWavesInLinkedListForm();
//	       ListIterator<Wave> iterator2 = wavesList.listIterator();
//           while(iterator2.hasNext()) {
//				Wave waveTemp = iterator2.next();
//				if(waveTemp.getName().contentEquals(waveName)) {
//					
//				}
//					
//				 // adding names of waves in string form to listView
//			}
	
    
	}
	
	public void removeTrip(ActionEvent event) throws IOException {
		 int selectedID = tripList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	Trip selectedTrip = tripList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedTrip);
//	    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//	    	ListIterator<Wave> iterator = waveList.listIterator();
//			while(iterator.hasNext()) {
//				Wave temp = iterator.next();
				
	    	TripStore trips = Main.getCurrentUser().getTravelHistory();
	    	trips.deleteById(selectedTrip.getId());
	    
	    	Main m = new Main();
			m.changeScene( "viewTravelHistoryCurrent.fxml");
	
	}
	
	public void editTrip(ActionEvent event) throws IOException {
		 int selectedID = tripList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	Trip selectedUser = tripList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedUser);

	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		LinkedList<Trip> tripLinkedList = Main.getCurrentUser().getTravelHistory().getTripStore();
		
		ListIterator<Trip> iterator2 = tripLinkedList.listIterator();
	    while(iterator2.hasNext()) {
			Trip trip = iterator2.next();
			tripList.getItems().add(trip); // adding names of waves in string form to listView
		}
		
	}
}
