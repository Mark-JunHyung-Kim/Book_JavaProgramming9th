package Chapter_3;
//Date : 2020.06.02
//Name : Mark JunHyung Kim
//Chapter : Book Chapter#3 (P164)
//Subject : Using Methods, Classes, and Objects - ## Class Assignment1 

import java.util.Scanner;
public class NumbersDemo 
{

	public static void main(String[] args) 
	{
		int numA, numB;
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter the First integer Number >> ");
		numA = inputDevice.nextInt();
		
		System.out.print("Please enter the Second integer Number >> ");
		numB = inputDevice.nextInt();		
		
		displayTwiceTheNumber(numA);
		displayTwiceTheNumber(numB);
		
		displayNumberPlusFive(numA);
		displayNumberPlusFive(numB);
		
		displayNumberSquared(numA);
		displayNumberSquared(numB);
	}	
	public static void displayTwiceTheNumber(int inputNum)
	{
		System.out.println("The twiced number is " + (inputNum * 2));
	}
	
	public static void displayNumberPlusFive(int inputNum)
	{
		System.out.println(inputNum + " plus 5 is " + (inputNum + 5));
	}
	
	public static void displayNumberSquared(int inputNum)
	{
		System.out.println("The squared number of " + inputNum + " is = " + (inputNum * inputNum));
	}

}
