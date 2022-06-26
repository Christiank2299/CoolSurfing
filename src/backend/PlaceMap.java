package backend;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class PlaceMap implements Comparator<PlaceMap>, Serializable, Comparable<PlaceMap> {

	private static TreeMap<PlaceId, Place> placeMap;
	private int size;
	
	public PlaceMap() {
		placeMap = new TreeMap<PlaceId, Place>();	
				
	}
	
	public void insert(Place place) {
		PlaceId id = place.getId();
	    placeMap.put(id, place);
		size++;
	}
	
	public int size() {
		return size;
	}
	// use size to display the number of waves currently installed on every screen 
	
	
	public Place search(PlaceId id) {
		return placeMap.get(id);
	}
	
	public void dispaly() {
		Iterator<Place> iterator2 = placeMap.values().iterator();  
		while(iterator2.hasNext()) {
			Place place = iterator2.next();
				System.out.println(place);	
		}
	}
	
	
	public Place remove(PlaceId id) {
		return placeMap.remove(id);
	}
	
	public static TreeMap<PlaceId, Place> getPlaceMap(){
		return placeMap;
	}

	@Override
	public int compareTo(PlaceMap o) {
		// TODO Auto-generated method stub
		return this.placeMap.get(o).compareTo(o.getPlaceMap().get(o));
	}

	@Override
	public int compare(PlaceMap o1, PlaceMap o2) {
		// TODO Auto-generated method stub
		return o1.placeMap.get(o2).compareTo(o2.getPlaceMap().get(o2));
	}

//	@Override
//	public int compareTo(WaveMap o) {
//		// TODO Auto-generated method stub
//		return this.waveMap.get(o).compareTo(o.getWaveMap().get(o));
//	}
//
//	@Override
//	public int compare(WaveMap o1, WaveMap o2) {
//		// TODO Auto-generated method stub
//		return o1.waveMap.get(o2).compareTo(o2.getWaveMap().get(o2));
//	}
//	
//	
//	
//	
//	
//	
//	


}
