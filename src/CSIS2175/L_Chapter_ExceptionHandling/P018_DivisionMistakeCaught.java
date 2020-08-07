package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : Division mistake caught

import java.util.Scanner;

public class P018_DivisionMistakeCaught 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numerator, denominator, result;
		
		System.out.println("Enter numerator >>");
		numerator = input.nextInt();
		
		System.out.println("Enter denominator >>");
		denominator = input.nextInt();
		
		try
		{
			result = numerator / denominator;
			System.out.println(numerator + " / " + denominator + " = " + result);
		}
		catch(ArithmeticException mistake)
		{
			System.out.println("Arithmetic exception was thrown and caught");
		}
		System.out.println("End of program");

	}

}
