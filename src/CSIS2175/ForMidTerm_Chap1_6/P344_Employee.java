package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.14
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P344 ~ P348 - Creating Employee Class

public class P344_Employee 
{
	private int empNum;
	private double empSal;
	
	public P344_Employee(int e, double s)
	{
		empNum = e;
		empSal = s;
	}
	
	public int getEmpNum()
	{
		return empNum; 
	}
	
	public double getSalary()
	{
		return empSal;
	}

}
