package CSIS2175.L_Chapter_6;
//Date : 2020.06.09
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#6 (~8)
//Subject : Arrays

public class DeclaringArrays {

	public static void main(String[] args) 
	{
		double[] moneyValues = new double[10];	// declaring double type array with literal integer constant.
		
		
		final int NUMBER_ELS = 10;
		double[] moneyValues2 = new double[NUMBER_ELS];		// declaring double type array with a named integer constant. 
		
		
		int numberOfEls = 10;
		double[] moneyValues3 = new double[numberOfEls];	// declaring double type array with an integer variable.
		
		int x = 2, y = 3, z = 4;
		double[] moneyValues4 = new double[x + y * z];		// declaring double type array with a calculation.
		
		
		double[] moneyValues5 = new double[getElements()];	// declaring double type array with a method's return value.
		
		
		
	}
	
	public static int getElements()
	{
		int a = 10;
		return a;
	}

}
