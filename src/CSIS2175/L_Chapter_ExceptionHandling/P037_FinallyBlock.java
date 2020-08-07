package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P037 - Finally Block

import java.util.*;
public class P037_FinallyBlock 
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
			denominator = input.nextInt();					
			
			result = numerator / denominator;
			System.out.println(numerator + " / " + denominator + " = " + result);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("End of program");
			System.out.println("This line is always excuted within the finally block.");
		}
	}

}
