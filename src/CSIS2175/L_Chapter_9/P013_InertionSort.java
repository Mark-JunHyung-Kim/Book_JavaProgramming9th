package CSIS2175.L_Chapter_9;
//Date : 2020.06.21
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P013 - The Insertion sort

public class P013_InertionSort 
{

	public static void main(String[] args) 
	{
		int[] someNums = {90, 85, 65, 95, 75};
		int a = 1;		// 첫번째로 비교할 대상
		while(a < someNums.length)
		{
			int temp = someNums[a];					
			int b = a - 1;			// 첫번째로 비교당할 대상
					
			while(b >= 0 && someNums[b] > temp) 		// && 원본값 > 비교대상값이면, (ex. 90 > 85)
			{				
				someNums[b + 1] = someNums[b];			// 비교대상위치에 원본값을 넣음	(ex. 85, 90) 한자리씩 밀림.			
				--b;						
			}
			someNums[b + 1] = temp;						// 그리고 원본값 위치에 비교대상값을 넣음 (위치바뀜)
			++a;					
		}
		int x = 0;
		while(x < someNums.length)
		{
			System.out.println(someNums[x]);
			++x;
		}
	}
	/*
	public static void main(String[] args)				// 알고리즘 표현 버전. 
	{
		int[] someNums = {90, 85, 65, 95, 75};
		int a = 1;
		while(a < someNums.length)						// a(1) :: a(1 ~ 4)
		{
			int temp = someNums[a];						// temp = 85 (someNums[1]
			System.out.println("(1) int temp = someNums[a] ==>> temp = " + someNums[a]);
			int b = a - 1;								// b = a - 1 (0)
			System.out.println("(2) int b = a - 1 ==>> " + b + " = " + a + " - 1");
			while(b >= 0 && someNums[b] > temp)			// b(0) >= 0 && someNums[0](90) > temp(85)  :: TRUE 
			{				
				someNums[b + 1] = someNums[b];			// someNums[0 + 1](1) = someNums[0] :: someNums[1] = 90;
				System.out.println("(3) someNums[b + 1] = someNums[b] ==>> someNums[" + (b + 1) + "]" + " = " + someNums[b]);
				--b;									// --b (-1)
				System.out.println("(4) --b ==>> " + b);
			}
			someNums[b + 1] = temp;						// someNums[-1 + 1](0) = temp; :: someNums[0] = 85;
			System.out.println("(5) someNums[b + 1] = temp ==>> someNums[" + (b + 1) + "]" + " = " + temp);
			++a;										// ++a (2)
			System.out.println("(6) ++a ==>> " + a);
		}
		int x = 0;
		while(x < someNums.length)
		{
			System.out.println(someNums[x]);
			++x;
		}
	}
	*/

}
