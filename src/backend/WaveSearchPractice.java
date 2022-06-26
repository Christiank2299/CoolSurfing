package backend;

import java.util.ArrayList;
import java.util.LinkedList;

import p4.Course;

public class WaveSearchPractice {

	
	public static void main(String[] args) {
//  create continents 
		Continent[] continents = new Continent[7];
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
		
		// create Places 
		Place newYork = new Place(northAmerica, 4, 3,  "New York");
		Place california = new Place(northAmerica, 4 , 3, "California");
		Place hawaii = new Place(northAmerica, 4 , 3, "Hawaii");
		
		Wave ditchPlains = new Wave(newYork, "Intermediate", northAmerica, 3, new Condition("Fair - Good", 3), "Ditch Plains");
		Wave rockAway = new Wave(newYork, "Intermediate", northAmerica, 3, new Condition("Fair - Good", 3), "RockAway");
		Wave mavericks = new Wave(california, "Expert", northAmerica, 3, new Condition("Epic", 5), "Mavericks");
		Wave blacksBeach = new Wave(california, "Intermediate", northAmerica, 3, new Condition("Good - Epic", 4), "Blacks Beach");
		Wave pipeline = new Wave(hawaii, "Expert", northAmerica, 3, new Condition("Epic", 5), "Pipeline");
     	Wave jaws = new Wave(hawaii, "Expert", northAmerica, 3, new Condition("Good - Epic", 4), "Jaws");

		WaveMap waves = new WaveMap();
		
		
		
		waves.insert(ditchPlains);
		waves.insert(rockAway);
		waves.insert(mavericks);
		waves.insert(blacksBeach); 
		waves.insert(pipeline);
		waves.insert(jaws);
		waves.dispaly();
		System.out.println();
		

		System.out.println(waves.search(new WaveId("1")));
		System.out.println();
		
		waves.remove(new WaveId("3"));
		waves.dispaly();
		System.out.println();
		
//		ArrayList<Course> arr2 = theBag.search((c) -> {
//			return ((Course)c).getTitle().equalsIgnoreCase("ABC");
//		});
//		System.out.println(arr2);
		
		LinkedList<Wave> matches = waves.searchPredicate( (wave) -> {
			return (wave).getContinent().equals(northAmerica);
		});
		
		System.out.println(matches);
		
		
		
//		WaveMap nyWaves = new WaveMap();
//		// Create waves for NY
//		Wave ditchPlains = new Wave(newYork, "Intermediate", northAmerica, 3, new Condition("Fair - Good", 3), "Ditch Plains");
//		Wave rockAway = new Wave(newYork, "Intermediate", northAmerica, 3, new Condition("Fair - Good", 3), "RockAway");
//	
//		
//		nyWaves.insert(ditchPlains);
//		nyWaves.insert(rockAway);
//		nyWaves.dispaly();
//		
//		WaveMap californiaWaves = new WaveMap();
//		// Create waves for California 
//		Wave mavericks = new Wave(california, "Expert", northAmerica, 3, new Condition("Epic", 5), "Mavericks");
//		Wave blacksBeach = new Wave(california, "Intermediate", northAmerica, 3, new Condition("Good - Epic", 4), "Blacks Beach");
//		
//		
//		californiaWaves.insert(mavericks);
//		californiaWaves.insert(blacksBeach); 
//		californiaWaves.dispaly();
//		
//		WaveMap hawaiiWaves = new WaveMap();
//		// Create waves for Hawaii
//		Wave pipeline = new Wave(hawaii, "Expert", northAmerica, 3, new Condition("Epic", 5), "Pipeline");
//		Wave jaws = new Wave(hawaii, "Expert", northAmerica, 3, new Condition("Good - Epic", 4), "Jaws");
//		hawaiiWaves.insert(pipeline);
//		hawaiiWaves.insert(jaws);
//		hawaiiWaves.dispaly();
//		System.out.println();
//		
//		
//		
//		System.out.println(nyWaves.search(new WaveId("1")));
//		System.out.println();
//
//		nyWaves.remove(new WaveId("1"));
//		nyWaves.dispaly();

		
		
		
	
		
		
		
		
		
		
}


	
}