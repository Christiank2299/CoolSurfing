package backend;

import java.io.Serializable;

public class Trip implements Serializable{

	private User user;
	private int duration;
	private Wave wave;
	private String description;
	private String arrivalDate;
	private String departutreDate;
	private String id;
	
	
	
	
	
	
	
	
	

	private static int idCounter = 0;
	
	public Trip( User user, String arrivalDate, String departureDate, Wave wave, String description) {
		super();
		this.user = user;
		this.arrivalDate = arrivalDate;
		this.departutreDate = departureDate;
		this.id = String.valueOf(idCounter++);
		this.wave = wave;
		this.description = description;
	}

	
	
	
	public String getId() {
		return id;
	}






	public String getArrivalDate() {
		return arrivalDate;
	}




	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}




	public String getDepartutreDate() {
		return departutreDate;
	}




	public void setDepartutreDate(String departutreDate) {
		this.departutreDate = departutreDate;
	}



	

	public static int getIdCounter() {
		return idCounter;
	}




	public static void setIdCounter(int idCounter) {
		Trip.idCounter = idCounter;
	}




	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Wave getWave() {
		return wave;
	}

	public void setWave(Wave wave) {
		this.wave = wave;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public String toString() {
		return "Trip:  " + " Wave: " + wave + ", Journal: " + description
				+ ", Arrival Date: " + arrivalDate + ", Departutre Date: " + departutreDate + "]";
	}

	
	

	
	
	
}
