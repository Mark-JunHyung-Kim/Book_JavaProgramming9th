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
				sub = NUM_OF_ITEMS;				// �� ���� �߰��ϸ�, ���ʿ��� loop�� ���̻� �����ʰ�, ���� ã���� �ݺ����� �ߴ��Ҽ� ����.
			}									// �ڸ��� ���⿡ else - result = false;�� �־������, ������ ������� false�� �����Ǽ� ã�°��� ���ٰ� ����	
		}
		
		/*
		while(sub < NUM_OF_ITEMS && orderedItem != validValues[sub])		// �غ��� while�� �ȵǴ���..
			++sub;
		itemPrice = prices[sub];											//ã�°��� ������ �������� sub�� 9�� �Ѿ� 10�� �Ǵµ�,
																			// �̷��� �ش� �迭�� 11��° ���� ��� ������ ��.
		
		*/
		
		
		if(result)
			System.out.println("The price of your item " + orderedItem + " is : $" + itemPrice);
		else
			System.out.println("There is no item you want to find..");
	}

}
