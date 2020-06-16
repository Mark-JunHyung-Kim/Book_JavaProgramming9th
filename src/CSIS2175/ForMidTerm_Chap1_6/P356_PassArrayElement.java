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
		
		for(x = 0; x < NUM_ELEMENT; ++x)		// PassArray(��°) �� �ٸ�����, �迭�� ��Ҹ� �޼��带 ����ϱ⶧��
			methodGetOneInt(someNums[x]);		// �ڡ� �迭�� ����Ǿ��ִ� ���� ������ ������ �ʴ´ٴ°�!!
												// ������ �迭�� ��°�� �޼��忡 pass��Ű��, �迭 ���� ������ ����! �װ� ����!!
		System.out.println();
		
		System.out.print("At the end of main : ");
		for(x = 0; x < NUM_ELEMENT; ++x)
			System.out.print(someNums[x] + " ");	
		

	}
	public static void methodGetOneInt(int num) 		// parameter�� int�� �Ǿ�����!!
	{
		System.out.println("At the start of method : " + num);
		
		num = 8585;								// ���⼭ ���ο�� num argument�� �����ص�, main���� ���� ���� ������ ����!
												// �ֽô��� �迭�� ���°� �ƴϰ� �� �迭�� int���� ���°Ŵ� �ٲ𸮰�..
		
		System.out.println("At the end of method : " + num);
	}

}
