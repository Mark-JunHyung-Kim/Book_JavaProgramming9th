package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P358 ~ 360 - PassArray

public class P358_PassArray 
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
		
		methodGetArray(someNums);
		
		System.out.println();
		
		System.out.print("At the end of main : ");
		for(x = 0; x < NUM_ELEMENT; ++x)
			System.out.print(someNums[x] + " ");		

				// �ڡ��߿�!!!!!! �迭�� ��쿡, �޼��带 �ѹ� ���ļ� ������ �������� ����Ÿ�Ե� ���� ���ϰ� ������ �����ִ��� ���� ������ �ٲ��ִ� ����� ����!!
				// �Ϲ� ������ �޼��� �ݰ��� ���, ������ ���������� ���� ���� ������ ������, �迭�� ��쿡�� �ٲ�!!!!!! �����Ұ�!!!!!
		
	}
	public static void methodGetArray(int[] args) 
	{
		int x;

		System.out.print("At the start of method : ");
		for(x = 0; x < args.length; ++x)
			System.out.print(args[x] + " ");
		
		System.out.println();
		
		int y = 8585;
		for(x = 0; x < args.length; ++x)		// �ڡ� ���⼭ argument�� ���� �迭�� �� �Ӹ� �ƴ϶�, ���� �迭�������� �ٲ�� ��!!!! 
			args[x] = y;
		
		System.out.print("At the end of method : ");
		for(x = 0; x < args.length; ++x)
			System.out.print(args[x] + " ");
	}
	

}
