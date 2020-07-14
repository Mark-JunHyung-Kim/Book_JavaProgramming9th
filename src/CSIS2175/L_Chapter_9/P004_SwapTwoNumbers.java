package CSIS2175.L_Chapter_9;
//Date : 2020.06.17
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P004 - Swap two numbers

public class P004_SwapTwoNumbers {

	public static void main(String[] args) 
	{
		
		int temp, valA, valB;
		
		valA = 2;
		valB = 16;
		/*
		System.out.println("valA is : " + valA + " and valB is : " + valB);
		
		temp = valA;
		valA = valB;
		valB = temp;
		
		System.out.println("valA is : " + valA + " and valB is : " + valB);
		
		// 나머지는 내일부터 이어서
		*/
		if (valA > valB)
		{
			temp = valA;
			valA = valB;
			valB = temp;
			System.out.println (valA + " " + valB);
		}
		else
			System.out.println(valA + " " + valB);
			
		

	}
	

}
