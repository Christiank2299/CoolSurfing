package application;



import java.io.IOException;

import backend.User;
import backend.UserMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {

	@FXML
	private Button login;
	
	@FXML
	private Button createNewUser;
	
	@FXML
	private Label wrongLogIn;
	
	@FXML
	private TextField username;

	@FXML
	private PasswordField password;
	
	public void userLogIn(ActionEvent event) throws IOException {
		 checkLogin();
	}
	
	public void newUserButton(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "createAccount.fxml");
	}
	
		
		
	public void checkLogin() throws IOException {	
		
		Main m = new Main();
		Main n = new Main();
		
		
		UserMap users = Main.getUserMap();
		System.out.println(users.checkUsernameExistence(username.getText()));
		System.out.println(users.checkPasswordExistence(password.getText()));
		users.dispaly();
		
		// 1st check if username exists 2nd check if username matches password
		if (users.checkUsernameExistence(username.getText()) == true) {
		User match = users.searchString(username.getText());
			if(match.getPassword().toString().contentEquals(password.getText())) {
				
				wrongLogIn.setText("Success!");
				User currentUser = Main.getCurrentUser();
				currentUser = match;
				Main.setCurrentUser(currentUser);
				System.out.println("Current user: " + Main.getCurrentUser().toString());
			   if(match.isAdmin() == true) {
				   m.changeScene("bossTools.fxml");
			   } else {
				
				m.changeScene("afterLogin.fxml");
			   }
			} else {
				wrongLogIn.setText("Username exists but password is incorrect");
			}
			
		
		
		
		
			
		} 
		
		
		else if (username.getText().isEmpty() && password.getText().isEmpty()) {
			wrongLogIn.setText("Please enter your data");
			
		}
		
		else {
			wrongLogIn.setText("Wrong username or password");
			
		}
	}
	
}
