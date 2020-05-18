// Date : 2020.05.17
// Name : Mark JunHyung Kim
// Chapter : #2 (p88~)
// Subject : Using arithmetic operators


import java.util.Scanner;
public class UsingArithmeticOperators {

	public static void main(String[] args) {
		
		double answer = 2.20 - 2.00;
		boolean isEqual = answer == 0.20;
		
		System.out.println("answer is " + answer);
		System.out.println("isEqual is " + isEqual);	// it occurs 'false' because of round numbers!
		
		
		// **You do it (Page#93) 
		
		// Using Arithmetic Operators
		
		/*
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		int average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextInt();
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
		
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("the average of " + firstNumber + " and " + secondNumber + " is " + average);
		*/
		
		// Performing Floating-Point Arithmetic
		
		double firstNumber;
		double secondNumber;
		double sum;
		double difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextDouble();		// sample number = 16.4
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextDouble();		// sample number = 2.2
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
		
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("the average of " + firstNumber + " and " + secondNumber + " is " + average);
		// it will occur inappropriate numbers as results!
		

	}

}
