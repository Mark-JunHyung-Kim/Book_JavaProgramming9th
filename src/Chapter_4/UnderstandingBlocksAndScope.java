package Chapter_4;
//Date : 2020.05.22
//Name : Mark JunHyung Kim
//Chapter : #4 (p170~)
//Subject : More Object Concepts

public class UnderstandingBlocksAndScope 
{
	public static void main(String[] args)
	{
		methodWithNestedBlocks();
		twoDeclarations();
	}
	
	public static void methodWithNestedBlocks()
	{	// Outer block starts with opening brace
		int aNumber = 10; // aNumber comes into existence
		
		System.out.println("In outer block, aNumber is " + aNumber);
		{	// Inner block starts with next opening brace
			int anotherNumber = 512;
			System.out.println("In inner block, aNumber is " + aNumber + " and another nubmer is " + anotherNumber);			
		}	// Inner block ends	
		// anotherNumber eases to exist; it goes out of scope
		
		System.out.println("In outer block, aNumber is " + aNumber);
	}	// Outer block ends	
	// aNumber ceases to exist; it goes out of scope
	
	public static void twoDeclarations()
	{
		{
			int someVar = 7;
			System.out.println(someVar);			
		}
		{
			int someVar = 845;	// �̰� ���� ���� block���� �־��ٸ�, �׳� someVar = 845��� �ص� ������,
								// ������ �� {}�� ���� scope�� ������ �����Ƿ� ���ε��� ������ �������.
			System.out.println(someVar);
		}
		
	}
	
	public static void invalidRedclarationMethod()
	{
		int aValue = 35;
		//int aValue = 44;	// �� block ������ ���� ������ �ι� �������ָ� �ȵ�!!
		{
			int anotherValue = 0;
		//	int aValue = 10;	// �� ��� �� ��Ͼȿ� ������ �����ؼ� �ɰͰ�����, �� ��ϵ� ù��° ��Ͼȿ� �����ֱ⶧���� ���������� �Ұ���.
		}
	}

}
