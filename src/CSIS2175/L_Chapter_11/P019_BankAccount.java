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
	
	
	// 페이지 22 추가내용
	
	public boolean equals(P019_BankAccount secondAcct)
	{
		boolean result;
		if(acctNum == secondAcct.acctNum && balance == secondAcct.balance)		// 구조 잘 이해할것.
																				// 처음에 그냥 acctNum인 이유는, equal을 쓸때, 첫오브젝트.equal(두번째오브젝트)로 쓰기때문.
			result = true;
		else
			result = false;
		return result;
	}

}
