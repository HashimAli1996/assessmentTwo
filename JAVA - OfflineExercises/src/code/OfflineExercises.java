package code;

import java.util.ArrayList;


public class OfflineExercises {
	
	public static void main(String[] args) {
		//System.out.println(getSandwich("hashim"));
		
		//System.out.println(evenlySpaced(2,1,3));
		
		
		
		System.out.println(endsly("y"));
	}
	
	//where does the error come from?
	
	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"
	public String doubleChar(String input) {
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			 output += input.charAt(i);
			 output += input.charAt(i);
		}
		return output;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public static String getSandwich(String input) {
	
		String[] split = input.split("bread");
		
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("jam")) {
				return split[i];
			}
		}
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		ArrayList<Integer> sort = new ArrayList<Integer>();
		
		sort.add(a);
		sort.add(b);
		sort.add(c);
		
		sort.sort(null);
		
		int space = sort.get(2) - sort.get(1);
		
		if((sort.get(0) + space == sort.get(1)) && (sort.get(1) + space == sort.get(2))){
			return true;
		}
		return false;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String output = "";
		for(int i = 0; i < a; i++) {
			output += input.charAt(i);
		}
		
		for(int j = input.length() - a; j < input.length(); j++) {
			output += input.charAt(j);
		}
		return output;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public static boolean endsly(String input) {
		String output = "";
		
		for(int i = input.length() - 2; i < input.length(); i++) {
			output += input.charAt(i);
		}
		
		if(output.equals("ly")) {
			return true;
		}
		return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		String output = "";
		
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(i) != output.charAt(j)) {
					output += input.charAt(i);
				}
			}
		}
		return output;
		/*
		 * couldnt get this to print anything because it wouldn never execute the second for loop
		 * i think this is because output.length = 0 ? im not sure
		 */
	}
	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public static int fibonacci(int input) {
		int output = 0;
		int counter = input;
		
		while(counter != 0){
			output = input + (input-1);
			counter--;
			if(counter == 0) {
				fibonacci(output);
				break;
			}
			
		}

		return output;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		return -1;
	}

}
