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
		P029_Worker dryMachine = new P029_Worker()			// 이 한줄로는 객체 생성도 불가능. (디폴트 컨스트럭터로도 불가)
				{
			public void work()								// 반드시 abstract 메서드인 work가 재정의 되어야만 함.
			{
											// 이렇게 해봐야 아무것도 안나옴.
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
			public void work()									// 일회성 메서드라고 생각해야할듯.
			{
				System.out.println("I get clothes clean");
				System.out.println(" and can handle " + pounds + " pounds of laundry at a time");
			}
				};												// ★★ 중요! ; 세미콜론이 있음!!
		washingMachine.work();

	}

}
