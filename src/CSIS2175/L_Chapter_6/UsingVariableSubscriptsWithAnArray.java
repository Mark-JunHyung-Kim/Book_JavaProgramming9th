package CSIS2175.L_Chapter_6;
//Date : 2020.06.12
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#6 (p~17)
//Subject : Arrays

public class UsingVariableSubscriptsWithAnArray {

	public static void main(String[] args) 
	{
		
		int[] tenMult = {10, 20, 30, 40, 50, 60};		
		int sub = 0;
		
		for (sub = 0; sub < 5; ++sub)
			tenMult[sub] += 3;
		
		for (int num = 0; num < 5; ++num)
			System.out.println(tenMult[num]);	
		
		
		// Use 'symbolic constant'
		
		int[] scoreArray = {10, 20, 30, 40, 50};
		
		final int NUMBER_OF_SCORES = 5;		// <= Symbolic constant = has a number with same size of array.
			for(sub = 0; sub < NUMBER_OF_SCORES; ++sub)
				scoreArray[sub] += 3;
			
		// or,
			for(sub = 0; sub < scoreArray.length; ++sub)	// => length field : number of elements in the array.
				scoreArray[sub] += 3;
		

			
		// Enhanced 'for loo'p or 'for each loop'.
			
			for(sub = 0; sub < scoreArray.length; ++sub)
				System.out.println(scoreArray[sub]);
			
			
			for(int val : scoreArray)
				System.out.println(val);
			

	}

}
