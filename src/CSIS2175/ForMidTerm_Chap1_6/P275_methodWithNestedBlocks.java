package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P275 - method with nested blocks

public class P275_methodWithNestedBlocks {

	public static void main(String[] args) 
	{
		int aNumber = 10;
		
		System.out.println(aNumber);
		{
			int anotherNumber = 20;
			
			System.out.println(aNumber + " " + anotherNumber);		// anotherNumber는 이 scope 안에서만!!
		}
		
		System.out.println(aNumber + " " /* + anotherNumber*/ );	// anotherNumber 사용 불가

	}

}
