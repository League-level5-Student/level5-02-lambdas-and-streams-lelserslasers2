package _01_Lambda_Methods;

import java.util.Arrays;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage(   (s)  ->   {
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage(   (s)  ->   {
			char[] ss = s.toCharArray();
			for(int i = s.length() - 1; i > -1; i--) {
				System.out.print(ss[i]);
			}
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		System.out.println("");
		printCustomMessage(   (s)  ->   {
			char[] ss = s.toCharArray();
			for(int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					System.out.print(ss[i]);
				}
				else {
					String sss =Character.toString(ss[i]);
					System.out.print(sss.toUpperCase());
				}
			}
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		System.out.println("");
		printCustomMessage(   (s)  ->   {
			char[] ss = s.toCharArray();
			for(int i = 0; i < s.length(); i++) {
				System.out.print(ss[i]);
				System.out.print(".");
			}
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		System.out.println("");
		String[] vov = {"a", "e", "i", "o", "u"};
		printCustomMessage(   (s)  ->   {
			char[] ss = s.toCharArray();
			for(int i = 0; i < s.length(); i++) {
				if (Arrays.asList('a','e','i', 'o', 'u').contains(ss[i]) == false) {
					System.out.print(ss[i]);
				}
			}
		}, "repeat");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
