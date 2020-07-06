package CSIS2175.L_Chapter_10;
//Date : 2020.07.05
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P028 - Employing Information Hiding

public class P028_Student 
{
	private int idNum;
	private double gpa;
	public int getIdNum()
	{
		return idNum;
	}
	public double getGpa()
	{
		return gpa;
	}
	public void setIdNum(int num)
	{
		idNum = num;
	}
	public void setGpa(double gradePoint)
	{
		gpa = gradePoint;
	}
	
	P028_Student someStudent = new P028_Student();		// create object in Student Class
	
	//someStudent.idNum = 812;							// Don't do it : cannot access a private data memeber of an object.
	
	//someStudent.setIdNum(812);							// correct way.

}
