package CSIS2175.L_Chapter_5;
//Date : 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (31)
//Subject : More Object Concepts

public class Student2 
{
	private static final int SCHOOL_ID = 12345;		// static final symbolic constant
	
	private int stuNum;
	private double gpa;
	
	public Student2(int stuNum, double gpa)
	{
		this.stuNum = stuNum;
		this.gpa = gpa;		
	}
	public void showStudent()
	{
		System.out.println("Student #" + stuNum + " gpa is " + gpa);
	}

}
