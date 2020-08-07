package CSIS2175.L_Chapter_ExceptionHandling;
//Date : 2020.08.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#11 = Exception Handling
//Subject : P054 - Tracing Exceptions Through the Call Stack

public class P054_DemoStackTrace2 
{

	public static void main(String[] args) 
	{
		methodA();
	}
	
	public static void methodA()
	{
		System.out.println("In methodA()");
		try
		{
			methodB();			
		}
		catch(ArrayIndexOutOfBoundsException error)
		{
			System.out.println("In methodA() - the stack trace : ");
			error.printStackTrace();									// 이걸 넣어줘서 정상적으로 작동? 
		}
		System.out.println("methodA() ends normally.");
		System.out.println("Application could continue from this point.");		
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
		System.out.println(array[3]);					// index가 out of bound지만,
	}
}
