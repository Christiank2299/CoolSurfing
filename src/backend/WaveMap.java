package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.function.Predicate;



public class WaveMap implements Comparator<WaveMap>, Serializable, Comparable<WaveMap> {
	//
	private TreeMap<String, Wave> waveMap;
	private int size;
	
	public WaveMap() {
		waveMap = new TreeMap<String, Wave>();	
				
	}
	
	public void insert(Wave wave) {
		String id = wave.getId();
		waveMap.put(id, wave);
		size++;
	}
	
	public int size() {
		return size;
	}
	// use size to display the number of waves currently installed on every screen 
	
	
	public Wave search(String id) {
		return waveMap.get(id);
	}
	
	public LinkedList<Wave> searchPredicate(Predicate<Wave> predicate){
		LinkedList<Wave> matches = new LinkedList<Wave>();
		Iterator<Wave> iterator = waveMap.values().iterator();  
		while(iterator.hasNext()) {
			Wave wave = iterator.next();
			if (predicate.test(wave)) {
				matches.add(wave);
		}
		
	}
		return matches;
	}
	
	public LinkedList<Wave> returnAllWavesInLinkedListForm(){
		LinkedList<Wave> matches = new LinkedList<Wave>();
		Iterator<Wave> iterator = waveMap.values().iterator();  
		while(iterator.hasNext()) {
			Wave wave = iterator.next();
				matches.add(wave);
		}
		return matches;
	}
		
	
	

//	public ArrayList<Course> search(Predicate predicate){
//		ArrayList<Course> matchList = new ArrayList<>();
//		for (int i = 0; i < courseList.size(); i++ ) {
//			if (predicate.test(courseList.get(i))) {
//				matchList.add(courseList.get(i));
//			}
//		}
//		return matchList;
//	}
	
	public void dispaly() {
		Iterator<Wave> iterator2 = waveMap.values().iterator();  
		while(iterator2.hasNext()) {
			Wave wave = iterator2.next();
				System.out.println(wave);	
		}
	}
	
	
	public Wave remove(String id) {
		return waveMap.remove(id);
	}
	
	public TreeMap<String, Wave> getWaveMap(){
		return waveMap;
	}

	@Override
	public int compareTo(WaveMap o) {
		// TODO Auto-generated method stub
		return this.waveMap.get(o).compareTo(o.getWaveMap().get(o));
	}

	@Override
	public int compare(WaveMap o1, WaveMap o2) {
		// TODO Auto-generated method stub
		return o1.waveMap.get(o2).compareTo(o2.getWaveMap().get(o2));
	}


	
	
}
