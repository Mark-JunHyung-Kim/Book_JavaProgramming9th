package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P95 - Exercise (Grater of Two numbers)

import java.util.*;
public class P095_Exercise_GraterOfTwoNumbers {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int firstNum, secondNum;
		
		System.out.print("Please enter the First Number >>");
		firstNum = input.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter the Second Number >>");
		secondNum = input.nextInt();
		
		if(greaterNum(firstNum, secondNum) == 1)
			System.out.println("The greater Number is the first Number " + firstNum);
		else if (greaterNum(firstNum, secondNum) == 2)
			System.out.println("The first Number " + firstNum + " and second Number " + secondNum + " are same.");
		else
			System.out.println("The greater Number is the second Number " + secondNum);
	}
	
	public static int greaterNum(int firstNum, int secondNum)
	{
		int result;
		if(firstNum > secondNum)
			result = 1;
		else if (firstNum == secondNum)			// == 두개 잊지말것. 첫번째 조건은 > 두번째 조건을 < 마지막 else랑 순서 바꾸는것도 뭐.. 
			result = 2;
		else
			result = 3;
		return result;
	}

}
