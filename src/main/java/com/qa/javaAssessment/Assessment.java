package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		
		
		String word=" ", alpha;
		String msg = null;
		int i=msg.length()-1;
		
		for(;i>=0;i--) {
			alpha=msg.substring(i,i+1);
			if(alpha.equals(" ")){
				System.out.println(word);
				word=" ";
			}
			else {
				word=alpha+word;
			}
		
		return msg;
	}
	}
	
	


	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		
		String mid1, mid2;
		String result;
		
		mid1= input.substring(0,input.length()/2-a/2);
		mid2= input.substring(input.length()/2+a/2+2, input.length());
		result = mid1+mid2;
		
		return result;
	}


	class FBA {
		public String fizzBuzzTest(int XYZ) {
			if(XYZ % 15 == 0) {
				return "FizzBuzz";};
			if(XYZ % 3 == 0) {
				return "Fizz";}
			if(XYZ % 5 == 0) {
			return "Buzz";}

			return " ";
		}
	}
	
	
	public class EvenA {
		public boolean evenlySpaced(int a, int b, int c) {
			if(a>b && a>c) {
				if(b>c) {
					if(a-c==b-c)
						return true;
					else return false;
				}
				if(c>b ) {
					if(a-c==c-b)
						return true;
					else return false;
				}
			}
				
				
				if(b>a && b>c) {
					if(a>c) {
						if(b-a==a-c)
							return true;
						else return false;
					}
					if(c>a ) {
						if(b-c==c-a)
							return true;
						else return false;
					}
				}
					
					
					if(c>a && c>b) {
						if(a>b) {
							if(c-a==a-b)
								return true;
							else return false;
						}
						if(b>a ) {
							if(c-b==b-a)
								return true;
							else return false;
						}
					}
						
			return false;
		}

	}
	
	
	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {

		int cstreak = 1, hstreak = 0;
		for (int i = 0; i < input.length()-1; i++) {

			if (input.substring(i, i + 1).equals(input.substring(i + 1, i + 2))) {

				cstreak = (cstreak + 1);
				if (cstreak > hstreak) {
					hstreak = cstreak;
				}

			} else {
				cstreak= 1;
			}
		}

		return hstreak;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		return -1;
		
	}
		
	
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		return -1;
	}
}
