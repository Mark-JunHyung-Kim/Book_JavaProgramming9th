package CSIS2175.L_Chapter_5;
//Date : 2020.06.06
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~45)
//Subject : More Object Concepts

public class School 
{
	private NameAndAddress nameAdd;			// this statement declares a NameAndAddress object.
	private int enrollment;
	
	public School(String name, String add, int zip, int enrolled)
	{
		nameAdd = new NameAndAddress(name, add, zip);		// this statement calls the constructor in the NameAndAddress class.
		enrollment = enrolled;								// ���, ����Ʈ���� ���� �ؼ� nameAdd ������Ʈ�� �ش� ���� ������ �ֵ��� ���ִ� ��.
	}
	public void display()
	{
		System.out.println("The school information: ");
		nameAdd.display();									// this statement calls the display() method in the NameAndAddress class.
		System.out.println("Enrollment is " + enrollment);
	}
}
