package backend;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;


public class UserMap implements Comparator<UserMap>, Serializable, Comparable<UserMap>{

	private TreeMap<Username, User> userMap;
	private int size;
	
	
	
	
	public UserMap() {
		userMap = new TreeMap<Username, User>();	
				
	}
	
	public void insert(User user) {
		Username u = user.getUsername();
		userMap.put(u, user);
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public User search(Username username) {
		return userMap.get(username);
	}
	
	public User searchString(String username) {
		Iterator<User> iterator2 = userMap.values().iterator();  
		while(iterator2.hasNext()) {
			User temp = iterator2.next();
			if(temp.getUsername().getUsername().contentEquals(username)) {
				return temp;
			}
		}
		
	return null	;
	}
	
	public boolean checkUsernameExistence(String username) { // 
		Iterator<User> iterator2 = userMap.values().iterator();  
		while(iterator2.hasNext()) {
			User temp = iterator2.next();
			if(temp.getUsername().getUsername().contentEquals(username)) {
				return true;
			} 
		}
		return false;
	}
	
    public boolean checkPasswordExistence(String password) {
		
    	Iterator<User> iterator2 = userMap.values().iterator();  
		while(iterator2.hasNext()) {
			User temp = iterator2.next();
			if(temp.getPassword().toString().contentEquals(password)) {
				return true;
			} 
		}
		return false;
	}
	
	
	public void dispaly() {
		Iterator<User> iterator2 = userMap.values().iterator();  
		while(iterator2.hasNext()) {
			User user = iterator2.next();
				System.out.println(user);	
		}
	}
	
	public LinkedList<User> returnAllUsersInLinkedListForm(){
		LinkedList<User> matches = new LinkedList<User>();
		Iterator<User> iterator = userMap.values().iterator();  
		while(iterator.hasNext()) {
			User user = iterator.next();
				matches.add(user);
		}
		return matches;
	}
		
	
	public User remove(Username username) {
		return userMap.remove(username);
	}
	
	public TreeMap<Username, User> getUserMap(){
		return userMap;
	}

	@Override
	public int compareTo(UserMap o) {
		// TODO Auto-generated method stub
		return this.userMap.get(o).compareTo(o.getUserMap().get(o));
	}

	@Override
	public int compare(UserMap o1, UserMap o2) {
		// TODO Auto-generated method stub
		return o1.userMap.get(o2).compareTo(o2.getUserMap().get(o2));
	}


	
	
		
	}

