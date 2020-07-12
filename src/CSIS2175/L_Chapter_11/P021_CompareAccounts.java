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
		
		// 페이지 22에 있는 메서드를 BankAccount 클래스에 추가해줌으로써, 결과값이 TRUE로 바뀜.
		// equal 메서드 오버라이드로 변환.
	}

}
