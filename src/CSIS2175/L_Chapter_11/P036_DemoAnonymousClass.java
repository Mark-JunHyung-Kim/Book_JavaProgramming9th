package CSIS2175.L_Chapter_11;
//Date : 2020.07.19
//Name : Mark JunHyung Kim
//Chapter : Lecture#10 = Chapter#11
//Subject : Demo Anonymous Class

import java.util.*;
public class P036_DemoAnonymousClass 
{

	public static void main(String[] args) 
	{
		/*
		P029_Worker dryMachine = new P029_Worker()			// �� ���ٷδ� ��ü ������ �Ұ���. (����Ʈ ����Ʈ���ͷε� �Ұ�)
				{
			public void work()								// �ݵ�� abstract �޼����� work�� ������ �Ǿ�߸� ��.
			{
											// �̷��� �غ��� �ƹ��͵� �ȳ���.
			}
				};
		dryMachine.work();
		*/
		
		int pounds;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter capacity for washing machine" + " in pounds of laundry >>");
		pounds = input.nextInt();
		P029_Worker washingMachine = new P029_Worker()
				{
			public void work()									// ��ȸ�� �޼����� �����ؾ��ҵ�.
			{
				System.out.println("I get clothes clean");
				System.out.println(" and can handle " + pounds + " pounds of laundry at a time");
			}
				};												// �ڡ� �߿�! ; �����ݷ��� ����!!
		washingMachine.work();

	}

}
