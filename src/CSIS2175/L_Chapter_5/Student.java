package CSIS2175.L_Chapter_5;
//Date : 2020.06.04 ~ 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~25)
//Subject : More Object Concepts

public class Student 
{
	private int stuNum;
	private double gpa;
	
	/*
	public Student (int stuNum, double gpa)
	{
		//stuNum = stuNum;		// �̷��� �ϸ� �ȵ�!! �̸��� �������� this.�� ���ְų� �̸��� �ٲ������.
		//gpa = gpa;			// ��.��.��, �Ķ���� �̸��̶� �޼���(Ŭ����)�� ���� �̸��� ������ this�� ���ָ� ��. (Ȥ�� �޼��庯������ �ٲٴ���)
		
		this.stuNum = stuNum;
		this.gpa = gpa;
	}
	*/
	
	
	
	
	Student(int num, double avg)
	{
		stuNum = num;
		gpa = avg;		
	}
	Student(double avg)
	{
//		stuNum = 999;
//		gpa = avg;
		this(999, avg);		// �� ������ƮŬ������ �ִ� ������ ���ʴ�� �ش� ���� �ִ°� (��� �̰� ���� ���ٰ� ����� ����)
	}
	Student(int num)
	{
//		stuNum = num;
//		gpa = 0.0;
		this(num, 0.0);		// �� ������ƮŬ������ �ִ� ������ ���ʴ�� �ش� ���� �ִ°� (��� �̰� ���� ���ٰ� ����� ����)
	}
	Student()
	{
//		stuNum = 999;
//		gpa = 0.0;
		this(999, 0.0);		// �� ������ƮŬ������ �ִ� ������ ���ʴ�� �ش� ���� �ִ°� (��� �̰� ���� ���ٰ� ����� ����)
	}
	
	
	
	
	
	public void showStudent()
	{
		System.out.println("Student #" + stuNum + " gpa is " + gpa);
	}

}
