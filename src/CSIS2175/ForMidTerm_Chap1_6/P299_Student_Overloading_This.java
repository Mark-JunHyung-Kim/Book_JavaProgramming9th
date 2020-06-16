package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P298 - Student class with overloading and this

public class P299_Student_Overloading_This 
{
	private int stdNum;
	private double gpa;
	
	public P299_Student_Overloading_This(int num, double avg)
	{
		stdNum = num;
		gpa = avg;
	}
	
	public P299_Student_Overloading_This(double avg)
	{
		this(999, avg);
	}
	
	public P299_Student_Overloading_This(int num)
	{
		this(num, 0.0);
	}
	
	public P299_Student_Overloading_This()
	{
		this(999, 0.0);
	}

}
