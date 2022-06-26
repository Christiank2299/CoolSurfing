package backend;

import application.Main;

public class UserStoreTest {

	public static void main(String[] args) {
		
	    TripStore userList = Main.getUserStore();
	    Username name1 = new Username("Christian");
	    Username name2 = new Username("Christian");
	    Username name3 = new Username("Christian");
	    
	    
		User u1 = new User(name1, "Kraus");
		User u2 = new User(name2, "Doe");
		User u3 = new User(name3, "Sullivan");
		
		userList.insert(u1);
		userList.insert(u2);
		userList.insert(u3);
		
		System.out.println(userList.searchById("1"));
		
		userList.display();
		
		userList.deleteById("1");
		
		userList.display();
		
		


	}

}
