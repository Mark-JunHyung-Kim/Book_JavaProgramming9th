package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P025 - Exercise


import java.util.*;
public class P025_Exercise 
{

	public static void main(String[] args) 
	{
		int[] studentIDs = {5143, 2104, 7795, 1356, 7391, 1476, 9763, 4613};
		
		int stdNum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the std Number you want to find (0 ~ 7) >>");
		stdNum = input.nextInt();
		
		try
		{
			System.out.println("The std ID you want to find is : " + studentIDs[stdNum]);	// 받은 입력값이 범위를 넘어가는지 안넘어가는지
		}
		catch(ArrayIndexOutOfBoundsException arrayError)
		{
			System.out.println(arrayError.getMessage());
		}		

	}

}
