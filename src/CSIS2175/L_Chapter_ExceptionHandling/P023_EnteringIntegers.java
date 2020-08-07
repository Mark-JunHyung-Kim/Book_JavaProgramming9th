package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : Entering integers (Foolproof)

import java.util.*;
public class P023_EnteringIntegers 
{

	public static void main(String[] args) 
	{
		int[] numberList = {0, 0, 0, 0, 0};
		int x;
		Scanner input = new Scanner(System.in);
		
		for(x = 0; x < numberList.length; ++x)
		{
			try
			{
				System.out.println("Enter an integer >> ");
				numberList[x] = input.nextInt();
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			input.nextLine();			// ���� �̰� ���ٸ� �߰� null�� �߻��ϸ� �׳� ���α׷��� ����Ǿ����.
										// �̰� �ִٸ�, �߰��� null���� �߻��ص� flush�ؼ� �Է°� ���� �����ͺ��� �ٽ� ����.
		}
		
		System.out.print("The numbers are : " );
		for(x = 0; x < numberList.length; ++x)
			System.out.print(numberList[x] + " ");
		System.out.println();
		

	}

}
