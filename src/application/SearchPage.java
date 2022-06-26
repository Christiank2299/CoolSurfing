package application;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ResourceBundle;

import backend.Trip;
import backend.User;
import backend.Wave;
import backend.WaveMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class SearchPage implements Initializable {
	// this will only work if all filters are chosen
	// fix this with if statment for if some filters are empty then they are automatically any

	@FXML
    Button search;
	
	@FXML
    Button backButton;
	
	@FXML
	ComboBox placeBox;
	
	@FXML
	Button goToWave;
	
	@FXML
	ListView<String> waveView;
	
	@FXML
	ComboBox continentBox;
	
	@FXML
	ComboBox covidRiskLevel;
	
	@FXML
	ComboBox waveGrade;
	
	LinkedList<Wave> allMatches = new LinkedList<Wave>();
	
	LinkedList<Wave> placeMatches;
	
	LinkedList<Wave> continentMatches;
	
	LinkedList<Wave> riskMatches;
	
	LinkedList<Wave> waveGradeMatches;
	
	LinkedList<Wave> searchMatchesList = new LinkedList<Wave>();
	
	public void searchByPlace(ActionEvent event) throws IOException {
		String s = placeBox.getSelectionModel().getSelectedItem().toString();
		
        if (s.contentEquals("Any")) {
			WaveMap waveMap = Main.getWaves();
			LinkedList<Wave> allWaves = waveMap.returnAllWavesInLinkedListForm();
			
			placeMatches = allWaves;
			
		} 

		if (s.contentEquals("New York")) {
			
			placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("New York");
			});
		} 
		
		if (s.contentEquals("California")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("California");
			});
		}
		
		if (s.contentEquals("Hawaii")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("Hawaii");
			});
		}
		
		if (s.contentEquals("Brazil")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("Brazil");
			});
		}
		
		if (s.contentEquals("South Africa")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("South Africa");
			});
		}
		
		if (s.contentEquals("Namibia")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("Namibia");
			});
		}
		
		if (s.contentEquals("Japan")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("Japan");
			});
		}
		
		
		if (s.contentEquals("AntarcticaWave")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("Antarctica Wave");
			});
		}
		
		
		if (s.contentEquals("West Oz")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("West Oz");
			});
		}
		
		if (s.contentEquals("Portugal")) {
			 placeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getPlace().getName().equals("Portugal");
			});
		}
		
		
	
	
		System.out.println();
		allMatches.addAll(placeMatches);
		
		System.out.println("all matches after place search" + allMatches);
		System.out.println();
		System.out.println("place matches" + placeMatches);
	}
	
	
	
	
	public void searchByContinent(ActionEvent event) throws IOException {
		String s = continentBox.getSelectionModel().getSelectedItem().toString();
		
		   if (s.contentEquals("Any")) {
				WaveMap waveMap = Main.getWaves();
				LinkedList<Wave> allWaves = waveMap.returnAllWavesInLinkedListForm();
				
				continentMatches = allWaves;
			} 
		   
		if (s.contentEquals("North America")) {
			
			continentMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getContinent().getName().equals("North America");
			});
		} 
		
	    if (s.contentEquals("South America")) {
			
			continentMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getContinent().getName().equals("South America");
			});
		} 
	    
		
	    if (s.contentEquals("Europe")) {
			
			continentMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getContinent().getName().equals("Europe");
			});
		} 
	    
     	if (s.contentEquals("Asia")) {
		
		continentMatches = Main.getWaves().searchPredicate((wave) -> {
			return (wave).getContinent().getName().equals("Asia");
		});
     	} 
		
	    if (s.contentEquals("Australia")) {
			
			continentMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getContinent().getName().equals("Australia");
			});
		} 
		
	    if (s.contentEquals("Africa")) {
			
			continentMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getContinent().getName().equals("Africa");
			});
		} 
		
     	if (s.contentEquals("Antarctica")) {
			
			continentMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getContinent().getName().equals("Antarctica");
			});
		} 
		
		
	
		
	
	
     	System.out.println();
		allMatches.addAll(continentMatches);
		
		System.out.println("all matches after continent search" + allMatches);
		System.out.println();
		System.out.println("continent matches" + continentMatches);
	}
	
	public void searchByRiskLevel(ActionEvent event) throws IOException {
		String s = covidRiskLevel.getSelectionModel().getSelectedItem().toString();
		
		   if (s.contentEquals("Any")) {
				WaveMap waveMap = Main.getWaves();
				LinkedList<Wave> allWaves = waveMap.returnAllWavesInLinkedListForm();
				
				riskMatches = allWaves;
			} 
   
		
	    if (s.contentEquals("Very Low Risk")) {
			
			riskMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getRiskLevel().equals("Very Low Risk");
			});
		} 
	    
     	if (s.contentEquals("Low Risk")) {
		
		riskMatches = Main.getWaves().searchPredicate((wave) -> {
			return (wave).getRiskLevel().equals("Low Risk");
		});
     	} 
		
     	if (s.contentEquals("Moderate Risk")) {
    		
    		riskMatches = Main.getWaves().searchPredicate((wave) -> {
    			return (wave).getRiskLevel().equals("Moderate Risk");
    		});
         	} 
		
     	if (s.contentEquals("High Risk")) {
    		
    		riskMatches = Main.getWaves().searchPredicate((wave) -> {
    			return (wave).getRiskLevel().equals("High Risk");
    		});
         	} 
		
     	if (s.contentEquals("Very High Risk")) {
    		
    		riskMatches = Main.getWaves().searchPredicate((wave) -> {
    			return (wave).getRiskLevel().equals("Very High Risk");
    		});
         	} 
     	

    	
    	
     	System.out.println();
		allMatches.addAll(riskMatches);
		
		System.out.println("all matches after risk search" + allMatches);
		System.out.println();
		System.out.println("risk matches" + riskMatches);
		
	}
	
	public void searchByWaveGrade(ActionEvent event) throws IOException {
		
		String s = waveGrade.getSelectionModel().getSelectedItem().toString();
		
		   if (s.contentEquals("Any")) {
				WaveMap waveMap = Main.getWaves();
				LinkedList<Wave> allWaves = waveMap.returnAllWavesInLinkedListForm();
				
				waveGradeMatches = allWaves;
			} 
		   
	    if (s.contentEquals("1")) {
			
			waveGradeMatches = Main.getWaves().searchPredicate((wave) -> {
				return (wave).getCondition().getWaveGrade().contentEquals("1");
			});
		} 
	    
	    if (s.contentEquals("2")) {
			
	 			waveGradeMatches = Main.getWaves().searchPredicate((wave) -> {
	 				return (wave).getCondition().getWaveGrade().contentEquals("2");
	 			});
	 		} 
		
	    if (s.contentEquals("3")) {
			
	 			waveGradeMatches = Main.getWaves().searchPredicate((wave) -> {
	 				return (wave).getCondition().getWaveGrade().contentEquals("3");
	 			});
	 		} 
		
	    if (s.contentEquals("4")) {
			
	 			waveGradeMatches = Main.getWaves().searchPredicate((wave) -> {
	 				return (wave).getCondition().getWaveGrade().contentEquals("4");
	 			});
	 		} 
	    
	    if (s.contentEquals("5")) {
			
	 			waveGradeMatches = Main.getWaves().searchPredicate((wave) -> {
	 				return (wave).getCondition().getWaveGrade().contentEquals("5");
	 			});
	 		} 
	    

		
	    System.out.println();
		allMatches.addAll(waveGradeMatches);
		
		System.out.println("all matches after place search" + allMatches);
		System.out.println();
		System.out.println("place matches" + waveGradeMatches);
		System.out.println("-----------------------------------------");
		
		
	}
	
	@FXML
	public void searchFinal(ActionEvent event) throws IOException {
		waveView.getItems().clear(); // clear before new search
			ListIterator<Wave> iterator = allMatches.listIterator();
			
			
			while(iterator.hasNext()) {
				
				Wave temp = iterator.next();
				if(allMatches.contains(temp) && placeMatches.contains(temp) && continentMatches.contains(temp) && riskMatches.contains(temp) && waveGradeMatches.contains(temp)) {
					if(searchMatchesList.contains(temp)) { // if searchMatchesList already contains temp dont add temp
					
					} else {
						searchMatchesList.add(temp); // else add temp
					}
					System.out.println("result" + searchMatchesList);
					
					
				}
			}
			
			
			ListIterator<Wave> iterator2 = searchMatchesList.listIterator();
            while(iterator2.hasNext()) {
				Wave waveName = iterator2.next();
				waveView.getItems().add(waveName.getName()); // adding names of waves in string form to listView
			}
			

//			 String selectedWave = waveView.getSelectionModel().toString();
////		    	listOfNames.getItems().remove(selectedID);
//		    	    /// this string is the name of the selected wave 
//		    	System.out.println(selectedWave);
////		    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
////		    	ListIterator<Wave> iterator = waveList.listIterator();
////				while(iterator.hasNext()) {
////					Wave temp = iterator.next();
//					if(selectedWave.contentEquals("Ditch Plains")) {
//						Main m = new Main();
//						m.changeScene( "DitchPlainsPage.fxml");
//					
//					}
			searchMatchesList = new LinkedList<Wave>(); // pressing the search button also needs to clear the ListView before we begin
		}
	
	
	
	
	   @FXML
	    void goToSelectedWave(MouseEvent event) throws IOException{
	     int selectedID = waveView.getSelectionModel().getSelectedIndex();
//	    	listOfNames.getItems().remove(selectedID);
	    	String selectedWave = waveView.getItems().get(selectedID);      /// this string is the name of the selected wave 
	    	System.out.println(selectedWave);
//	    	LinkedList<Wave> waveList = waves.returnAllWavesInLinkedListForm(); // all waves 
//	    	ListIterator<Wave> iterator = waveList.listIterator();
//			while(iterator.hasNext()) {
//				Wave temp = iterator.next();
				if(selectedWave.contentEquals("Ditch Plains")) {
					Main m = new Main();
					m.changeScene( "DitchPlainsPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Dune Road")) {
					Main m = new Main();
					m.changeScene( "DuneRoadPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Mavericks")) {
					Main m = new Main();
					m.changeScene( "MavericksPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Blacks Beach")) {
					Main m = new Main();
					m.changeScene( "BlacksBeachPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Pipeline")) {
					Main m = new Main();
					m.changeScene( "PipelinePage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Jaws")) {
					Main m = new Main();
					m.changeScene( "JawsPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Florionapolis")) {
					Main m = new Main();
					m.changeScene( "FlorionapolisPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Skeleton Bay")) {
					Main m = new Main();
					m.changeScene( "SkeletonBayPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Cape Town")) {
					Main m = new Main();
					m.changeScene( "CapeTownPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("J-Bay")) {
					Main m = new Main();
					m.changeScene( "JBayPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Shohan")) {
					Main m = new Main();
					m.changeScene( "JohanPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Nazareth")) {
					Main m = new Main();
					m.changeScene( "NazarethPage.fxml");
				
				}
				
				if(selectedWave.contentEquals("Antarctica Wave")) {
					Main m = new Main();
					m.changeScene( "AntarcticaWavePage.fxml");
				
				}
				

				if(selectedWave.contentEquals("West Oz Slab")) {
					Main m = new Main();
					m.changeScene( "WestOzSlab.fxml");
				
				}
				
				
				
				
				
			}
	    
			
	
	
	
	// allMatches will return all the matches for each filter 
	// then pressing the search button, check for the Mathces that exist in every MatchList
	// if (wave existes in continentMatches && wave exists in placeMatches && wave exists in riskMatches && wave exists in waveGradeMatches){
	//    finalMathces.add(wave 
	
		public void goBack(ActionEvent event) throws IOException {
			Main m = new Main();
			User currentUser = Main.getCurrentUser();
			if(currentUser.isAdmin() == true) {
				m.changeScene( "bossTools.fxml");
			} else {
		
			m.changeScene( "afterLogin.fxml");
			}
		}
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		  ObservableList<String> list = FXCollections.observableArrayList("Any", "New York", "California", "Hawaii", "Brazil", "South Africa", "Namibia", "Japan", "AntarcticaWave", "West Oz", "Portugal" );
			placeBox.setItems(list);
			
			 ObservableList<String> list2 = FXCollections.observableArrayList("Any", "North America", "South America", "Asia", "Africa", "Australia", "Europe", "Antarctica");
				continentBox.setItems(list2);
				
				ObservableList<String> list3 = FXCollections.observableArrayList("Any", "Very Low Risk", "Low Risk", "Moderate Risk", "High Risk", "Very High Risk");
				covidRiskLevel.setItems(list3);
				
				ObservableList<String> list4 = FXCollections.observableArrayList("Any", "1", "2", "3", "4", "5");
				waveGrade.setItems(list4);
		
	}
	
	
}
