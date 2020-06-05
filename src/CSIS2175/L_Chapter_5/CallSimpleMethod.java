package CSIS2175.L_Chapter_5;
//Date : 2020.06.04
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~14)
//Subject : More Object Concepts

public class CallSimpleMethod 
{

	public static void main(String[] args) 
	{
		double doubleValue = 45.67;
		int intValue = 17;
		simpleMethod(doubleValue);
		simpleMethod(intValue);
	}
	public static void simpleMethod(double d)
	{
		System.out.println("Method receives double parameter");
	}
	public static void simpleMethod(int d)
	{
		System.out.println("Method receives integer parameter");
	}

}
