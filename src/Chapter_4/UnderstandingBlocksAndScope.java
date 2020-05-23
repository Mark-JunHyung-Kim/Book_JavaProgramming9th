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
			int someVar = 845;	// 이게 만약 같은 block내에 있었다면, 그냥 someVar = 845라고 해도 되지만,
								// 지금은 각 {}에 따라 scope가 나눠져 있으므로 따로따로 선언을 해줘야함.
			System.out.println(someVar);
		}
		
	}
	
	public static void invalidRedclarationMethod()
	{
		int aValue = 35;
		//int aValue = 44;	// 한 block 내에서 같은 변수를 두번 선언해주면 안됨!!
		{
			int anotherValue = 0;
		//	int aValue = 10;	// 이 경우 새 블록안에 변수를 선언해서 될것같지만, 이 블록도 첫번째 블록안에 속해있기때문에 변수선언이 불가능.
		}
	}

}
