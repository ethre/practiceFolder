package mooc;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsP {

	public static void main(String[] args) {
		String word1 = "Musical";
		String word2 = "Instruments";
		
		System.out.println(word1 + " " + word1.length());
		System.out.println(word2 + " " + word2.length());
		
		String banana = new String("Banana");
		
		System.out.println(banana);
		
		ArrayList<String> wordList = new ArrayList<String>();
		
		wordList.add("Musical");
		wordList.add("Instruments");
		
		System.out.println(wordList.contains("Musical"));
		System.out.println(wordList.size());
		
		wordList.add("Free");
		
		System.out.println(wordList.size());
		
		for(String word : wordList) {
			System.out.println(word);
		}
		
		Collections.sort(wordList);
		
		for(String word : wordList) {
			System.out.println(word);
		}
		
		Collections.shuffle(wordList);
		
		for(String word : wordList) {
			System.out.println(word);
		}
	}

}
