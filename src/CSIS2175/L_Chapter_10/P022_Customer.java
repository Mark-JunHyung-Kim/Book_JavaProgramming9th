package CSIS2175.L_Chapter_10;
//Date : 2020.07.04
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P022 - Accessing Superclass Methods

public class P022_Customer 
{
	private int idNumber;
	private double balanceOwed;
	public P022_Customer(int id, double bal)
	{
		idNumber = id;
		balanceOwed = bal;		
	}
	public void display()
	{
		System.out.println("Customer #" + idNumber + " Balance $" + balanceOwed);
	}

}
