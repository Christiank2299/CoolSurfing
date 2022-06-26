package backend;

import java.io.Serializable;
import java.util.HashSet;

public class Dictionary implements Serializable {

	private static HashSet<String> dictionary;
	
	public Dictionary (int maxSize) {
		dictionary  = new HashSet<String>();
	}
	
	public void insert(String word) {
		dictionary.add(word);
	}
	
	public boolean search(String word) {
		return dictionary.contains(word);
	}

	public static HashSet<String> getDictionary() {
		return dictionary;
	}

	public static void setDictionary(HashSet<String> dictionary) {
		Dictionary.dictionary = dictionary;
	}
	
	
}
