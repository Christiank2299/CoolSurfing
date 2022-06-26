package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

import backend.Dictionary;
import backend.Trip;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class EditTrip {
	
	
	    @FXML
	    private TextArea newEntry;
	    
	    @FXML
	    private TextArea spellCheck;
	    
	    @FXML
	    private Label spellLabel;

	    @FXML
	    private Button saveEntry;
	    
	    @FXML
	    private Button backButton;
	    
	    private static Dictionary dictionary;

	    
		public static Dictionary fillDictionary() {
			
			LinkedList<String> wordList = new LinkedList<>();
			boolean endOfFile = false;
			
			try {
				FileReader fileReader = new FileReader("data/dictionary (1).txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				while(!endOfFile) {
					String word = bufferedReader.readLine();
					if(word != null) {
						word = word.toLowerCase();
						wordList.add(word);
						
					} else {
						endOfFile = true;
					}
				}
				
			} catch (IOException e){
				return null;
			}
			
			Dictionary dictionary1 = new Dictionary(wordList.size() * 3);
			ListIterator<String> iterator2 = wordList.listIterator();
		    while(iterator2.hasNext()) {
				String word = iterator2.next();
				dictionary1.insert(word);// adding names of waves in string form to listView
			}
			
			return dictionary1;
			
			}
		
	    @FXML
	    void saveJournalEntry(ActionEvent event) throws IOException {
	    	spellLabel.setText("");
	    	spellCheck.setText("");
	    	
	    	dictionary = fillDictionary();
	    	 Trip currentTrip = Main.getCurrentTrip();
             String newJournal = newEntry.getText().toLowerCase();
           String incorrectWords = "";
             String[] arr = newJournal.split(" ");
             for(int i = 0; i < arr.length; i++) {
     			if(dictionary.search(arr[i])) {
     				
     			} else {
     				spellLabel.setText("Incrrectly Spelled");
     				incorrectWords += arr[i] + " ";
     		}
             
             
     			spellCheck.setText(incorrectWords);
             
             currentTrip.setDescription(newJournal);
         
             }
             
	    }
	    
	    @FXML
	    void goBack(ActionEvent event) throws IOException{
	    	Main m = new Main();
			m.changeScene( "viewTrip.fxml");
	    }

}
