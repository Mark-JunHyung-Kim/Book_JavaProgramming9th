package Chapter_3;
//Date : 2020.05.20
//Name : Mark JunHyung Kim
//Chapter : #3 (p125~)
//Subject : Creating Methods

import java.util.Scanner;

public class CreatingMethods {

	public static void main(String[] args) {
		
		// page 125 ~
		calculateGross(1.5, 2.5);
		
		System.out.println(calculateGross(1.2,  1.5));	// if there is no 'return' in the method, it doesn't work.
		
		double myPay;
		double myHoursWorked = 1.8;
		double myRate = 1.7;
		
		myPay = calculateGross(myHoursWorked, myRate);
		System.out.println("My Pay is " + myPay);
		
		System.out.println("\n\n");
		
		// You Do It (Page#130)
		
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		
		System.out.println("Enter discount rate as a whole number >> ");
		discount = keyboard.nextDouble();
		
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That's a savings of at least $" + savings);
		

	}
	
	// Creating a method that requires multiple parameters	
	public static double calculateGross(double hours, double rate)	// static "double"(return type) ~
	{
		double gross;
		gross = hours * rate;
		System.out.println(hours + " hours at $" + rate + " per hour is $" + gross);
		return gross;	// The value that is returned.
	}
	
	// Chaining Method Calls
	
	public static double calculateNetPay(double hours, double rate)
	{
		double gross;	// it doesn't matter because it's local valuable in this method. (although valuable name is same with previous one)
		double withholding;
		double net;
		gross = calculateGross(hours, rate);
		withholding = calculateGross(gross, rate);
		net = gross - withholding;
		return net;
		
		// Also I can call calculateNetPay with other methods which return a double.
		// double net = calculateNetPay(getHours(), getRate());
	}
	
	// You Do It (Page#130)
	
	 public static double computeDiscountInfo(double price, double discountRate)
	 {
		 double savings;
		 savings = price * discountRate / 100;
		 return savings;
	 }

}
