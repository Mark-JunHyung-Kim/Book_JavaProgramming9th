package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P056 - Creating Your Own Exception Classes

import javax.swing.*;
public class P056_UserCustomerAccount 
{

	public static void main(String[] args)
	{
		int num;
		double balance;
		String input;
		
		input = JOptionPane.showInputDialog(null, "Enter account number");
		num = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter balance due");
		balance = Double.parseDouble(input);
		
		try
		{
			P056_CustomerAccount ca = new P056_CustomerAccount(num, balance);
			JOptionPane.showInternalMessageDialog(null,  "Customer #" + num + " has a balance of $" + balance);
			
		}
		catch(P056_HighBalanceException hbe)
		{
			JOptionPane.showInternalMessageDialog(null,  "customer #" + num + " has a balance of $" + balance + "  which is higher than the credit limit");
		}
		

	}

}
