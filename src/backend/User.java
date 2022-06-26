package backend;

import java.io.Serializable;
import java.util.Comparator;




public class User implements Comparator<User>, Serializable, Comparable<User> {
//	public abstract class Person implements Serializable {
		private Username username;
		private TripStore travelHistory = new TripStore();
		private String password;
		private String fName;
		private String lName;
		private boolean isAdmin;
		private String id;
		private static int idCounter = 0;
		private String skillLevel;
		private String dob;
		
	

		public User(Username username, String password) {
			this.username = username;
			this.password = password;
			this.id = String.valueOf(idCounter++);
		}
		
		
		public String getDob() {
			return dob;
		}



		public void setDob(String dob) {
			this.dob = dob;
		}


		public TripStore getTravelHistory() {
			return travelHistory;
		}
		
		



		public void setTravelHistory(TripStore travelHistory) {
			this.travelHistory = travelHistory;
		}



		public String getSkillLevel() {
			return skillLevel;
		}

		public void setSkillLevel(String skillLevel) {
			this.skillLevel = skillLevel;
		}

		public Username getUsername() {
			return username;
		}



		public void setUsername(Username username) {
			this.username = username;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public boolean isAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}

		public static int getIdCounter() {
			return idCounter;
		}

		public static void setIdCounter(int idCounter) {
			User.idCounter = idCounter;
		}

		public String getId() {
			return id;
		}

		@Override
		public String toString() {
			return "User " + username + ", isAdmin=" + isAdmin + ", ID =" + id + "";
		}



		@Override
		public int compareTo(User o) {
			return this.username.getUsername().compareTo(o.getUsername().getUsername());
			
		}



		@Override
		public int compare(User o1, User o2) {
			// TODO Auto-generated method stub
			return o1.username.compareTo(o2.getUsername());
		}
		
		


}
