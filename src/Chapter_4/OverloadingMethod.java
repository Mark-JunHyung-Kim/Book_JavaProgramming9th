package Chapter_4;
//Date : 2020.05.24
//Name : Mark JunHyung Kim
//Chapter : #4 (p181)
//Subject : Overloading a Method

public class OverloadingMethod {

	public static void main(String[] args) 
	{
		calculateInterest(1000.00, 0.04);
		
		calculateInterest(1000.00, 4);	// if the second method doesn't exist, the result will be wrong.
		// result(1) = 4000.0 => wrong (using the method in the first type)
		// result(2) = 40.0 => correct (using the method in the second type)
	}
	
	// Multiple methods can share a name, and the compiler understands which one to use based on the arguments in the method call.
	// for example, these two method share a name, but have different argument types - double or int (input value type)
	// It means the calculateInterest method has two different type versions.
	
	public static void calculateInterest(double bal, double rate)
	{
		double interest;
		interest = bal * rate;
		System.out.println("Simple interest on $" + bal + " at " + rate + "% rate is " + interest);
	}
	
	public static void calculateInterest(double bal, int rate)
	{
		double interest, rateAsPercent;
		rateAsPercent = rate / 100.0;
		interest = bal * rateAsPercent;
		System.out.println("Simple interest on $" + bal + " at " + rate + "$ rate is " + interest);		
	}

}
