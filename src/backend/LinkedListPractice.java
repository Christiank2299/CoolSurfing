package backend;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<User> list = new LinkedList<User>();
		
		User u1 = new User("Christian", "Kraus");
		User u2 = new User("Ryan", "Doe");
		User u3 = new User("Christian", "Sullivan");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
	//	ListIterator<User> iterator = list.listIterator(); // create iterator after list is filled 
	//	list.remove(iterator.next());
		
		ListIterator<User> iterator2 = list.listIterator();
		while(iterator2.hasNext()) {          // printing out all the items in the list
		System.out.println(iterator2.next());
		
		}
		
		// ------------------------------------------------------------
		 // search method 
		
		System.out.println();
		ListIterator<User> iterator3 = list.listIterator();
		while(iterator3.hasNext()) {
			User utemp = iterator3.next();
			if(utemp.getId().contentEquals(String.valueOf(1))) {
				System.out.println(utemp);
			}
		}
		
		//-----------------------------------------------------------
		 // remove method 
		
		System.out.println();
		ListIterator<User> iterator4 = list.listIterator();
		while(iterator4.hasNext()) {
			User temp = iterator4.next();
			if(temp.getId().contentEquals(String.valueOf(1))) {
				list.remove(temp);
				
			}
		}
		
		//-----------------------------------------------------------
		 // display
		
		ListIterator<User> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
