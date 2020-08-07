package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P026 - Exercise

import java.util.*;
public class P026_Exercise 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String userInput;
		double doubleInput;
		
		System.out.println("Please enter the double type number >> ");
		userInput = input.nextLine();
		
		try
		{
			doubleInput = Double.parseDouble(userInput);
			System.out.println(doubleInput);
		}
		catch(NumberFormatException formatError)
		{
			doubleInput = 0;
			System.out.println("Input = " + doubleInput + " and " + formatError.getMessage());
		}

	}

}
