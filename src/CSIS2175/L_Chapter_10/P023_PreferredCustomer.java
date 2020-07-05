package CSIS2175.L_Chapter_10;
//Date : 2020.07.04
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P023 - Accessing Superclass Methods

public class P023_PreferredCustomer extends P022_Customer
{
	double discountRate;
	public P023_PreferredCustomer(int id, double bal, double rate)
	{
		super(id, bal);
		discountRate = rate;
	}
	@Override						// optional, but existing will be better.
	public void display()
	{
		super.display();
		System.out.println(" Discount rate is " + discountRate);
	}

}
