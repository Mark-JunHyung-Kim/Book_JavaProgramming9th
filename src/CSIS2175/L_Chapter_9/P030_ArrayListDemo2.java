package CSIS2175.L_Chapter_9;
//Date : 2020.06.25
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P030 - Array List Demo2


import javax.swing.*;
import java.util.ArrayList;

public class P030_ArrayListDemo2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> students = new ArrayList<String>();
		
		String name;
		
		final int LIMIT = 4;
		
		for(int x = 0; x < LIMIT; ++x)
		{
			name = JOptionPane.showInputDialog(null, "Enter a student's name");
			students.add(name);										// ArrayList에 input값으로 받은 string name을 4번 넣어줌.
		}
		
		System.out.println("The names are " + students);			// 희안하게, ArrayList를 출력하면 대괄호 내에 각 값들이 한번에 출력됨!
	}

}
