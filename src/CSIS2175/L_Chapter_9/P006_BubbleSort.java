package CSIS2175.L_Chapter_9;
//Date : 2020.07.13
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P006 - Using the Bubble Sort Algorithm.

public class P006_BubbleSort 
{

	public static void main(String[] args) 
	{
		
		int a, b = 0;
		int temp;
		
		int[] someNums = {1, 9, 3, 6, 8, 2, 4};
		
		/*
		for(a = 0; a < someNums.length - 1; ++a)
			for(b = 0; b < someNums.length - 1; ++b)
				if(someNums[b] > someNums[b + 1])
				{
					temp = someNums[b];
					someNums[b] = someNums[b + 1];
					someNums[b + 1] = temp;
				}
		*/
		
		int comparisonsToMake = someNums.length -1;
		for(a = 0; a < someNums.length - 1; ++a)
		{
			for (b = 0; b < comparisonsToMake; ++ b)
			{
				if(someNums[b] > someNums[b + 1])
				{
					temp = someNums[b];
					someNums[b] = someNums[b + 1];
					someNums[b + 1] = temp;
				}
			}
			--comparisonsToMake;
		}
		
		
		for(a=0; a < someNums.length; ++a)
			System.out.print(someNums[a] + " ");
			
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		for(a = 0; a < someNums.length -1 ; ++a)				// 한 숫자마다 한번씩 반복해야만 제대로 정렬됨.
			for(b = 0; b < someNums.length - 1 ; ++b)			// 이 식을 
				if(someNums[b] > someNums[b+1])
				{
					temp = someNums[b];							// 현재는 오름차순 (Ascending), 내림차순으로 할때는 다르게
					someNums[b] = someNums[b+1];
					someNums[b+1] = temp;
				}
				
		
		
		
		int comparisonsToMake = someNums.length - 1;
		for(a = 0; a < someNums.length - 1; ++a)
		{
			for(b = 0; b < comparisonsToMake; ++b)
			{
				if(someNums[b] > someNums[b + 1])
				{
					temp = someNums[b];
					someNums[b] = someNums[b + 1];
					someNums[b + 1] = temp;
				}
			}
			--comparisonsToMake;							// 가장 큰 수가 배열의 가장 마지막자리로 가므로, 
															// 마지막 자리랑은 비교할 필요가 없어서 반복문 길이를 1 줄임.
															// 마지막에는 맨 앞 두개만 비교하게되는거나 마찬가지.
		}
		
	
		*/
		
	}

}
