package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P298 - Student class with overloading

public class P298_Student_Overloading 
{
	private int stdNum;
	private double gpa;
	
	public P298_Student_Overloading(int num, double avg)
	{
		stdNum = num;
		gpa = avg;
	}
	
	public P298_Student_Overloading(double avg)
	{
		stdNum = 999;
		gpa = avg;
	}
	
	public P298_Student_Overloading(int num)
	{
		stdNum = num;
		gpa = 0.0;
	}
	
	public P298_Student_Overloading()
	{
		stdNum = 999;
		gpa = 0.0;
	}

}
