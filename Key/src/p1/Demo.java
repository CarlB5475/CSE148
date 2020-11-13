package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
	LinkedList<String> wordList = new LinkedList<>();
	LinkedList<String> uniqueWordList = new LinkedList<>();
	System.out.println("After cleaned: " + getLyrics());
	String[] words = getLyrics().split(" ");
	
//	String[] words = {"A", "A", "B", "B", "C", "A"};
	for (int i = 0; i < words.length; i++) {
	    wordList.add(words[i]);
	}
	
	for (int i = 0; i < words.length; i++) {
	    if (!uniqueWordList.contains(words[i])) {
		uniqueWordList.add(words[i]);
	    }
	}

	for(String s : uniqueWordList) {
	    int count = 0;
	   for(String word : wordList) {
	       if (s.equals(word)) {
		   count++;
	       }
	   }
	   System.out.println(s + ": " + count);
	}

    }

    private static String getLyrics() {
	String lyrics = "";
	try {
	    Scanner scanner = new Scanner(new File("Take Me Home"));
	    while (scanner.hasNextLine()) {
		lyrics += scanner.nextLine() + " ";
	    }
	    System.out.println("Lyrics after read from file: " + lyrics);
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	return cleanLyrics(lyrics);
    }

    private static String cleanLyrics(String lyrics) {
	return lyrics.replaceAll("[,'()]", "");

    }
}
