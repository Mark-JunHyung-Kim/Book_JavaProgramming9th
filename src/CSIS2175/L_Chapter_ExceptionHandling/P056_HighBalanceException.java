package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P056 - Creating Your Own Exception Classes

public class P056_HighBalanceException extends Exception
{
	public P056_HighBalanceException()
	{
		super("Customer balance is high");
	}
}
