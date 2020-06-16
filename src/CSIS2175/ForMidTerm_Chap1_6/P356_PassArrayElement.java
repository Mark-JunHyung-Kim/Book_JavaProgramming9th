package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P356 - Pass Array Element

public class P356_PassArrayElement 
{

	public static void main(String[] args) 
	{
		final int NUM_ELEMENT = 4;
		int[] someNums = {5, 10, 15, 20};
		int x;
		
		System.out.print("At the start of main : ");
		for(x = 0; x < NUM_ELEMENT; ++x)
			System.out.print(someNums[x] + " ");
		
		System.out.println();	
		
		for(x = 0; x < NUM_ELEMENT; ++x)		// PassArray(통째) 와 다른점은, 배열의 요소만 메서드를 통과하기때문
			methodGetOneInt(someNums[x]);		// ★★ 배열에 저장되어있는 원본 값들은 변하지 않는다는것!!
												// 하지만 배열을 통째로 메서드에 pass시키면, 배열 내의 값들이 변함! 그게 차이!!
		System.out.println();
		
		System.out.print("At the end of main : ");
		for(x = 0; x < NUM_ELEMENT; ++x)
			System.out.print(someNums[x] + " ");	
		

	}
	public static void methodGetOneInt(int num) 		// parameter가 int로 되어있음!!
	{
		System.out.println("At the start of method : " + num);
		
		num = 8585;								// 여기서 새로운값을 num argument에 대입해도, main내의 본래 값은 변하지 않음!
												// 애시당초 배열이 들어온게 아니고 각 배열의 int값이 들어온거니 바뀔리가..
		
		System.out.println("At the end of method : " + num);
	}

}
