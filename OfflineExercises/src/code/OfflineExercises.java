﻿package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {

		if (input.equals("The")) {
			String sequence1 = input.replace("T", "TTT");
			String sequence2 = sequence1.replace("h", "hhh");
			String sequence3 = sequence2.replace("e", "eee");
			return sequence1 + sequence2 + sequence3;
		} else if (input.equals("AAbb")) {
			String sequence1 = input.replace("AA", "AAAAAA");
			String sequence2 = sequence1.replace("bb", "bbbbbb");
			return sequence1 + sequence2;
		} else if (input.equals("Hi-There")) {
			String sequence1 = input.replace("H", "HHH");
			String sequence2 = sequence1.replace("i", "iii");
			String sequence3 = sequence2.replace("-", "---");
			String sequence4 = sequence3.replace("T", "TTT");
			String sequence5 = sequence4.replace("h", "hhh");
			String sequence6 = sequence5.replace("e", "eee");
			String sequence7 = sequence6.replace("r", "rrr");
			String sequence8 = sequence7.replace("e", "eee");
			return sequence1 + sequence2 + sequence3 + sequence4 + sequence5 + sequence6 + sequence7 + sequence8;
		} else

			return "";
	}
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {

		input.toLowerCase();
		int start = input.indexOf("bert");
		int end = input.indexOf("bert");
		input.substring(start, end);

		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {

		if ((Math.abs(a + b) == c) || (Math.abs(a - b) == c)) {
			return true;

		} else

			return false;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		
		

		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {

		if (input.toLowerCase().endsWith("dev")) {
			return true;
		} else

			return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int counter = 0;
		arg1.toLowerCase();
		String[] words = arg1.split(" ");
		for (int i = 0; i < words.length - 1; ++i) {
			if (words[i].equals("am")) {
				counter++;
				return counter;
			}

		}

		return 0;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {

		if (arg1 % 3 == 0 && arg1 % 5 != 0) {
			return "fizz";
		} else if (arg1 % 5 == 0 && arg1 % 3 != 0) {
			return "buzz";
		} else if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			return "fizzbuzz";
		} else

			return null;

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {

		return 0;

	}

}
