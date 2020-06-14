package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P361 - Returning Array From Method


public class P361_ReturningArrayFromMethod 
{

	public static void main(String[] args) 
	{
		int[] orgScores = {50, 40, 30, 20, 10};
		int x;
		for(x = 0; x < orgScores.length; ++x)
			System.out.print(orgScores[x] + " ");
		
		System.out.println();
		
		orgScores = getArray();		// 메서드 콜로 리턴된 배열값을 이용하는것도 가능.
		
		
		for(x = 0; x < orgScores.length; ++x)
			System.out.print(orgScores[x] + " ");

	}
	
	public static int[] getArray()
	{
		int[] scores = {10, 20, 30, 40, 50};
		return scores;
	}

}
