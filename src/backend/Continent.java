package backend;

import java.io.Serializable;

public class Continent implements Serializable {

	private int riskLevel;
	private String name;
	
	
	// make a continent search bar where you can click a continent and it will bring you to the continent page.
	public Continent(int riskLevel, String name) {
		super();
		this.riskLevel = riskLevel;
		this.name = name;
	}


	public int getRiskLevel() {
		return riskLevel;
	}


	public void setRiskLevel(int riskLevel) {
		this.riskLevel = riskLevel;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Continent [riskLevel=" + riskLevel + ", name=" + name + "]";
	}


	
	
	
	
}
