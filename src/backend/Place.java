package backend;

import java.io.Serializable;
import java.util.Comparator;

public class Place implements Comparator<Place>, Comparable<Place>,  Serializable{

	private Continent continent;
	private int riskLevel;
	private int waveLevel;
	private WaveMap waves;
	private String name;
	private PlaceId id;
	private static int idCounter = 0;
	

	


	public Place(Continent continent,  int riskLevel, int waveLevel,  String name) {
		super();
		this.continent = continent;
		this.riskLevel = riskLevel;
		this.waveLevel = waveLevel;
		this.name = name;
		this.id = new PlaceId(String.valueOf(idCounter++));
	}
	
	
	public Place( String name) {
		this.name = name;
	}



	public WaveMap getWaves() {
		return waves;
	}


	public void setWaves(WaveMap waves) {
		this.waves = waves;
	}



	public PlaceId getId() {
		return id;
	}



	public Continent getContinent() {
		return continent;
	}


	public void setContinent(Continent continent) {
		this.continent = continent;
	}


	public int getRiskLevel() {
		return riskLevel;
	}


	public void setRiskLevel(int riskLevel) {
		this.riskLevel = riskLevel;
	}


	public int getWaveLevel() {
		return waveLevel;
	}


	public void setWaveLevel(int waveLevel) {
		this.waveLevel = waveLevel;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public int compareTo(Place o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}

	@Override
	public int compare(Place o1, Place o2) {
		// TODO Auto-generated method stub
		return  o1.id.compareTo(o2.getId());
		// otherwise try 0
	}
	
	


	@Override
	public String toString() {
		return "Place [continent=" + continent + ", riskLevel=" + riskLevel + ", waveLevel=" + waveLevel + ", name="
				+ name + "]";
	}
	
	
	
	
	
}
