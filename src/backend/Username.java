package backend;

import java.io.Serializable;
import java.util.Comparator;

public class Username implements Comparator<Username>, Comparable<Username>, Serializable {
	
	private String username;
	
	public Username(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Username: " + username + " ";
	}



	@Override
	public int compareTo(Username o) {
		// TODO Auto-generated method stub
		return this.username.compareTo(o.getUsername());
	}

	@Override
	public int compare(Username o1, Username o2) {
		// TODO Auto-generated method stub
		return  o1.username.compareTo(o2.getUsername());
		// otherwise try 0
	}
	
	
	

}
