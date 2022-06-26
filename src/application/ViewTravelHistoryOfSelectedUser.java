package application;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ResourceBundle;

import backend.Trip;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ViewTravelHistoryOfSelectedUser implements Initializable {
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
	        
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
LinkedList<Trip> tripLinkedList = Main.getCurrentUserAdminView().getTravelHistory().getTripStore();
		
		ListIterator<Trip> iterator2 = tripLinkedList.listIterator();
	    while(iterator2.hasNext()) {
			Trip trip = iterator2.next();
			tripList.getItems().add(trip); // adding names of waves in string form to listView
		}
		
	}
		
	}

