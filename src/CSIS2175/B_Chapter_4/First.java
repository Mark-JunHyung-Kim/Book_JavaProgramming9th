package CSIS2175.B_Chapter_4;
//Date : 2020.05.30
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4
//Subject : Using Methods, Classes, and Objects (�Ƹ� �̹� é�ʹ� Book �����̶� ������)

public class First {

	public static void main(String[] args) 
	{
		displayAddress();
		System.out.println("First Java application");	
	}
	
	// qualified method name = First.displayAddress (Ŭ��������� Ǯ�� ���°�)
	// access identifier �� static�̸� ���� First���� �� �ʿ䰡 ����.
	public static void displayAddress() 	
	{
		System.out.println("XYZ Company");
		System.out.println("8900 U.S Hwy 14");
		System.out.println("Crystal Lake, IL 60014");
	}

}
