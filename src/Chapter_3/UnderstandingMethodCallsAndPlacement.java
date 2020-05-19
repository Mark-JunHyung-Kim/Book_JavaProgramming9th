package Chapter_3;
// Date : 2020.05.18
// Name : Mark JunHyung Kim
// Chapter : #3 (p102~)
// Subject : Understanding Method Calls and Placement

public class UnderstandingMethodCallsAndPlacement {

	public static void main(String[] args) {		
		
		displayAddress();
		System.out.println("This is main domain");
		
		displayInfo();
		
	}
	
	public static void displayAddress() {
		System.out.println("XYZ Company");
		System.out.println("8900 U.S Hwy 14");
		System.out.println("Crystal Lake, IL 60014");
	}
	
	// every methods should have a method header & body
	
	// The method header contains (1) Optional access specifiers (2) A return type (3) An identifier (4) Parentheses.
	// public, static = access specifier
	// void = return type
	
	
	// ** You do it (Page#118)	
	
	public static void displayInfo() {
		System.out.println("Paradise Day Spa wants to pamper you.");
		System.out.println("We will make you look good.");
	}
	
	// go to the TestInfo.java

}
