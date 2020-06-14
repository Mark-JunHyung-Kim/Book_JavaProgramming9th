package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P351 ~ 353 - Find Price

import java.util.*;
public class P351_FindPrice 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		final int NUM_OF_ITEMS = 10;
		int[] validValues = {101, 105, 108, 109, 112, 115, 119, 120, 131, 135};
		double[] prices = {10.5, 31.9, 55.7, 17.4, 64.6, 31.9, 46.3, 35.7, 97.1, 19.4};
		
		
		int sub = 0;
		int orderedItem;
		double itemPrice = 0.0;
		boolean result = false;
		
		System.out.print("Enter a item number you want to find >> ");
		orderedItem = input.nextInt();
		
		
		for(sub = 0; sub < NUM_OF_ITEMS; ++sub)
		{
			if(orderedItem == validValues[sub])
			{
				itemPrice = prices[sub];
				result = true;
				sub = NUM_OF_ITEMS;				// 이 한줄 추가하면, 불필요한 loop를 더이상 하지않고, 값을 찾으면 반복문을 중단할수 있음.
			}									// ★만약 여기에 else - result = false;를 넣어버리면, 무조건 결과값이 false로 고정되서 찾는값이 없다고 나옴	
		}
		
		/*
		while(sub < NUM_OF_ITEMS && orderedItem != validValues[sub])		// 해보니 while은 안되더라..
			++sub;
		itemPrice = prices[sub];											//찾는값이 없으면 마지막에 sub가 9를 넘어 10이 되는데,
																			// 이러면 해당 배열에 11번째 값이 없어서 오류가 남.
		
		*/
		
		
		if(result)
			System.out.println("The price of your item " + orderedItem + " is : $" + itemPrice);
		else
			System.out.println("There is no item you want to find..");
	}

}
