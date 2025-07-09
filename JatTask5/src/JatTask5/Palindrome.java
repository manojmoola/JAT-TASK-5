package JatTask5;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string: ");
	        String original = sc.nextLine();
	        String reverse = "";
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reverse = reverse + original.charAt(i);
	        }
	        if (original.equals(reverse)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        sc.close();
	}

}
