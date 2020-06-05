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
		//stuNum = stuNum;		// 이렇게 하면 안됨!! 이름이 같을때는 this.를 써주거나 이름을 바꿔줘야함.
		//gpa = gpa;			// 만.약.에, 파라메터 이름이랑 메서드(클래스)내 변수 이름이 같으면 this를 써주면 됨. (혹은 메서드변수명을 바꾸던가)
		
		this.stuNum = stuNum;
		this.gpa = gpa;
	}
	
	public void showStudent()
	{
		System.out.println("Student #" + stuNum + " gpa is " + gpa);
	}

}
