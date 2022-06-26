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

public class Users implements Initializable {

	@FXML
	private Button viewUserButton;
	
	@FXML
	private Button removeUserButton;
	
	@FXML
	private Button editUserButton;
	
	@FXML
	private Button backButton;
	
	@FXML
	private ListView<User> userList = new ListView<User>();
	
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "AdminToolsPage.fxml");
		
	}
	
	public void viewUser(ActionEvent event) throws IOException {
		 int selectedID = userList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	User selectedUser = userList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedUser);
//	    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//	    	ListIterator<Wave> iterator = waveList.listIterator();
//			while(iterator.hasNext()) {
//				Wave temp = iterator.next();
				
	    	User currentUserAdminView = Main.getCurrentUser();
	    	currentUserAdminView = selectedUser;
	    	Main.setCurrentUserAdminView(currentUserAdminView);
	    	System.out.println("current selected user is" + Main.getCurrentUserAdminView());
	    
	    	Main m = new Main();
			m.changeScene( "viewSelectedUser.fxml");
	
	}
	
	public void removeUser(ActionEvent event) throws IOException {
		 int selectedID = userList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	User selectedUser = userList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedUser);
//	    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//	    	ListIterator<Wave> iterator = waveList.listIterator();
//			while(iterator.hasNext()) {
//				Wave temp = iterator.next();
				
	    	UserMap users = Main.getUserMap();
	    	users.remove(selectedUser.getUsername());
	    
	    	Main m = new Main();
			m.changeScene( "users.fxml");
	
	}
	
	public void editUser(ActionEvent event) throws IOException {
		 int selectedID = userList.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	User selectedUser = userList.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedUser);

	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		UserMap users = Main.getUserMap();
		LinkedList<User> userLinkedList = users.returnAllUsersInLinkedListForm();
		ListIterator<User> iterator2 = userLinkedList.listIterator();
	    while(iterator2.hasNext()) {
			User userName = iterator2.next();
			userList.getItems().add(userName); // adding names of waves in string form to listView
		}
		
	}
}
