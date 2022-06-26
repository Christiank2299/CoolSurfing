package application;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeMap;

import backend.Condition;
import backend.Continent;
import backend.Place;
import backend.Trip;
import backend.User;
import backend.UserMap;
import backend.TripStore;
import backend.Username;
import backend.Wave;
import backend.WaveId;
import backend.WaveMap;
import backend.WaveUtilities;
import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

// for spell  check take the given dictionary and turn them all into lower case then build the hash set, for every word the person types you will convert to 
// lower case first then you search for it. 
public class Main extends Application implements Comparable<UserMap> , Comparator<UserMap>, Serializable {
	private static Stage stg; // fake stage we need this to change the scene
	private static TripStore userStore;
	private static UserMap userMap;
	private static Continents continentArr;
	private static Continent[] continents;
	private static WaveMap waves;
	private static User CurrentUser;
	private static User CurrentUserAdminView; // for the user the admin is viewing
	private static Trip CurrentTrip;
	private static Wave selectedWave; // keeps track of the wave being eddited 

	
	
	
	public static void saveObject(String filePath, WaveMap o) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject((WaveMap)o);
			oos.close();
			System.out.println("Wrote in " + filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void saveObjectUser(String filePath, UserMap o) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			 oos.writeObject((UserMap)o);
			oos.close();
			System.out.println("Wrote in " + filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
			stg = primaryStage;
			primaryStage.setResizable(false);
			primaryStage.setTitle("Travel");
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("sample.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setOnCloseRequest(e -> {
				// save data structures 
			
				saveObjectUser("data/UserMap1.dat", userMap);
				saveObject("data/WaveMap1.dat", waves);
				//saveObject("data/TripList.dat", userStore);
			//	saveObject("data/ContinentsArr.dat", continentArr);
				// save id's
			//	saveObject("data/UserIdCounter.dat", User.getIdCounter());
			//	saveObject("data/WaveIdCounter.dat", Wave.getIdCounter());
			//	saveObject("data/TripIdCounter.dat", Trip.getIdCounter());
				
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String fxml) throws IOException {
		// this passes fxml file to which we want to change the scene
		// then we load it 
		// 14:40 minutes into 
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
	
	
	
	@Override
	public void init() throws IOException {
		
	  	continents = new Continent[7];
			Continent northAmerica = new Continent(3, "North America");
			Continent southAmerica = new Continent(4, "South America");
			Continent africa = new Continent(3, "Africa");
			Continent asia = new Continent(3, "Asia");
			Continent europe = new Continent(3, "Europe");
			Continent australia = new Continent(3, "Australia");
			Continent antarctica = new Continent(3, "Antarctica");
			continents[0] = northAmerica;
			continents[1] = southAmerica;
			continents[2] = africa;
			continents[3] = asia;
			continents[4] = europe;
			continents[5] = australia;
			continents[6] = antarctica;
			
			continentArr = new Continents(continents);
			
			Place newYork = new Place(northAmerica, 4, 3,  "New York");
			Place california = new Place(northAmerica, 4 , 3, "California");
			Place hawaii = new Place(northAmerica, 4 , 3, "Hawaii");
			Place brazil = new Place(southAmerica, 4, 2, "Brazil");
			Place namibia = new Place(africa, 2, 1, "Namibia");
			Place southAfrica = new Place(africa,4, 5, "South Africa");
			Place japan = new Place(asia, 1, 3, "Japan");
			Place portugal = new Place(europe, 5, 3, "Portugal");
			Place antarcticaPlace = new Place(antarctica,4, 2, "Antarctica Wave");
			Place westOz = new Place(australia, 4, 2, "West Oz");
//		
//		userMap = WaveUtilities.loadUserMap(); //userMap
//		waves = WaveUtilities.loadWaveMap();
//		userStore = WaveUtilities.loadTripList(); //tripStore
//		continentArr = WaveUtilities.loadContinents();
//		
//----------------------------------------------------------
	
	
	File destinationsFile = new File("data/WaveMap1.dat");
    if (!destinationsFile.exists()) {

//        TreeMap<Integer, Destination> destinationMap = new TreeMap<>();
        waves = new WaveMap();
  
		
		// create Places 
		// create Places 
	
		
		
				
		Wave ditchPlains = new Wave(newYork, "Intermediate", northAmerica, "High Risk", new Condition("Fair - Good", "3"), "Ditch Plains");
		Wave duneRoad = new Wave(newYork, "Intermediate", northAmerica, "High Risk", new Condition("Fair - Good", "3"), "Dune Road");
		Wave mavericks = new Wave(california, "Expert", northAmerica, "High Risk", new Condition("Epic", "5"), "Mavericks");
		Wave blacksBeach = new Wave(california, "Intermediate", northAmerica, "High Risk", new Condition("Good - Epic", "3"), "Blacks Beach");
		Wave pipeline = new Wave(hawaii, "Expert", northAmerica, "Moderate Risk", new Condition("Epic", "5"), "Pipeline");
		Wave jaws = new Wave(hawaii, "Expert", northAmerica, "Moderate Risk", new Condition("Good - Epic", "4"), "Jaws");
		Wave florionapolis = new Wave(brazil, "Intermediate - Expert", southAmerica, "High Risk", new Condition("Good", "4"), "Florionapolis");
		Wave skeletonBay = new Wave(namibia, "Expert", africa, "Low Risk", new Condition("Epic", "5"), "Skeleton Bay");
		Wave capeTown = new Wave(southAfrica, "Expert", africa, "Moderate Risk", new Condition("Good - Epic", "4"), "Cape Town");
		Wave jBay = new Wave(southAfrica, "Expert", africa, "Low Risk", new Condition("Good - Epic", "4"), "J-Bay");
		Wave sohan = new Wave(japan, "Beginner", asia, "Moderate Risk", new Condition("Poor - Fair", "2"), "Shohan");
		Wave nazareth = new Wave(portugal, "Expert", europe, "Moderate Risk", new Condition("Epic", "5"), "Nazareth");
		Wave antarcticaWave = new Wave(antarcticaPlace, "Intermediate - Expert", antarctica, "Very Low Risk", new Condition("Fair - Good", "2"), "Antarctica Wave");
		Wave westOzSlab = new Wave(westOz, "Expert", australia, "High Risk", new Condition("Epic", "2"), "West Oz Slab");
		

		
				
				
				
		waves.insert(ditchPlains);
		waves.insert(duneRoad);
		waves.insert(mavericks);
		waves.insert(blacksBeach); 
		waves.insert(pipeline);
		waves.insert(jaws);
		waves.insert(florionapolis);
		waves.insert(skeletonBay);
		waves.insert(capeTown);
		waves.insert(jBay); 
		waves.insert(sohan);
		waves.insert(nazareth);
		waves.insert(antarcticaWave);
		waves.insert(westOzSlab);
    
       
		
		
		
        try {
            FileOutputStream fosw = new FileOutputStream(destinationsFile);
            ObjectOutputStream oosw = new ObjectOutputStream(fosw);
            oosw.writeObject(waves);
            oosw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
    	FileInputStream fisw;
		try {
            waves = new WaveMap();
			fisw = new FileInputStream("data/WaveMap1.dat");
			ObjectInputStream oisw = new ObjectInputStream(fisw);
			waves = (WaveMap) oisw.readObject();
			oisw.close();
			System.out.println("waves "  );
			waves.dispaly();


		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
    
    
    
    
    
    
		
    File usersFile = new File("data/UserMap1.dat");
    if (!usersFile.exists()) {

//        TreeMap<Integer, Destination> destinationMap = new TreeMap<>();
    	userMap = new UserMap();
		User admin = new User(new Username("Ckraus99"), "Ctk020299!");
		admin.setAdmin(true);
		admin.setfName("Christian ");
		admin.setlName("Kraus");
		admin.setSkillLevel("Expert");
		admin.setDob("1999-02-02");
		
		userMap.insert(admin);
    
        try {
            FileOutputStream fosu = new FileOutputStream(usersFile);
            ObjectOutputStream oosu = new ObjectOutputStream(fosu);
            oosu.writeObject(userMap); 
            oosu.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    } else {
		FileInputStream fisu;
		try {
            userMap = new UserMap();
			fisu = new FileInputStream("data/UserMap1.dat");
			ObjectInputStream oisu = new ObjectInputStream(fisu);
			userMap = 	(UserMap) oisu.readObject() ;
			oisu.close();
			System.out.println("users" + userMap);
			userMap.dispaly();  // 
			

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
    
    
    
    
    
    
    
    
    
    
    

	} 
	

//		
//	waves = new WaveMap();
//		
	//  create continents 
//		continents = new Continent[7];
//		Continent northAmerica = new Continent(3, "North America");
//		Continent southAmerica = new Continent(4, "South America");
//		Continent africa = new Continent(3, "Africa");
//		Continent asia = new Continent(3, "Asia");
//		Continent europe = new Continent(3, "Europe");
//		Continent australia = new Continent(3, "Australia");
//		Continent antarctica = new Continent(3, "Antarctica");
//		continents[0] = northAmerica;
//		continents[1] = southAmerica;
//		continents[2] = africa;
//		continents[3] = asia;
//		continents[4] = europe;
//		continents[5] = australia;
//		continents[6] = antarctica;
//		
//		continentArr = new Continents(continents);
//		
//		// create Places 
//		// create Places 
//		Place newYork = new Place(northAmerica, 4, 3,  "New York");
//		Place california = new Place(northAmerica, 4 , 3, "California");
//		Place hawaii = new Place(northAmerica, 4 , 3, "Hawaii");
//		Place brazil = new Place(southAmerica, 4, 2, "Brazil");
//		Place namibia = new Place(africa, 2, 1, "Namibia");
//		Place southAfrica = new Place(africa,4, 5, "South Africa");
//		Place japan = new Place(asia, 1, 3, "Japan");
//		Place portugal = new Place(europe, 5, 3, "Portugal");
//		Place antarcticaPlace = new Place(antarctica,4, 2, "Antarctica Wave");
//		Place westOz = new Place(australia, 4, 2, "West Oz");
//		
//		
//				
//		Wave ditchPlains = new Wave(newYork, "Intermediate", northAmerica, "High Risk", new Condition("Fair - Good", "3"), "Ditch Plains");
//		Wave duneRoad = new Wave(newYork, "Intermediate", northAmerica, "High Risk", new Condition("Fair - Good", "3"), "Dune Road");
//		Wave mavericks = new Wave(california, "Expert", northAmerica, "High Risk", new Condition("Epic", "5"), "Mavericks");
//		Wave blacksBeach = new Wave(california, "Intermediate", northAmerica, "High Risk", new Condition("Good - Epic", "3"), "Blacks Beach");
//		Wave pipeline = new Wave(hawaii, "Expert", northAmerica, "Moderate Risk", new Condition("Epic", "5"), "Pipeline");
//		Wave jaws = new Wave(hawaii, "Expert", northAmerica, "Moderate Risk", new Condition("Good - Epic", "4"), "Jaws");
//		Wave florionapolis = new Wave(brazil, "Intermediate - Expert", southAmerica, "High Risk", new Condition("Good", "4"), "Florionapolis");
//		Wave skeletonBay = new Wave(namibia, "Expert", africa, "Low Risk", new Condition("Epic", "5"), "Skeleton Bay");
//		Wave capeTown = new Wave(southAfrica, "Expert", africa, "Moderate Risk", new Condition("Good - Epic", "4"), "Cape Town");
//		Wave jBay = new Wave(southAfrica, "Expert", africa, "Low Risk", new Condition("Good - Epic", "4"), "J-Bay");
//		Wave sohan = new Wave(japan, "Beginner", asia, "Moderate Risk", new Condition("Poor - Fair", "2"), "Shohan");
//		Wave nazareth = new Wave(portugal, "Expert", europe, "Moderate Risk", new Condition("Epic", "5"), "Nazareth");
//		Wave antarcticaWave = new Wave(antarcticaPlace, "Intermediate - Expert", antarctica, "Very Low Risk", new Condition("Fair - Good", "2"), "Antarctica Wave");
//		Wave westOzSlab = new Wave(westOz, "Expert", australia, "High Risk", new Condition("Epic", "2"), "West Oz Slab");
//		
//
//		
//				
//				
//				
//		waves.insert(ditchPlains);
//		waves.insert(duneRoad);
//		waves.insert(mavericks);
//		waves.insert(blacksBeach); 
//		waves.insert(pipeline);
//		waves.insert(jaws);
//		waves.insert(florionapolis);
//		waves.insert(skeletonBay);
//		waves.insert(capeTown);
//		waves.insert(jBay); 
//		waves.insert(sohan);
//		waves.insert(nazareth);
//		waves.insert(antarcticaWave);
//		waves.insert(westOzSlab);
//		
	
//		---------------------------------------------------------
		
		
		
		//-----------------------------------------------------------------------------------------------
		
		
		
		
		
		
	
	
	
	
	

	public static Trip getCurrentTrip() {
		return CurrentTrip;
	}

	public static void setCurrentTrip(Trip currentTrip) {
		CurrentTrip = currentTrip;
	}

	public static Continent[] getContinents() {
		return continents;
	}

	public static UserMap getUserMap() {
		return userMap;
	}

	public static TripStore getUserStore() {
		return userStore;
	}
	
	
	
	
	public static WaveMap getWaves() {
		return waves;
	}

	public static void setWaves(WaveMap waves) {
		Main.waves = waves;
	}

	public static User getCurrentUser() {
		return CurrentUser;
	}

	public static void setCurrentUser(User currentUser) {
		Main.CurrentUser = currentUser;
	}
	
	
	
	
	
	public static Wave getSelectedWave() {
		return selectedWave;
	}

	public static void setSelectedWave(Wave selectedWave) {
		Main.selectedWave = selectedWave;
	}

	public static User getCurrentUserAdminView() {
		return CurrentUserAdminView;
	}

	public static void setCurrentUserAdminView(User currentUserAdminView) {
		CurrentUserAdminView = currentUserAdminView;
	}

	@Override
	public int compareTo(UserMap o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(UserMap o1, UserMap o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
		
	

//		Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
//		primaryStage.setTitle("Hello World");
//		primaryStage.setScene(new Scene(root, 600, 400));
//		Scene scene = new Scene(root,600,400);
//
//		primaryStage.show();
//
//}
//
//public static void main(String[] args) {
//	launch(args);
//}
//}
