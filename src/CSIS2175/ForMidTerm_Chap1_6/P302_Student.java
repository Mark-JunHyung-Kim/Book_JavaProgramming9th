package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P302 - School class Demo 

public class P302_Student 
{
	private static final int SCHOOL_ID = 12345;			// static final : symbolic constant
	private int stdNum;
	private double gpa;
	
	public P302_Student(int stdNum, double gpa)
	{
		this.stdNum = stdNum;
		this.gpa = gpa;
	}
	
	public void display()
	{
		System.out.println("Student #" + stdNum + " gpa is " + gpa);
	}

}
