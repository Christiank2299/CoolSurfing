package backend;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;



public class TripStore implements Serializable {
	
	private User user; 
	private LinkedList<Trip> list; // try and do this without making it static 
	private int nElems;
	
	// contructor
	public TripStore() {
		list = new LinkedList<Trip>();
	}
	
	// getter 
	public LinkedList<Trip> getTripStore() {
		return list;
	}
	
	// insert
	public void insert(Trip trip) {
		list.add(trip);
		nElems++;
	}
	
	public int size() {
		return nElems;
	}
	
	public void display() {
		ListIterator<Trip> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public Trip searchById(String id) {
		ListIterator<Trip> iterator = list.listIterator();
		while(iterator.hasNext()) {
			Trip temp = iterator.next();
			if(temp.getId().contentEquals(String.valueOf(id))) {
				return temp;
			}
		} return null;
	}
	
	
	public Trip deleteById(String id) {
		ListIterator<Trip> iterator = list.listIterator();
		while(iterator.hasNext()) {
			Trip temp = iterator.next();
			if(temp.getId().contentEquals(String.valueOf(id))) {
				list.remove(temp);
			}
		} return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
}
