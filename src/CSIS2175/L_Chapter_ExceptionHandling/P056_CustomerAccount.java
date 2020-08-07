package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P056 - Creating Your Own Exception Classes

public class P056_CustomerAccount 
{
	private int acctNum;
	private double balance;
	public static double HIGH_CREDIT_LIMIT = 20000.00;
	
	public P056_CustomerAccount(int num, double bal) throws P056_HighBalanceException
	{
		acctNum = num;
		balance = bal;
		if(balance > HIGH_CREDIT_LIMIT)
			throw(new P056_HighBalanceException());
	}
}
