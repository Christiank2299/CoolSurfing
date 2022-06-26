package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import backend.User;
import backend.UserMap;
import backend.Username;
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

public class AdminToolsPage implements Initializable {

	

	
	@FXML
	private Button createAccountButton;
	
	@FXML
	private Button addWaveButton;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button viewUsers;
	
	@FXML
	private Button removeUser;
	
	@FXML
	private ComboBox skillLevel;
	
	@FXML
	private Label wrongLogIn;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField firstName;
	
	@FXML
	private TextField lastName;

	@FXML
	private TextField password;
	
	@FXML
	private TextField newPassword2;
	
	@FXML
	private DatePicker birthday;
	
	private String skill;
	
	private UserMap userMap = Main.getUserMap();
	


	
	public void createAccount(ActionEvent event) throws IOException {
		 checkLoginInfo();
	}
	

		
		
	public void checkLoginInfo() throws IOException {	
		
		Main m = new Main();
		if (password.getText().toString().equals(newPassword2.getText().toString())) {
			User user = new User(new Username(username.getText()), password.getText());
			user.setfName(firstName.getText());
			user.setlName(lastName.getText());
			user.setSkillLevel(skill);
			user.setDob(birthday.getValue().toString());
			
			
			userMap.insert(user);
			userMap.dispaly();
			
		    
			
			m.changeScene("users.fxml"); // will be viewUser page once the page is made 
			
		} 
		

		
		else {
			wrongLogIn.setText("passwords do not match");
		}
	}


	
	public void goBack(ActionEvent event) throws IOException {
		Main m = new Main();
	
			m.changeScene( "bossTools.fxml");
		
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
	

	

		
	
	
	public void setSkillLevel(ActionEvent event) throws IOException {
		skill = skillLevel.getSelectionModel().getSelectedItem().toString();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 ObservableList<String> skillList = FXCollections.observableArrayList("Beginner", "Intermediate", "Advanced", "Expert", "Pro");
			skillLevel.setItems(skillList);
		
	}
}
