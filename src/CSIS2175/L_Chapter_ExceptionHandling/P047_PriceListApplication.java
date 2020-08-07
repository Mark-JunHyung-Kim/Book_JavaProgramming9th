package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P047 - Specifying the exceptions that a method can throw

import java.util.*;
public class P047_PriceListApplication 
{

	public static void main(String[] args) 
	{
		double[] price = {15.99, 27.88, 34.56, 45.89};
		int item;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter item number >> ");
		item = input.nextInt();
		
		try 
		{
			displayPrice(price, item);			
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Price is $0");
		}
	}
	public static void displayPrice(double[] price, int item) throws IndexOutOfBoundsException
	{
		System.out.println("The Price is $" + price[item]);
	}

}
