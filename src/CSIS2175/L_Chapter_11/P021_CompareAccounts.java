package CSIS2175.L_Chapter_11;
//Date : 2020.07.11
//Name : Mark JunHyung Kim
//Chapter : Lecture#10 = Chapter#11
//Subject : Compare Accounts

public class P021_CompareAccounts 
{

	public static void main(String[] args) 
	{
		P019_BankAccount acct1 = new P019_BankAccount(1234, 500.00); 
		P019_BankAccount acct2 = new P019_BankAccount(1234, 500.00);
		
		if(acct1.equals(acct2))
			System.out.println("Accounts are equal");
		else
			System.out.println("Accounts are not equal");		// It's not equal because hash codes are different.
		
		// ������ 22�� �ִ� �޼��带 BankAccount Ŭ������ �߰��������ν�, ������� TRUE�� �ٲ�.
		// equal �޼��� �������̵�� ��ȯ.
	}

}
