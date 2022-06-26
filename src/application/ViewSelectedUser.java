package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import backend.User;
import backend.UserMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewSelectedUser implements Initializable {
	@FXML
	private Label usernameLabel2;
	
	@FXML
	private Label nameLabel2;
	
	@FXML
	private Label skillLabel2;
	
	@FXML
	private Label loggedLabel2;
	
	@FXML
	private Label adminLabel;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button viewTravelHistory;
	
	@FXML
	private Label dobText;
	
	@FXML
	private Button makeAdminButton;
	
	
			
	private UserMap users = Main.getUserMap();
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		User currentUser = Main.getCurrentUser();
		if(currentUser.isAdmin() == true) {
			m.changeScene( "users.fxml");
		} else {
	
		m.changeScene( "afterLogin.fxml");
		}
	}
	
	
	public void makeAdmin(ActionEvent event) throws IOException {
		User user = Main.getCurrentUserAdminView();
		user.setAdmin(true);
		adminLabel.setText("Is An Administrator");
	}

	
	public void viewTravelHistory(ActionEvent event) throws IOException {
		
		
		Main m = new Main();
		m.changeScene("ViewTravelHistoryOfSelectedUser.fxml");
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    
		if(Main.getCurrentUserAdminView().isAdmin() == true) {
			adminLabel.setText("Is An Administrator");
		} else {
			adminLabel.setText("Is Not An Administrator");
		}
		User user = Main.getCurrentUserAdminView();
		
		usernameLabel2.setText(user.getUsername().getUsername());
		
		String name = (user.getfName() + user.getlName());
		System.out.println("name" + name);
		nameLabel2.setText(name);
		skillLabel2.setText(user.getSkillLevel());
		loggedLabel2.setText(Integer.toString(user.getTravelHistory().size()));
		dobText.setText(user.getDob());
		
		
	}
	
}
