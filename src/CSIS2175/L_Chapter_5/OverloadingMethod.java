package CSIS2175.L_Chapter_5;
//Date : 2020.06.04
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~11)
//Subject : More Object Concepts

public class OverloadingMethod 			// ���� �̸� �޼��忡 �ٸ� type argument���� ���� ��.
{

	public static void main(String[] args) 
	{
		System.out.println("If two arguments are all double type values, >>");
		calculateInterest(1000.00, 0.04);
		
		System.out.println();
		
		System.out.println("or if one arg. is double and another is int, >>");
		calculateInterest(1000.00, 4);
	}
	
	public static void calculateInterest(double bal, double rate)
	{
		double interest;
		interest = bal * rate;
		System.out.println("Simple interest on $" + bal + " at " + rate + "% rate is " + interest);
	}
	
	public static void calculateInterest(double bal, int rate)
	{
		double interest, rateAsPercent;
		rateAsPercent = rate / 100.0;	// Dividing by 100.0 converts rate to its percent equivalent(������).
		interest = bal * rateAsPercent;
		System.out.println("Simple interest on $" + bal + " at " + rate + "% rate is " + interest);
	}

}
