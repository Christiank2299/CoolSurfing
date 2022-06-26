package application;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import backend.Wave;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class AfterLogin {
	@FXML
	private Button logout;
	
	@FXML
	private Button search;
	
	@FXML
	private Button northAmerica;
	
	@FXML
	private Button southAmerica;
	
	@FXML
	private Button asia;
	
	@FXML
	private Button australia;
	
	@FXML
	private Button europe;
	
	@FXML
	private Button antarctica;
	
	@FXML
	private Button africa;
	
	@FXML
	private Button practice;
	
	@FXML
	private Button viewProfile;

	

	
	
	
	
	public void userLogOut(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "sample.fxml");
	}
	
	public void logOut1(ActionEvent event) throws IOException {
		
	}
	
	public void goToSearchPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "searchPage.fxml");
	}
	
	
	public void northAmericaPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("northAmericaPage.fxml");
	}
	
	public void asiaPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("asiaPage.fxml");
	}
	
	public void australiaPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("australiaPage.fxml");
	}
	
	public void europePage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("europePage.fxml");
	}
	
	public void antarcticaPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("antarcticaPage.fxml");
	}
	
	public void africaPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("africaPage.fxml");
	}
	
	public void viewProfile(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("profilePage.fxml");
	}
	
	public void southAmericaPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("southAmericaPage.fxml");
	}
	
	public void viewPracticeScreen(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("practice.fxml");
	}




	

}
