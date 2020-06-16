package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P316 - School class - with Name and address Class 

public class P316_School 
{
	private P315_NameAndAddress nameAdd;
	private int Enrollment;
	
	public P316_School(String name, String address, int zipCode, int enroll)
	{
		nameAdd = new P315_NameAndAddress(name, address, zipCode);
		Enrollment = enroll;
	}
	
	public void display()
	{
		System.out.println("The School Information : ");
		nameAdd.display();
		System.out.println("The enrollment is : " + Enrollment);
	}

	
}
