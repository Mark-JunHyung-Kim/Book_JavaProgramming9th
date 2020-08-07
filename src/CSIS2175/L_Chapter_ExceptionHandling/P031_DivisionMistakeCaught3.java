package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P031 - DivisionMistakeCaught3

import java.util.*;
public class P031_DivisionMistakeCaught3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numerator, denominator, result;
		
		
		
		try
		{
			System.out.println("Enter numerator >>");
			numerator = input.nextInt();
			
			System.out.println("Enter denominator >>");
			denominator = input.nextInt();						// 만약 nextInt인데 여기서 String을 받아버리면, 두번째 catch블럭으로 넘어감.
			
			result = numerator / denominator;
			System.out.println(numerator + " / " + denominator + " = " + result);
		}
		catch(ArithmeticException mistake)
		{
			System.out.println(mistake.getMessage());
		}
		catch(InputMismatchException mistake)
		{
			System.out.println("Wrong data type");
		}
		
		System.out.println("End of program");

	}

}
