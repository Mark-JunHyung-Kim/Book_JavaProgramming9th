package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P028 - UninitializedVariableTest

import java.util.*;
public class P028_UninitializedVariableTest 
{

	public static void main(String[] args) 
	{
		int x;											// 만약 int x; 로만 정의가 되어있으면, 마지막 출력줄에서 에러남
		// int x = 0;									// 1) try블록 시작하기 전에 미리 정의를 해주던가, 
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter an integer >> ");
			x = input.nextInt();						// try블록 내에 변수는 local변수라서, 외부에서 사용이 불가능함.
			// System.out.println("x is " + x);			// 3) 출력행을 try블록 내에 넣어줘야 오류가 안남.
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred");
			// x = 10;									// 2) catch블록 내에 값을 정의해주던가.
		}

		// System.out.println("x is " + x);		=> 오류남!!

	}

}
