package CSIS2175.L_Chapter_8;
//Date : 2020.07.01
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P024 - Business Letter

import javax.swing.JOptionPane;

public class P024_BusinessLetter 
{

	public static void main(String[] args) 
	{
		String name;
		String firstName = "";
		String familyName = "";
		
		int x;
		char c;
		
		name = JOptionPane.showInputDialog(null, "Please enter customer's first and last name");
		
		x = 0;
		
		while(x < name.length())							// ¡Ú¡Ú ÀÌ°Å ²Ï ±¦ÂúÀºµí.
		{
			if(name.charAt(x) == ' ')						// check the blank space between first and last name
			{	
				firstName = name.substring(0, x);			// then, save the first name (before blank space) to firstName String.
				familyName = name.substring(x + 1, name.length());	// and save the last name (after the blank space) to familyName String.
				x = name.length();							// escape while condition sequence.				
			}
			++x;
		}
		
		JOptionPane.showMessageDialog(null,  "Dear " + firstName + ",\nI am so glad we are on a first name basis" + 
																   "\nbecause I would like the opportunity to" + 
																   "\ntalk to you about an affordable insurance" + 
																   "\nprotection plan for the entire " + familyName +
																   "\nfamily. Call A-One Family Insurance today" +
																   "\nat 1-800-555-9287.");

	}

}
