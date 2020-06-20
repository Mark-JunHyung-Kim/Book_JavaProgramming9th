package CSIS2175.L_Chapter_9;
//Date : 2020.06.19
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P011 - Employee - Demo

import Chapter_4.Employee;

public class P011_EmployeeDemo 
{

	public static void main(String[] args) 
	{
		P009_Employee[] someEmps = new P009_Employee[5];
		
		// 이부분 이어서. 
	}
	public static void bubbleSort(P009_Employee[] array)
	{
		int a, b;
		P009_Employee temp;
		int highSubscript = array.length - 1;
		
		for(a = 0; a < highSubscript; ++a)
		{
			for (b = 0; b < highSubscript; ++b)
			{
				if(array[b].getSalary() > array[b+1].getSalary())
				{
					temp = array[b];
					array[b] = array[b+1];
					array[b+1] = temp;
				}
			}
		}
	}

}
