package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P061 - Displaying the Virtual Keyboard


import java.util.*;
import java.io.IOException;
public class P061_VirtualKeyboardDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		try
		{
			Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		String name;
		System.out.print("Enter name >> ");
		name = input.nextLine();
		System.out.println("Hello, " + name + " ! ");
		

	}

}
