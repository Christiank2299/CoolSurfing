package backend;

import java.io.Serializable;
import java.util.Comparator;

public class Wave implements Comparator<Wave>, Serializable, Comparable<Wave> {
	
	
	private Continent continent; 
	private String riskLevel;
	private String skillLevel;
	private Condition condition;
	
	private Place place;
	private String name;
	private String id;
	private static int idCounter = 0;
	




	public Wave(Place place, String skillLevel,  Continent continent, String riskLevel, Condition condition, String name) {
		super();
	
		
		this.place = place;
		this.continent = continent;
		this.riskLevel = riskLevel;
		this.skillLevel = skillLevel;
		this.condition = condition;
		this.name = name;
		this.id = String.valueOf(idCounter++);
	
	}
	
	public Wave(String skillLevel,   String riskLevel,  String name, Place place ) {
		super();
	
		
		this.place = place;
		
		this.riskLevel = riskLevel;
		this.skillLevel = skillLevel;
		
		this.name = name;
		this.id = String.valueOf(idCounter++);
	
	}
	

	public Wave( String skillLevel,  String riskLevel, String name) {
		super();
	
		
		this.place = place;

		this.riskLevel = riskLevel;
		this.skillLevel = skillLevel;
		this.name = name;
		this.id = String.valueOf(idCounter++);
	
	}
	
	
	
	
	
	public static int getIdCounter() {
		return idCounter;
	}


	public static void setIdCounter(int idCounter) {
		Wave.idCounter = idCounter;
	}


	public String getId() {
		return id;
	}





	public Place getPlace() {
		return place;
	}




	public void setPlace(Place place) {
		this.place = place;
	}




	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}



	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Wave o) {
		return this.id.compareTo(o.getId());
		
	}



	@Override
	public int compare(Wave o1, Wave o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}
	


	@Override
	public String toString() {
		return "Wave: " + name + ". " + continent + ", Covid Risk Level: " + riskLevel + ", Conditions: " + condition  + ", Recommended Skill Level: " + skillLevel + "ID: " + id;
	}


	
	

	
}
