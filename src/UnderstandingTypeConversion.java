// Date : 2020.05.17
// Name : Mark JunHyung Kim
// Chapter : #2 (p96~)
// Subject : Understanding Type Conversion


import java.util.Scanner;
public class UnderstandingTypeConversion {

	public static void main(String[] args) {
		
		// the lower-type operand is converted to the higher one!
		// ex) double + int = double , or subtraction of a long from a float = float.
		// Boolean values cannot be converted to another type.
		
		int hoursWorked = 37;
		double payRate = 16.73;
		double grossPay = hoursWorked * payRate;
		
		System.out.println(grossPay);	// 619.01. because grossPay's data type is double.
		
		// int grossPay = hoursWorked * payRate 
		// it will not compile because Java does not allow the loss of precision that occurs if you rty to store the calculated double result in an int. 
		
		// The data types char, short, and byte all are promoted to int!
		
		
		double bankBalance = 189.66;
		float weeklyBudget = (float)(bankBalance / 4);	// if i don't use (float) = conversion operator, it will not compile.
		System.out.println(weeklyBudget);
		//weeklyBudget is 47.415 one-fourth of bankBalance.
		
		
		float myMoney = 47.82f;
		int dollars = (int) myMoney;
		System.out.println(dollars);
		// dollarss is 47, the integer part of myMoney.
		
		// if i want to assign 10 to double data type, I have to use "10.0" not a just "10".
		
		System.out.println("\n\n");
		
		
		// ** You do it (Page#99)
		
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextInt();		// sample number = 16.4
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextInt();		// sample number = 2.2
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		
		average = sum / 2;	// result = (int 19 + int 20) / 2 = int (19.5) => 0.5 will be lost. 
		System.out.println("the average of " + firstNumber + " and " + secondNumber + " is " + average);
		
		average = (double) sum / 2;	// change it to include a cast.
		
		System.out.println();
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("the average of " + firstNumber + " and " + secondNumber + " is " + average);
		
		System.out.println();
		average = (double) (sum / 2);	// it will be same with the first result.
		System.out.println("the average of " + firstNumber + " and " + secondNumber + " is " + average);
		
		System.out.println();
		average = sum / 2.0;	// in this calculation, integer sum is divided by the 'double' constant '2.0'
		System.out.println("the average of " + firstNumber + " and " + secondNumber + " is " + average);
		

	}

}
