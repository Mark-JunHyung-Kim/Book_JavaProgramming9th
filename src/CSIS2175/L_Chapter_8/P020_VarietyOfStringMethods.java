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
														// ★ The first position of a String is ZERO
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
		
		int someInt = 6;		
		System.out.println("Changing integer valuable to String valueable : " + Integer.toString(someInt));
														// Not part of the String class
														// Converts any object to a String
														// Converts primitive data types to Strings
		
		System.out.println("The character of position " + someInt + " is : " + myName.charAt(someInt));
														// Requires an integer argument
														// Indicates the position of the character that the method returns
		
		int startInt = 3, endInt = 6;
		System.out.println("The substring from " + startInt + " to " + endInt + " is : " + myName.substring(startInt, endInt));
														// Extracts part of a String
														// Takes two integer arguments (Start - End position)
														// The length of the extracted substring is the difference between the second integer and the first integer.
		
		
		String firstString = "abcde";
		String secondString = "xxbcdef";
		
		System.out.println(firstString.regionMatches(1, secondString, 2, 4));
														// regionMatches(첫번째 Str 시작지점, 비교할 String, 비교할 String 시작지점, ★비교할 SubString 크기!)
														// fStr의 bcde(4개) 와 sStr의 bcde(4개)를 비교함.
		
		System.out.println(firstString.regionMatches(0, secondString, 3, 2));
														// fStr의 ab와 sStr의 cd를 비교하므로 False.		
		
		
		String thirdString = "123 Maple Drive";
		String fourthString = "a maple tree";
		System.out.println(thirdString.regionMatches(true, 4, fourthString, 2, 5));
														// 처음 값이 ★true면, case 크기를 무시하고 비교함.
		
		
		
		
	}

}
