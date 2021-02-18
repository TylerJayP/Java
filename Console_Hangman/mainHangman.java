package A01Hangman;

import java.util.Scanner;

public class mainHangman {

	private static String[] wordsToGuess = {"utah", "computer", "cold", "rain", "california"};
	private static String wordRand = wordsToGuess[(int) (Math.random() * wordsToGuess.length)];
	private static String underline = new String(new char[wordRand.length()]).replace("\0", "_");
	private static int count = 0;
	private static int wordLength = wordRand.length();
	
	public static void main(String[] args) {
				
		Scanner guess = new Scanner(System.in);
		
		startHangman();
		
		while(count < 6 && underline.contains("_")) {
			
			hangmanPole();
			
			System.out.printf("Word To Guess: %s. There are %d letters in the word", underline, wordLength);
		
			System.out.print("\nYour guess: ");
	
			String userGuessing = guess.next();
			
			hanging(userGuessing);
		
	
			}
		 
		guess.close();

		
		}
		
		

	public static void hanging (String userGuessing) {
		
		String newUnderline = "";
		
		for(int i = 0; i < wordRand.length(); i++) {
			
			if(wordRand.charAt(i) == userGuessing.charAt(0)) {
				
				newUnderline += userGuessing.charAt(0);
				
			}else if (underline.charAt(i) != '_') {
				
				newUnderline += wordRand.charAt(i);
				
			}else {
				
				newUnderline += "_";
				
			}
			
		}
		
		if (underline.equals(newUnderline)) {
			
			count++;
			hangmanPole();
			
		}else {
			
			underline = newUnderline;
			
		}
		
		if (underline.equals(wordRand)) {
			
			System.out.println("You figured out the word! Good job! The word was " + wordRand);
			
		}
		
	}
	
	public static void hangmanPole () {
		
	
		if(count == 1) {
			
			System.out.println(" ;--,");
			System.out.println(" |  o");
			System.out.println(" |");
			System.out.println(" |");
		    System.out.println("_|_____");
		    
		}
		
		if(count == 2) {
			
			System.out.println(" ;--,");
			System.out.println(" |  o");
			System.out.println(" |  |");
			System.out.println(" |");
		    System.out.println("_|_____");
		    
		}
		
		if(count == 3) {
			
			System.out.println(" ;--,");
			System.out.println(" |  o");
			System.out.println(" | /|");
			System.out.println(" |");
		    System.out.println("_|_____");
		    
		}
		
		if(count == 4) {
			
			System.out.println(" ;--,");
			System.out.println(" |  o");
			System.out.println(" | /|\\");
			System.out.println(" |");
		    System.out.println("_|_____");
		    
		}
		
		if(count == 5) {
			
			System.out.println(" ;--,");
			System.out.println(" |  o");
			System.out.println(" | /|\\");
			System.out.println(" | / ");
		    System.out.println("_|_____");
		    
		}

		if(count == 6) {
			
			System.out.println(" ;--,");
			System.out.println(" |  o");
			System.out.println(" | /|\\");
			System.out.println(" | / \\");
		    System.out.println("_|_____");
		    System.out.println();
		    System.out.println("GAME OVER! The word was " + wordRand);
		    
		}

		
	}
	
	public static void startHangman() {
		
			System.out.println(" ;--,");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
		    System.out.println("_|_____");
	
	}
	
}