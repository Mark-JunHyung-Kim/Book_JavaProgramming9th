package CSIS2175.L_Chapter_5;
//Date : 2020.06.04
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~25)
//Subject : More Object Concepts

public class Student 
{
	private int stuNum;
	private double gpa;
	
	public Student (int stuNum, double gpa)
	{
		//stuNum = stuNum;		// �̷��� �ϸ� �ȵ�!! �̸��� �������� this.�� ���ְų� �̸��� �ٲ������.
		//gpa = gpa;			// ��.��.��, �Ķ���� �̸��̶� �޼���(Ŭ����)�� ���� �̸��� ������ this�� ���ָ� ��. (Ȥ�� �޼��庯������ �ٲٴ���)
		
		this.stuNum = stuNum;
		this.gpa = gpa;
	}
	
	public void showStudent()
	{
		System.out.println("Student #" + stuNum + " gpa is " + gpa);
	}

}
