package CSIS2175.L_Chapter_8;
//Date : 2020.07.03
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P037 - Concatenation Time Comparison


import java.time.*;
public class P037_ConcatenationTimeComparison 
{

	public static void main(String[] args) 
	{
		long startTime, endTime;
		final int TIMES = 200_000;								// ����� '_' �� ���� ���� , �� ���� õ���� ���б�ȣ��.
		final int FACTOR = 1_000_000;
		int x;		
		
		StringBuilder string1 = new StringBuilder("");			// �̰� capacity�� 16 character�� ����.
		StringBuilder string2 = new StringBuilder(TIMES * 4);	// StringBuilder string2�� capacity���� TIMES�� 4��! �� �̸� ��������.
																// ��, ������ �������� �������ְ� ����ϴ°ų� ��������. (capacity = 800,000)
		
		LocalDateTime now;
		
		// ���⼭ ����
		now = LocalDateTime.now();		
		startTime = now.getNano();
		
		for(x = 0; x < TIMES; ++x)
		{
			string1.append("Java");			
		}
			
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		// ������� ��. �ð� üũ
		
		System.out.println("Time with empty StringBuilder: " + ((endTime - startTime) / FACTOR + " milliseconds"));
		
		
		// ���⼭ �ι�° �񱳰� ����
		now = LocalDateTime.now();		
		startTime = now.getNano();
		
		for(x = 0; x < TIMES; ++x)
			string2.append("Java");
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		// ������� ��. �ð� üũ
		
		System.out.println("Time with empty StringBuilder: " + ((endTime - startTime) / FACTOR + " milliseconds"));
		
		/* 
		 * ó�� capacity ���� ���� ��, ��Ʈ�� ���̰� �þ�� ��� ���ο� �Ÿ� ��ġ(ũ��)�� ����������ϹǷ�, 
		 * ó���ð��� ��Ʈ�� ũ�� Ȯ�� + append�� �������� 2���� �������� ����Ǳ⶧���� ȿ���� ������.
		 * ������, �̸� capacity �� ����� �������ָ�, append�� string�� �߰��� ���ְ�, ũ�⿡ ���� ������ �� �ʿ䰡 ���� ������ ȿ���� �� ������.!!
		*/

		
 
		

	}

}
