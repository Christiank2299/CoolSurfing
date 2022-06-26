package backend;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import application.Main;



public class TreeMapPractice {

	public static void main(String[] args) {
		//UserMap users = Main.getUserMap();
		UserMap users = new UserMap();
		// Users is null because Main is never being run. If Main was being run then the JavaFX app would be opening 
		// the code works if I use it in 
		
		
		Username name1 = new Username("Christian");
		
		User u1 = new User(name1, "Kraus");
		User u2 = new User(new Username("Ryan"), "Doe");
		User u3 = new User(new Username("Christian1"), "Sullivan");
		users.insert(u1);
		users.insert(u2);
		users.insert(u3);
		
		
		users.dispaly();
		System.out.println();
		
		System.out.println(users.search(name1));
		System.out.println();
		
		users.remove(u2.getUsername());
		System.out.println();
		
		users.dispaly();
		
		
		
		

	}

}
