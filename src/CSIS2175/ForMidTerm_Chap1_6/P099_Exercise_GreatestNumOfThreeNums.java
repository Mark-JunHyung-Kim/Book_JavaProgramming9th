package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P95 - Exercise (find the greatest of three numbers)

import java.util.*;
public class P099_Exercise_GreatestNumOfThreeNums 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int firstNum, secondNum, thirdNum;
		
		System.out.print("Please enter the first number");
		firstNum = input.nextInt();
		
		System.out.print("Please enter the second number");
		secondNum = input.nextInt();

		System.out.print("Please enter the third number");
		thirdNum = input.nextInt();
		
		
		// use nested if
		if(firstNum > secondNum)
		{
			if(firstNum > thirdNum)
				System.out.println("The greatest number is the first Number " + firstNum);
			else if (firstNum < thirdNum)
				System.out.println("The greatest number is the third Number " + thirdNum);
			else
				System.out.println("The greatest number are the first & third Number " + firstNum + " & " + thirdNum);
		}
		else if(firstNum < secondNum)
		{
			if(secondNum > thirdNum)
				System.out.println("The greatest number is the second Number " + secondNum);
			else if (secondNum < thirdNum)
				System.out.println("The greatest number is the third Number " + thirdNum);
			else
				System.out.println("The greatest number are the second & third Number " + secondNum + " & " + thirdNum);
		}
		else
		{
			if(firstNum > thirdNum)
				System.out.println("The greatest number are the first & second Number " + firstNum + " & " +secondNum);
			else if (firstNum < thirdNum)
				System.out.println("The greatest number is the third Number " + thirdNum);
			else
				System.out.println("The first, second, and third numbers are same : " + firstNum + " & " + secondNum + " & " + thirdNum);
		}
		
		// use if else	이경우는 같은수가 입력됐을때를 추가하지 않음. 같은수가 입력됐을때까지 하려면 else if에 == && 를 더 넣어서 조건을 더 만들어야함 
		if(firstNum > secondNum && firstNum > thirdNum)
			System.out.println("The greatest number is the first Number " + firstNum);
		else if (secondNum > firstNum && secondNum > thirdNum)
			System.out.println("The greatest number is the second Number " + secondNum);
		else
			System.out.println("The greatest number is the third Number " + thirdNum);
	}

}
