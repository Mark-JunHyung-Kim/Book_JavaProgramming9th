package Chapter_4;
//Date : 2020.06.01
//Name : Mark JunHyung Kim
//Chapter : Book : Chapter#4 (P182)
//Subject : More Object Concepts

public class CallSimpleMethod {

	public static void main(String[] args) 
	{
		double doubleValue = 45.67;
		int intValue = 17;
		simpleMethod(doubleValue);	// As a different parameter, same named method can produce different output.
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
