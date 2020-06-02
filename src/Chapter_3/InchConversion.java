package Chapter_3;
//Date : 2020.06.02
//Name : Mark JunHyung Kim
//Chapter : Book Chapter#3 (P164)
//Subject : Using Methods, Classes, and Objects - ## Class Assignment1 

import java.util.Scanner;
public class InchConversion 
{

	public static void main(String[] args) 
	{			
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Please enter the inch value >> ");
		int inchVal = inputDevice.nextInt();
		
		inchToFeet(inchVal);		
		inchToYard(inchVal);
	}
	public static void inchToFeet(int inputValue)
	{
		double inchToFeet = inputValue / 12.0 ;
		System.out.println(inputValue + " inch is " + inchToFeet + " feet");
		// if inch is 36, it will be 3.0 feet
	}
	public static void inchToYard(int inputValue)
	{
		double inchToYard = (inputValue / 12.0) / 3.0;
		System.out.println(inputValue + " inch is " + inchToYard + " yards");
		// if inch is 36, it will be 3.0 feet and will be 1.0 yard.
	}

}
