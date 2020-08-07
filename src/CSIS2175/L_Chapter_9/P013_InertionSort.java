package CSIS2175.L_Chapter_9;
//Date : 2020.06.21
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P013 - The Insertion sort

public class P013_InertionSort 							// BubbleSort�� ��������? ���� �߿�. �����.  
{
	public static void main(String[] args)
	{
		int[] someNums = {90, 85, 65, 95, 75};
		
		int a = 1;			 
		
		while (a < someNums.length)
		{
			int temp = someNums[a];		// temp = 85
			int b = a - 1;				// b = 0
			
			while (b >= 0 && someNums[b] > temp)		// 90�� 85���� Ŭ ���,(��)
			{
				someNums[b + 1] = someNums[b];			// 85�� 90�� ����
				--b;									// b�� -1�� ��
			}
			someNums[b + 1] = temp;						// b�� 0, 0��° �ڸ��� temp 85�� ����. 
			++a;										// ���� ����° ���ڶ� �ι�° ���ڶ� �� (�ݺ�)			
		}
		
		int x = 0;
		while(x < someNums.length)
		{
			System.out.println(someNums[x]);
			++x;
		}
		
	}
	
	/*
	public static void main(String[] args)				// �˰��� ǥ�� ����. 
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
	}*/
	

}
