package backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import application.Continents;



public class WaveUtilities implements Serializable {

	public static int loadIdUserCounter() { // loading data before program starts
		try {
			FileInputStream fis = new FileInputStream("data/UserIdCounter.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			int idCounter = (int) ois.readObject();
			ois.close();
			return idCounter;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int loadIdWaveCounter() { // loading data before program starts
		try {
			FileInputStream fis = new FileInputStream("data/WaveIdCounter.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			int idCounter = (int) ois.readObject();
			ois.close();
			return idCounter;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int loadIdTripCounter() { // loading data before program starts
		try {
			FileInputStream fis = new FileInputStream("data/TripIdCounter.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			int idCounter = (int) ois.readObject();
			ois.close();
			return idCounter;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
//	saveObject("Data/UserMap.dat", userMap);
//	saveObject("Data/WaveMap.dat", waves);
//	saveObject("Data/TripList.dat", userStore);
//	saveObject("Data/ContinentsArr.dat", continentArr);
	
	
	public static UserMap loadUserMap() {
		UserMap bag;
		FileInputStream fis;
		try {

			fis = new FileInputStream("data/UserMap.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			bag = (UserMap) ois.readObject();
			ois.close();
			System.out.println("users "  );
			bag.dispaly();
			return bag;

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

//		Student[] arr = Utilities.importStudents("Data/First Names.txt", "Data/Last Names.txt", "Data/Majors.txt");
//		Instructor[] arr2 = importInstructors("Data/First Names.txt", "Data/Last Names.txt", "Data/ranks.txt");
//		PersonBag personBag = new PersonBag(2000);
//		for (int i = 0; i < arr.length; i++) {
//			personBag.insert(arr[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			personBag.insert(arr2[i]);
//		}
//		return personBag;
		
		return null;
	}
	
	public static WaveMap loadWaveMap() {
		WaveMap bag;
		FileInputStream fis;
		try {

			fis = new FileInputStream("data/WaveMap1.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			bag = (WaveMap) ois.readObject();
			ois.close();
			System.out.println("waves" + bag);
			bag.dispaly();
			return bag;

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

//		Student[] arr = Utilities.importStudents("Data/First Names.txt", "Data/Last Names.txt", "Data/Majors.txt");
//		Instructor[] arr2 = importInstructors("Data/First Names.txt", "Data/Last Names.txt", "Data/ranks.txt");
//		PersonBag personBag = new PersonBag(2000);
//		for (int i = 0; i < arr.length; i++) {
//			personBag.insert(arr[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			personBag.insert(arr2[i]);
//		}
//		return personBag;
		
		return null;
	}
	
	
	public static TripStore loadTripList() {
		TripStore bag;
		FileInputStream fis;
		try {

			fis = new FileInputStream("data/TripList.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			bag = (TripStore) ois.readObject();
			ois.close();
			System.out.println("trips" + bag);
			bag.display();
			return bag;

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

//		Student[] arr = Utilities.importStudents("Data/First Names.txt", "Data/Last Names.txt", "Data/Majors.txt");
//		Instructor[] arr2 = importInstructors("Data/First Names.txt", "Data/Last Names.txt", "Data/ranks.txt");
//		PersonBag personBag = new PersonBag(2000);
//		for (int i = 0; i < arr.length; i++) {
//			personBag.insert(arr[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			personBag.insert(arr2[i]);
//		}
//		return personBag;
		
		return null;
	}
	
	public static Continents loadContinents() {
		Continents bag = null;
		FileInputStream fis;
		try {

			fis = new FileInputStream("data/ContinentsArr.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			bag = (Continents) ois.readObject();
			ois.close();
			System.out.println("continents" );
			bag.display();
			
			
			return bag;

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

//		Student[] arr = Utilities.importStudents("Data/First Names.txt", "Data/Last Names.txt", "Data/Majors.txt");
//		Instructor[] arr2 = importInstructors("Data/First Names.txt", "Data/Last Names.txt", "Data/ranks.txt");
//		PersonBag personBag = new PersonBag(2000);
//		for (int i = 0; i < arr.length; i++) {
//			personBag.insert(arr[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			personBag.insert(arr2[i]);
//		}
//		return personBag;
		
		return null;
	}

	
}
	

