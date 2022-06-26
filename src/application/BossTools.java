package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BossTools {

	@FXML
	private Button logOut1;
	
	@FXML
	private Button search1;
	
	@FXML
	private Button northAmerica1;
	
	@FXML
	private Button southAmerica1;
	
	@FXML
	private Button asia1;
	
	@FXML
	private Button australia1;
	
	@FXML
	private Button europe1;
	
	@FXML
	private Button antarctica1;
	
	@FXML
	private Button africa1;
	
	@FXML
	private Button adminTools;
	
	@FXML
	private Button viewProfile1;

	

	
	
	
	
	public void logOut1(ActionEvent event) throws IOException {
		Main.saveObjectUser("data/UserMap1.dat", Main.getUserMap());
		Main.saveObject("data/WaveMap1.dat", Main.getWaves());

		Main m = new Main();
		m.changeScene( "sample.fxml");
		
	}
	
	public void searchWaves1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene( "searchPage.fxml");
	}
	
	
	public void goToNA(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("northAmericaPage.fxml");
	}
	
	public void goToAsia1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("asiaPage.fxml");
	}
	
	public void goToAustralia1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("australiaPage.fxml");
	}
	
	public void goToEurope1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("europePage.fxml");
	}
	
	public void goToAntarctica1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("antarcticaPage.fxml");
	}
	
	public void goToAfrica1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("africaPage.fxml");
	}
	
	public void viewProfile1(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("profilePage.fxml");
	}
	
	public void goToSA(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("southAmericaPage.fxml");
	}
	
	public void goToAdminTools(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("adminToolsPage.fxml");
	}
	
	
}
