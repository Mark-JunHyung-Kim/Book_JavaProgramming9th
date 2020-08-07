package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P034 - DivisionMistakeCaught4

import java.util.*;
public class P034_DivisionMistakeCaught4 
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

		/*												�̷��� ���ϰ� �׳� �ѹ��� �� ��� catch-all����� ����
		catch(ArithmeticException mistake)
		{
			System.out.println(mistake.getMessage());
		}
		catch(InputMismatchException mistake)
		{
			System.out.println("Wrong data type");
		}
		*/
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of program");

	}

}
