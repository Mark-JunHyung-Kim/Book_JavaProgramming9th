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
		int x;											// ���� int x; �θ� ���ǰ� �Ǿ�������, ������ ����ٿ��� ������
		// int x = 0;									// 1) try��� �����ϱ� ���� �̸� ���Ǹ� ���ִ���, 
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter an integer >> ");
			x = input.nextInt();						// try��� ���� ������ local������, �ܺο��� ����� �Ұ�����.
			// System.out.println("x is " + x);			// 3) ������� try��� ���� �־���� ������ �ȳ�.
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred");
			// x = 10;									// 2) catch��� ���� ���� �������ִ���.
		}

		// System.out.println("x is " + x);		=> ������!!

	}

}
