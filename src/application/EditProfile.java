package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import backend.User;
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

public class EditProfile implements Initializable  {
	    
	    @FXML
	    private TextField lastName;

	    @FXML
	    private TextField firstName;
	    
	    @FXML
	    private Label wrongLogIn;

	    @FXML
	    private TextField username;

	    @FXML
	    private TextField password;

	    @FXML
	    private TextField newPassword2;

	    @FXML
	    private DatePicker birthday;

	    @FXML
	    private ComboBox skillLevel;

	    @FXML
	    private Button saveChangesButton;

	    @FXML
	    private Button backButton;

	    private String skill;
	    
	    
	    @FXML
	    void goBack(ActionEvent event) throws IOException {
	    	Main m = new Main();
			m.changeScene( "profilePage.fxml");
	    }

	    @FXML
	    void saveChanges(ActionEvent event) throws IOException {
            User currentUser = Main.getCurrentUser();
	    	if(!(lastName.getText().contentEquals("") )) {
	    		currentUser.setlName(lastName.getText());
	    	} 
	    	
	    	if(!(firstName.getText().contentEquals(""))) {
	    		currentUser.setfName(firstName.getText());
	    	} 
	    	
	    	if(!(username.getText().contentEquals(""))) {
	    		currentUser.setUsername(new Username(username.getText()));;
	    	} 
	    	
	    	if (password.getText().toString().equals(newPassword2.getText().toString())) {
	    		currentUser.setPassword(password.getText());
	    	} else {
				wrongLogIn.setText("passwords do not match");
			}
	    	
	    	currentUser.setDob(birthday.getValue().toString());
	    	
	    	currentUser.setSkillLevel(skill);
	    	
	    	Main m = new Main();
			m.changeScene( "profilePage.fxml");
	    
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
