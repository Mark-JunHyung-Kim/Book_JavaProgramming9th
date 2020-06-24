package CSIS2175.ForMidTerm_Chap1_6;

import java.util.*;
public class PhoneNumberFormat 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		StringBuilder inputString = new StringBuilder(10);
		final String MAX = "999";
		char temp;
		boolean output = false;		
		
		System.out.print("Please Enter your Phone Number : >> ");
		inputString.append(input.nextLine());				
		
		for(int i = 0; i < inputString.length(); ++i)
		{
			temp = inputString.charAt(i);
			
			if(Character.isDigit(temp) == false)
			{								
				output = false;
			}
			else
				output = true;
		}
		
		while((inputString.toString().equals(MAX) == false) && (inputString.length() != 10 || output == false))
		{
			for(int i = 0; i < inputString.length(); ++i)
			{
				temp = inputString.charAt(i);
				
				if(Character.isDigit(temp) == false)
				{								
					output = false;
				}
				else
					output = true;
			}
			System.out.println("Please enter 10 digit numbers!! or 999>>");
			inputString.replace(0, inputString.length(), input.nextLine());						
		}
		
		
		inputString.insert(0, "(");
		inputString.insert(4, ")");
		inputString.insert(8, "-");
		
		System.out.println("Your Phone Number is : " + inputString);
		
		 
		
		
		
		
		

		
		
		

	}

}
