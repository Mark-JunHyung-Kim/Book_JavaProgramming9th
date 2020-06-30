package CSIS2175.L_Chapter_8;
//Date : 2020.06.29
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P020 ~ P022 - Variety of String Methods

public class P020_VarietyOfStringMethods 
{

	public static void main(String[] args) 
	{
		String myName = "Mark Gray Kim";
		
		System.out.println(myName.toUpperCase());		// toUpperCase() = convert any string to its uppercase equivalent
		
		System.out.println(myName.toLowerCase());		// toLowerCase() = convert any string to its lowercase equivalent
		
		
		System.out.println("The length of String myName is : " + myName.length());
														// length() = returns the length of a String
		
		char x = 'G';
		System.out.println("The order of character " + x + " is : " + myName.indexOf(x));		
														// indexOf('character') method = determines whether a specific character occurs within a String
														// Returns the position of the character
														// ¡Ú The first position of a String is ZERO
														// if return value is '-1', it does not exist in the String.
		
		int orderNum = 5;
		System.out.println("The character of orderNumber " + orderNum + " is : " + myName.charAt(orderNum));
														// charAt('int') method = indicates the position of the character that the method returns
		
		
		String testStr = "Mark";
		System.out.println("myName string starts with " + testStr + " is : " + myName.startsWith(testStr));
														// startsWith('string' method = return true or false if a String object does or does not end or start with the specified argument.
		
		System.out.println("myName string ends with " + testStr + " is : " + myName.endsWith(testStr));
														// startsWith('string' method = return true or false if a String object does or does not end or start with the specified argument.
		
		System.out.println("Changing all 'a' characters to 'e' : " + myName.replace('a', 'e'));
														// replace('old char', 'new char') method = Replaces all occurrences of some character within a String.
		
		int someInt = 4;		
		System.out.println("Changing integer valuable to String valueable : " + Integer.toString(someInt));
														// Not part of the String class
														// Converts any object to a String
														// Converts primitive data types to Strings
		
		
	}

}
