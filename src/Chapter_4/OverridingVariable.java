package Chapter_4;
//Date : 2020.05.22
//Name : Mark JunHyung Kim
//Chapter : #4 (p174~)
//Subject : More Object Concepts

public class OverridingVariable 
{
	public static void main(String[] args) 
	{
		int aNumber = 10;	// aNumber is declared in main().
		System.out.println("In main(), aNumber is " + aNumber);
		firstMethod();
		System.out.println("Back in main(), aNumber is " + aNumber);	// ������ 10!!
		secondMethod(aNumber);
		System.out.println("Back in main() again, aNumber is " + aNumber);
		// Whenever aNumber is used in main(), it retains its value of 10.	// �̰͵� 10!!
		// Method�� ����ϸ鼭 ���� �̸����� ������ �ٸ� �����͸� �����Ѵٰ� �ص�, �װ� �ٸ� ����(�ּ�)�� �����!!
		// ���ο����� ������ aNumber�� 10��!!
	}
	public static void firstMethod()
	{
		int aNumber = 77;	// This aNumber resides at a different memory address from the one in main().
							// it is declared locally in this method.
		System.out.println("In firstMethod(), aNumber is " + aNumber);		
	}
	public static void secondMethod(int aNumber)	// This aNumber also resides at a different memory address from
													// ~the one in main(). it is declared locally in this method.
	{
		System.out.println("In secondMethod(), at first " + "aNumber is " + aNumber);
		aNumber = 862;
		System.out.println("In secondMethod(), after an assignment " + "aNumber is " + aNumber);
	}
	
	// å 175p���� ����!!

}
