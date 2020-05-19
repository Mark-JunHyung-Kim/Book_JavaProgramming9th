package Chapter_2;
// Date : 2020.05.15
// Name : Mark JunHyung Kim
// Chapter : #2 (p58)
// Subject : Variables

public class Variables {

	public static void main(String[] args) {
		
		final int STATES_IN_US = 50;	// if I want to use constant declaration, use 'final' the front of variable, all caps, and underbars.
		
		System.out.println("The number of states is " + STATES_IN_US);
		
		
		int anInt = 1234;
		byte aByte = 12; // byte can not contain 1234. it's too long. 
		short aShort = 12345; // short can not contain 123456. 
		long aLong = 1234567890987654321L;	// if the number is too long, just attach 'L' at the last of numbers.
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		
		int anotherInt = anInt * 10000000;
		System.out.println("Another int is " + anotherInt);
		
		
		// Escape sequences
		
		// \n : Backspace ; moves the cursor one space to the left
		// \t : tap
		// \n : new line
		// \r : carrage return; moves the cursor to the beginning of the current line
		// \" : Double quotation mark
		// \' : Single quotation mark
		// \\ : Backslash
		
		System.out.println("\t\"abc\\def\bghi\n\njkl");
		

	}

}
