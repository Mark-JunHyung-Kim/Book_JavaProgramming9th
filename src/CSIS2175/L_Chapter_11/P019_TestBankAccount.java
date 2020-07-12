package CSIS2175.L_Chapter_11;
//Date : 2020.07.11
//Name : Mark JunHyung Kim
//Chapter : Lecture#10 = Chapter#11
//Subject : Using the toString() Method

public class P019_TestBankAccount 
{

	public static void main(String[] args) 
	{
		P019_BankAccount myAccount = new P019_BankAccount(123, 4567.89);
		
		System.out.println(myAccount.toString());		// 이거하고 display() method 만드는거하고 차이점은?			

	}

}
