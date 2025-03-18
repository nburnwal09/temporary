package wca;

import java.util.Scanner;

public class Main {
	  // Assisted by watsonx Code Assistant 
	  
	public static void main(String[] args) {
	    // Code for reading user input and processing it goes here
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    String name = scanner.nextLine();
	    System.out.println("Hello, " + name + "!");
	    int countVowel = countVowels(name);
	    System.out.println("count = " + countVowel);
	    scanner.close();
	}
	
//	write a method to find the number of vowels in the name
	public static int countVowels(String name) {
		int count = 0;
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
			}
		}
		return count;
	}
}
