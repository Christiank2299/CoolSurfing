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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProfilePage implements Initializable{

	@FXML
	private Label usernameLabel2;
	
	@FXML
	private Label nameLabel2;
	
	@FXML
	private Label skillLabel2;
	
	@FXML
	private Label loggedLabel2;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button editProfile;
	
	
	@FXML
	private Button viewTravelHistory;
	
	@FXML
	private Label dobText;
	
	
			
	private UserMap users = Main.getUserMap();
	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
		User currentUser = Main.getCurrentUser();
		if(currentUser.isAdmin() == true) {
			m.changeScene( "bossTools.fxml");
		} else {
	
		m.changeScene( "afterLogin.fxml");
		}
	}
	
	@FXML
	public void viewTravelHistory(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("viewTravelHistoryCurrent.fxml");
	}
	
	@FXML
	public void editUserProfile(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("editProfile.fxml");
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		User user = Main.getCurrentUser();
		
		usernameLabel2.setText(user.getUsername().getUsername());
		
		String name = (user.getfName() + user.getlName());
		System.out.println("name" + name);
		nameLabel2.setText(name);
		skillLabel2.setText(user.getSkillLevel());
		loggedLabel2.setText(Integer.toString(user.getTravelHistory().size()));
		dobText.setText(user.getDob());
		
		
	}
	
	
}
