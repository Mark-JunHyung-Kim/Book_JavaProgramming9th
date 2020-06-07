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
		enrollment = enrolled;								// 고로, 컨스트럭터 콜을 해서 nameAdd 오브젝트에 해당 값을 가질수 있도록 해주는 것.
	}
	public void display()
	{
		System.out.println("The school information: ");
		nameAdd.display();									// this statement calls the display() method in the NameAndAddress class.
		System.out.println("Enrollment is " + enrollment);
	}
}
