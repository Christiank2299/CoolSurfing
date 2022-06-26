package application;

import java.io.Serializable;
import java.util.Iterator;

import backend.Continent;
import backend.Wave;

public class Continents implements Serializable{
	

	private static Continent[] continents;

	public Continents(Continent[] arr) {
		this.continents = arr;
	}

	public static Continent[] getContinents() {
		return continents;
	}

	public static void setContinents(Continent[] continents) {
		Continents.continents = continents;
	}
	
	public void display() {
		for(int i = 0; i<continents.length; i++) {
			System.out.println(continents[i]);
		}
	}
	
	
	
}
