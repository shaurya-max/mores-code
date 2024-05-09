package questions;

import java.util.Scanner;

public class mores_code {

	public static void main(String[] args) {
		char [] english = {
				'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r', 's', 't', 'u', 'v', 'w', 'x' ,'y', 'z' ,'1','2','3' 
				,'4' ,'5' ,'6', '7' ,'8', '9', '0'		
		};
		   String[] morse = {
	                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
	                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---",
	                "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"
	        };
		   Scanner sc = new Scanner(System.in);
		   System.out.println("enter what you like to trancelate into mores code");
		   
		   String input = sc.nextLine().toLowerCase();

	        StringBuilder morseCode = new StringBuilder();

	        for (char c : input.toCharArray()) {
	            if (c == ' ') {
	                // Add space between words
	                morseCode.append(" ");
	            } else {
	                // Find the index of the character in the English array
	                int index = -1;
	                for (int i = 0; i < english.length; i++) {
	                    if (english[i] == c) {
	                        index = i;
	                        break;
	                    }
	                }

	                // Append the Morse code representation to the StringBuilder
	                if (index != -1) {
	                    morseCode.append(morse[index]).append(" ");
	                }
	            }
	        }

	        System.out.println("Morse code:");
	        System.out.println(morseCode.toString());
	}   

}

	