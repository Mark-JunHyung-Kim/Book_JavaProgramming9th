package CSIS2175.L_Chapter_4;
//Date : 2020.05.30
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4 (~p34)
//Subject : Using Methods, Classes, and Objects (�Ƹ� �̹� é�ʹ� Book �����̶� ������)

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
	// method header�� parameter �ȿ��� double = 'Parameter data type', hours = 'Parameter identifier'.
	// method header���� double = return type (�̰� ����� �� ���ϰ��� �־����)
	public static double calculateGross(double hours, double rate)	// each time the method is called, the parameter 'hours'~
																	// ~received a copy of the value that was passed.
	{		
		double gross;
		gross = hours * rate;
		System.out.println(hours + " hours at $" + rate + " per hour is $" + gross);
	
		return gross;	// ������ ���������� �� ���� �ְ�, ���� ��갪���� �����Ҽ��� ����.
						// ���ϰ� �ڿ��� ����� �� �Ἥ�� �ȵ� (dead code) = can never execute -> causes a compiler error.
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
	
	public static double calculateWithholding(double gross)	// �̰� ���� ���Ƿ� �����.
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
