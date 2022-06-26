package backend;

import java.io.Serializable;

public class Condition implements Serializable {

	private String waveDescription;
	private String waveGrade;

	
	
	
	public Condition(String waveDescription, String waveGrade)  {
		super();
		this.waveDescription = waveDescription;
		this.waveGrade = waveGrade;
	}
	
	public Condition( String waveGrade) {
		super();

		this.waveGrade = waveGrade;
	}
	
	public String getWaveDescription() {
		return waveDescription;
	}
	public void setWaveDescription(String waveDescription) {
		this.waveDescription = waveDescription;
	}
	public String getWaveGrade() {
		return waveGrade;
	}
	public void setWaveGrade(String waveGrade) {
		this.waveGrade = waveGrade;
	}

	@Override
	public String toString() {
		return "Condition [waveDescription=" + waveDescription + ", waveGrade=" + waveGrade + "]";
	}

	
}
