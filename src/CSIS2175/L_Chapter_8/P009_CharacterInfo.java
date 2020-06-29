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
		System.out.println("The character is " + aChar);		// is�� �˻�, to�� ��ȯ
		
		if(Character.isUpperCase(aChar))						// isUpperCase() = arg�� �빮�ڸ� true, �ƴϸ� false
			System.out.println(aChar + " is uppercase");
		else
			System.out.println(aChar + " is not uppercase");	 
		
		if(Character.isLowerCase(aChar))						// isLowerCase() = arg�� �ҹ��ڸ� true, �ƴϸ� false
			System.out.println(aChar + " is lowercase");
		else
			System.out.println(aChar + " is not lowercase");
		
		aChar = Character.toLowerCase(aChar);					// toLowerCase() = arg�� char�� �ҹ��ڷ� ��ȯ
		System.out.println("After toLowerCase(), aChar is " + aChar);
		
		aChar = Character.toUpperCase(aChar);					// toCase() = arg�� char�� �빮�ڷ� ��ȯ
		System.out.println("After toUpperCase(), aChar is " + aChar);
		
		if(Character.isDigit(aChar))							// isDigit() = arg�� ���ڸ� true, �ƴϸ� false
			System.out.println(aChar + " is a digit");
		else
			System.out.println(aChar + " is not a digit");		
		
		if(Character.isLetter(aChar))							// isLetter() = arg�� ���ڸ� true, �ƴϸ� false
			System.out.println(aChar + " is a digit");			// isChar �ƴ�!!!
		else
			System.out.println(aChar + " is not a digit");
		
		
		if(Character.isLetterOrDigit(aChar))					// isLetterOrDigit() = arg�� ���ڳ� ���ڸ� true, �ƴϸ� false
			System.out.println(aChar + " is a letter or digit");
		else
			System.out.println(aChar + " is neither a letter nor a digit");
		
		if(Character.isWhitespace(aChar))						// isWhitespace() = arg�� �����̸� true, �ƴϸ� false
			System.out.println(aChar + " is whitespace");		// 				�ڰ��鿡�� [space, tap, newline, return, form feed] ���� ���Ե�.
		else
			System.out.println(aChar + " is not whitespace");

	}

}
