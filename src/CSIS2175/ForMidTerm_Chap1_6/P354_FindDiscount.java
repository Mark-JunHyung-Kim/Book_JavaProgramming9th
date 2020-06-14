package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P354 ~ 355 - Find Discount Rate

import java.util.*;
public class P354_FindDiscount 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		final int NUM_RANGE = 5;
		final int QUIT = 999;
		int[] discountRangeLimits = {	1, 	 13,   50,   100,   200};
		double[] discountRates    = {0.00, 0.35, 3.21, 5.12,  8.25};
		
		int orderedItems;
		double discount = 0;
		int sub = NUM_RANGE - 1;
		 
		
		System.out.print("How many items you ordered? >> ");
		orderedItems = input.nextInt();
		
																// 이건 내가 짠것
		while(sub >= 0 && sub != QUIT)		// 4부터 시작 -> 감소. 
		{
			if(orderedItems >= discountRangeLimits[sub])
			{
				discount = discountRates[sub];
				sub = QUIT;
			}
			else
				--sub;
		}
		
		/*													// 이건 렉쳐에 있던것.
		while(sub >=0 && orderedItems < discountRangeLimits[sub])
			--sub;
		discount = discountRates[sub];		
		*/
		
		System.out.println("Your ordered item number is : " + orderedItems + " and discount rate is : " +  discount);
			

	}

}
