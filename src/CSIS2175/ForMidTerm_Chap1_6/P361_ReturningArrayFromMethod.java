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
		
		orgScores = getArray();		// �޼��� �ݷ� ���ϵ� �迭���� �̿��ϴ°͵� ����.
		
		
		for(x = 0; x < orgScores.length; ++x)
			System.out.print(orgScores[x] + " ");

	}
	
	public static int[] getArray()
	{
		int[] scores = {10, 20, 30, 40, 50};
		return scores;
	}

}
