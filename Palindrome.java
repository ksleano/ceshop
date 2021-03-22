package ceshop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("--- Palindrome Checker --- ");
		System.out.print("Enter string: ");
		
		String input = s.nextLine();
		System.out.printf("%s : %s", input, Palindrome.isPalindrome(input));
		
		s.close();
	}
	
	/**
	 * Check if the string is a palindrome
	 * @param s
	 * @return boolean value if a string is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		
		// check for special case
		if(s.length() == 1)
			return true;
		
		// compare char from the  beginning of string to the end of string
		for(int i= 0; i < s.length()/2; i++) {
			if(!(s.charAt(i) == s.charAt(s.length() - i - 1))) {
				return false;
			}		
		}
		return true;
	}

}
