package CSIS2175.L_Chapter_8;
//Date : 2020.06.26
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P005 - TryToCompareStrings

import java.util.*;
public class P005_TryToCompareStrings 
{

	public static void main(String[] args) 
	{
		String aName = "Carmen";
		String anotherName;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name >>  ");
		anotherName = input.nextLine();
		
		if(aName == anotherName)											// Don't do it!! string¿¡¼­´Â == ¾È¸ÔÈû.
			System.out.println(aName + " equals " + anotherName);
		else
			System.out.println(aName + " does not equal " + anotherName);
	}

}
