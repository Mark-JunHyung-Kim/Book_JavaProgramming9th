package CSIS2175.L_Chapter_5;
//Date : 2020.06.03
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~p4)
//Subject : More Object Concepts

public class methodWithNestedBlocks {

	public static void main(String[] args) 
	{
		int aNumber = 10;
		
		System.out.println("In outer block, a Number is " + aNumber);
		{
			int anotherNumber = 512;
			System.out.println("In inner block, aNumber is " + aNumber + " and another number is " + anotherNumber);
		}
		
		System.out.println("In outer block, aNumber is " + aNumber);
	}
	
	
	public static void invalidRedeclarationMethod()
	{
		int aValue = 35;
		//int aValue = 44;		// Invalid redeclaration of aValue because it is in the same block as the first declaration.
		{
			int anotherValue = 0;
			//int aValue = 10;	// Invalid redeclaration of aValue; even though this is a new block, this block is inside the first block.
		}
	}
	
}


