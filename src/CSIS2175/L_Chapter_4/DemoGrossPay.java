package CSIS2175.L_Chapter_4;
//Date : 2020.05.30
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4 (~p34)
//Subject : Using Methods, Classes, and Objects (아마 이번 챕터는 Book 내용이랑 같은듯)

import java.util.Scanner;


public class DemoGrossPay {

	public static void main(String[] args) 
	{
		double hours = 25;
		double yourHoursWorked = 37.5;
		double rate = 13.75;
		double rate2 = 9.74;
		calculateGross(10, 13.75);					// method is called three times using three different arguments.
		calculateGross(hours, rate);
		calculateGross(yourHoursWorked, rate2);
		
		System.out.println(calculateNetPay(hours, rate2));
	

	}
	// method header의 parameter 안에서 double = 'Parameter data type', hours = 'Parameter identifier'.
	// method header에서 double = return type (이걸 쓸경우 꼭 리턴값이 있어야함)
	public static double calculateGross(double hours, double rate)	// each time the method is called, the parameter 'hours'~
																	// ~received a copy of the value that was passed.
	{		
		double gross;
		gross = hours * rate;
		System.out.println(hours + " hours at $" + rate + " per hour is $" + gross);
	
		return gross;	// 리턴은 고정값으로 할 수도 있고, 일정 계산값으로 리턴할수도 있음.
						// 리턴값 뒤에는 절대로 뭘 써서는 안됨 (dead code) = can never execute -> causes a compiler error.
	}
	
	public static double calculateNetPay(double hours, double rate)
	{
		double gross;
		double withholding;
		double net;
		gross = calculateGross(hours, rate);
		withholding = calculateWithholding(gross);
		net = gross - withholding;
		return net;		
	}
	
	public static double calculateWithholding(double gross)	// 이건 내가 임의로 만든거.
	{
		double holdingRate;
		double resultWithholding;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the holdingrate >>");
		holdingRate = userInput.nextDouble();
		resultWithholding = gross * holdingRate;
		System.out.println("The result holding value is $" + resultWithholding);
		
		return resultWithholding;
	}
	

}
