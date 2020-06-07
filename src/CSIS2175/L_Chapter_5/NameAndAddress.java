package CSIS2175.L_Chapter_5;
//Date : 2020.06.06
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~44)
//Subject : More Object Concepts

public class NameAndAddress 
{
	private String name;
	private String address;
	private int zipCode;
	
	public NameAndAddress(String nm, String add, int zip)	// 이게 School 클래스에서 콜 당하는 컨스트럭터.
	{
		name = nm;
		address = add;
		zipCode = zip;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(zipCode);
	}
}
