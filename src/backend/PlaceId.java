package backend;

import java.io.Serializable;
import java.util.Comparator;

public class PlaceId implements Comparator<PlaceId>, Comparable<PlaceId>, Serializable{

	private String id;
	
	

	public PlaceId(String id) {
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
		return "PlaceId: " + id + "]";
	}



	@Override
	public int compare(PlaceId o1, PlaceId o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

	@Override
	public int compareTo(PlaceId o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}
	
	
	
	
}