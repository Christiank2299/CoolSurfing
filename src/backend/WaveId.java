package backend;

import java.io.Serializable;
import java.util.Comparator;

public class WaveId implements Comparator<WaveId>, Comparable<WaveId>, Serializable{

	private String id;
	
	

	public WaveId(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "WaveId: " + id + "]";
	}



	@Override
	public int compare(WaveId o1, WaveId o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

	@Override
	public int compareTo(WaveId o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}
	
	
	
	
}
