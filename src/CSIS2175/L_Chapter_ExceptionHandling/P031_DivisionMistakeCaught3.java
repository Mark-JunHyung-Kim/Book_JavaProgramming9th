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
			denominator = input.nextInt();						// ���� nextInt�ε� ���⼭ String�� �޾ƹ�����, �ι�° catch������ �Ѿ.
			
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
