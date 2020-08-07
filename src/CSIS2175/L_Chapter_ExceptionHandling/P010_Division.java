package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : Division

import java.util.*;
public class P010_Division 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int numerator, denominator, result;
		
		System.out.println("Enter numerator >>");
		numerator = input.nextInt();
		
		System.out.println("Enter denominator >>");
		denominator = input.nextInt();
		
		
		// 만약 exception handling 없이 수정하면,
		if (denominator != 0)
		{
			result = numerator / denominator;			
			System.out.println(numerator + " / " + denominator + " = " + result);
		}
		else
			System.out.println("The denominator shouldn't be a 0");
		

	}

}
