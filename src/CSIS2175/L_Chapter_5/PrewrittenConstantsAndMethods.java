package CSIS2175.L_Chapter_5;
//Date : 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (34)
//Subject : More Object Concepts


//import java.lang.Math;	// It can be omitted because it's prewritten class.
//Math클래스는 수학에 관련된 기본적인 method들이 들어있는 class임.

// class import 할때 * 하면 해당 클래스에 모든 '패키지' (package)를 다 import 가능
public class PrewrittenConstantsAndMethods 
{

	public static void main(String[] args) 
	{
		int radius = 5;
		
		double areaOfCircle = java.lang.Math.PI * radius * radius;
		//double areaOfCircle = Math.PI * radius * radius;	// Math클래스는 prewritten 클래스이기때문에, 굳이 import하지않아도 사용가능.
		
		System.out.println("Area of circle is = " + areaOfCircle);
		
		
		
		
	

	}

}
