package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P93 - If Else

import java.util.*;
public class P093_If_Else
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter a number >> ");
		number = input.nextInt();
		
		if(isEven(number))
			System.out.println("The number " + number + " is even");
		else
			System.out.println("The number " + number + " is odd");
	}
	
	public static boolean isEven(int number)
	{
		boolean result;
		
		if(number%2 == 1)
			result = false;
		else
			result = true;
		return result;		
	}

}
