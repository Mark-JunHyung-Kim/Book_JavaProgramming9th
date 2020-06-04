package CSIS2175.L_Chapter_5;
//Date : 2020.06.03
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~p8)
//Subject : More Object Concepts


public class OverridingVariable 
{

	public static void main(String[] args) 
	{
		int aNumber = 10;
		System.out.println("In main(), aNumber is " + aNumber);
		firstMethod();				// The value which is declared in different method doesn't affect the main method's value, even though the name of these two valuables is 100% same.
		System.out.println("Back in main(), aNumber is " + aNumber);
		secondMethod(aNumber);		// 이것도 마찬가지. 세컨드메서드 내에서 선언된 변수값은 메인메서드의 변수에 영향을 주지 않음 (이름이 같더라도!) 
		System.out.println("Back in main() again, aNumber is " + aNumber);
	}
	
	public static void firstMethod()
	{
		int aNumber =  77;
		System.out.println("In firstMethod(), aNumber is " + aNumber);
	}
	
	public static void secondMethod(int aNumber)
	{
		System.out.println("In secondMethod(), at first " + "aNumber is " + aNumber);
		aNumber = 862;
		System.out.println("In secondMethod(), after an assignment " + "aNumber is " + aNumber);
	}

}
