package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P052 - Tracing Exceptions Through the Call Stack

public class P052_DemoStackTrace 
{

	public static void main(String[] args) 
	{
		methodA();
	}
	public static void methodA()
	{
		System.out.println("In methodA()");
		methodB();
	}
	public static void methodB()
	{
		System.out.println("In methodB()");
		methodC();
	}
	public static void methodC()
	{
		System.out.println("In methodC()");
		int[] array = {0, 1, 2};
		System.out.println(array[3]);					// 이렇게하면 줄줄이 다오류남.
	}

}
