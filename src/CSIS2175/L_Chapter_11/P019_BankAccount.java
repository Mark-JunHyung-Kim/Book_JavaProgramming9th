package CSIS2175.L_Chapter_11;
//Date : 2020.07.11
//Name : Mark JunHyung Kim
//Chapter : Lecture#10 = Chapter#11
//Subject : Using the toString() Method

public class P019_BankAccount 
{
	private int acctNum;
	private double balance;
	public P019_BankAccount(int num, double bal)
	{
		acctNum = num;
		//balance = num;							// Don't do it
												// The bal parameter should be assigned to balance.
		
		balance = bal;
	}
	@Override
	public String toString()
	{
		String info = "BankAccount accttNum = " + acctNum + " Balance = $" + balance;
		return info;
	}
	
	
	// ������ 22 �߰�����
	
	public boolean equals(P019_BankAccount secondAcct)
	{
		boolean result;
		if(acctNum == secondAcct.acctNum && balance == secondAcct.balance)		// ���� �� �����Ұ�.
																				// ó���� �׳� acctNum�� ������, equal�� ����, ù������Ʈ.equal(�ι�°������Ʈ)�� ���⶧��.
			result = true;
		else
			result = false;
		return result;
	}

}
