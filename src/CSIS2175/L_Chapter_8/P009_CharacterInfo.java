package CSIS2175.L_Chapter_8;
//Date : 2020.06.26
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P005 - TryToCompareStrings

public class P009_CharacterInfo 
{

	public static void main(String[] args) 
	{
		char aChar = 'A';
		System.out.println("The character is " + aChar);		// is면 검사, to면 변환
		
		if(Character.isUpperCase(aChar))						// isUpperCase() = arg가 대문자면 true, 아니면 false
			System.out.println(aChar + " is uppercase");
		else
			System.out.println(aChar + " is not uppercase");	 
		
		if(Character.isLowerCase(aChar))						// isLowerCase() = arg가 소문자면 true, 아니면 false
			System.out.println(aChar + " is lowercase");
		else
			System.out.println(aChar + " is not lowercase");
		
		aChar = Character.toLowerCase(aChar);					// toLowerCase() = arg의 char를 소문자로 변환
		System.out.println("After toLowerCase(), aChar is " + aChar);
		
		aChar = Character.toUpperCase(aChar);					// toCase() = arg의 char를 대문자로 변환
		System.out.println("After toUpperCase(), aChar is " + aChar);
		
		if(Character.isDigit(aChar))							// isDigit() = arg가 숫자면 true, 아니면 false
			System.out.println(aChar + " is a digit");
		else
			System.out.println(aChar + " is not a digit");		
		
		if(Character.isLetter(aChar))							// isLetter() = arg가 문자면 true, 아니면 false
			System.out.println(aChar + " is a digit");			// isChar 아님!!!
		else
			System.out.println(aChar + " is not a digit");
		
		
		if(Character.isLetterOrDigit(aChar))					// isLetterOrDigit() = arg가 문자나 숫자면 true, 아니면 false
			System.out.println(aChar + " is a letter or digit");
		else
			System.out.println(aChar + " is neither a letter nor a digit");
		
		if(Character.isWhitespace(aChar))						// isWhitespace() = arg가 공백이면 true, 아니면 false
			System.out.println(aChar + " is whitespace");		// 				★공백에는 [space, tap, newline, return, form feed] 등이 포함됨.
		else
			System.out.println(aChar + " is not whitespace");

	}

}
