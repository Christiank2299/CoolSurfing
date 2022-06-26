package backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SpellCheckPractice {

	
	private static Dictionary dictionary;
	
	public static void main(String[] args) {
//		
//		dictionary = new Dictionary(20);
//		dictionary.insert("1");
//		dictionary.insert("2");
//		dictionary.insert("3");
//		dictionary.insert("4");
//		dictionary.insert("5");
//		dictionary.insert("6");
//		dictionary.insert("7");
//		dictionary.insert("8");
//		dictionary.insert("9");
//		dictionary.insert("10");
		
		String str = " ";
		String str2 = "hi";
		String
		dictionary = SpellCheckPractice.fillDictionary();
	
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String[] arr = word.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			if(dictionary.search(arr[i])) {
				System.out.println(arr[i] + " is spelt correctly ");
			} else {
				System.out.println(arr[i] + " is spelt incorrectly ");
		}
		//stringtoStringArray 
		
	}
		
	}
		

	
	
	public static Dictionary fillDictionary() {
	
	LinkedList<String> wordList = new LinkedList<>();
	boolean endOfFile = false;
	
	try {
		FileReader fileReader = new FileReader("data/dictionary (1).txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while(!endOfFile) {
			String word = bufferedReader.readLine();
			if(word != null) {
				word = word.toLowerCase();
				wordList.add(word);
				
			} else {
				endOfFile = true;
			}
		}
		
	} catch (IOException e){
		return null;
	}
	
	Dictionary dictionary1 = new Dictionary(wordList.size() * 3);
	ListIterator<String> iterator2 = wordList.listIterator();
    while(iterator2.hasNext()) {
		String word = iterator2.next();
		dictionary1.insert(word);// adding names of waves in string form to listView
	}
	
	return dictionary1;
	
	}
}
