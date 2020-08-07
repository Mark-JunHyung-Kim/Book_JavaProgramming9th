package CSIS2175.L_Chapter_11;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#10 = Chapter#11
//Subject : Demo Lambda Expressions

import java.util.Scanner;

public class P038_LambdaExpressions {

	public static void main(String[] args) 
	{
		int pounds;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter capacity for washing machine" + " in pounds of laundry >>");
		pounds = input.nextInt();

		P029_Worker washingMachine = () ->
				{			
			{
				System.out.println("I get clothes clean");
				System.out.println(" and can handle " + pounds + " pounds of laundry at a time");
			}
				};												// ★★ 중요! ; 세미콜론이 있음!!
		washingMachine.work();	

	}

}
