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
		
		for(a = 0; a < someNums.length -1 ; ++a)				// �� ���ڸ��� �ѹ��� �ݺ��ؾ߸� ����� ���ĵ�.
			for(b = 0; b < someNums.length - 1 ; ++b)			// �� ���� 
				if(someNums[b] > someNums[b+1])
				{
					temp = someNums[b];							// ����� �������� (Ascending), ������������ �Ҷ��� �ٸ���
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
			--comparisonsToMake;							// ���� ū ���� �迭�� ���� �������ڸ��� ���Ƿ�, 
															// ������ �ڸ����� ���� �ʿ䰡 ��� �ݺ��� ���̸� 1 ����.
															// ���������� �� �� �ΰ��� ���ϰԵǴ°ų� ��������.
		}
		
	
		*/
		
	}

}
