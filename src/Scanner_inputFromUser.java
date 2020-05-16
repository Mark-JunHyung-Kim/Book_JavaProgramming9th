// Date : 2020.05.15
// Name : Mark JunHyung Kim
// Chapter : #2 (p75)
// Subject : Scanner class (retrives input from user)

import java.util.Scanner;	// importing default java class
public class Scanner_inputFromUser {

	public static void main(String[] args) {
		
		Scanner inputDevice = new Scanner(System.in);
		
		
		String name;
		int age;
		
		// ** Warning! don't put numeric input prior to string input!!	
		
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();	// 여기서 입력값 치고 엔터를 쳤기때문에
		
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();	// 여기서 엔터키전까지의 입력값을 인식하고 바로 넘어간다. (엔터를 consuming함)				
		
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		
		
		
		// ** Solution : add another nextLine(); before the next nextLine();
		
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		
		inputDevice.nextLine();	// this statement consumes the Enter key that follows the integers.
		
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();				
		
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		
		
		// ** You do it (Page#79)
		
		int anInt;
		byte aByte; 
		short aShort; 
		long aLong;		
		
		
		System.out.println("Please enter an integer >> ");
		anInt = inputDevice.nextInt();
		System.out.println("Please enter a byte integer >> ");
		aByte = inputDevice.nextByte();
		System.out.println("Please enter a short integer >> ");
		aShort = inputDevice.nextShort();
		System.out.println("Please enter a long integer >> ");
		aLong = inputDevice.nextLong();
		
		inputDevice.nextLine();		// Solution to solve the problem 
		
		System.out.println("Please enter your name >> ");		
		name = inputDevice.nextLine();
		
		System.out.println("Thank you, " + name);		
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);				

	}

}
