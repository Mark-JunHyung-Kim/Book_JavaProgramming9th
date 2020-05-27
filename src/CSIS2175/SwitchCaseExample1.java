package CSIS2175;

public class SwitchCaseExample1 {

	public static void main(String[] args) 
	{
		int num=54;
		switch(num)
		{
		case 1:
			System.out.println("Case1: Value is : " + num);
			break;
		case 2:
			System.out.println("Case2: Value is : " + num);
			break;
		case 54:
			System.out.println("Case54: Value is : " + num);
			break;
		default:
			System.out.println("Default : Value is : " + num);		
		}
	}

}
