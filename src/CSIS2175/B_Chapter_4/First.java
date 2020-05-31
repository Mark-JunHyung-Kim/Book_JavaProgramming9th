package CSIS2175.B_Chapter_4;
//Date : 2020.05.30
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4
//Subject : Using Methods, Classes, and Objects (아마 이번 챕터는 Book 내용이랑 같은듯)

public class First {

	public static void main(String[] args) 
	{
		displayAddress();
		System.out.println("First Java application");	
	}
	
	// qualified method name = First.displayAddress (클래스명까지 풀로 쓰는것)
	// access identifier 가 static이면 굳이 First까지 쓸 필요가 없음.
	public static void displayAddress() 	
	{
		System.out.println("XYZ Company");
		System.out.println("8900 U.S Hwy 14");
		System.out.println("Crystal Lake, IL 60014");
	}

}
