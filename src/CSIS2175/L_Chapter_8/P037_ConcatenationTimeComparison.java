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
		final int TIMES = 200_000;								// 언더바 '_' 는 숫자 셀때 , 와 같은 천단위 구분기호임.
		final int FACTOR = 1_000_000;
		int x;		
		
		StringBuilder string1 = new StringBuilder("");			// 이건 capacity가 16 character만 가능.
		StringBuilder string2 = new StringBuilder(TIMES * 4);	// StringBuilder string2의 capacity값은 TIMES의 4배! 로 미리 지정해줌.
																// 즉, 사전에 허용범위를 선언해주고 계산하는거나 마찬가지. (capacity = 800,000)
		
		LocalDateTime now;
		
		// 여기서 시작
		now = LocalDateTime.now();		
		startTime = now.getNano();
		
		for(x = 0; x < TIMES; ++x)
		{
			string1.append("Java");			
		}
			
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		// 여기까지 끝. 시간 체크
		
		System.out.println("Time with empty StringBuilder: " + ((endTime - startTime) / FACTOR + " milliseconds"));
		
		
		// 여기서 두번째 비교값 시작
		now = LocalDateTime.now();		
		startTime = now.getNano();
		
		for(x = 0; x < TIMES; ++x)
			string2.append("Java");
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		// 여기까지 끝. 시간 체크
		
		System.out.println("Time with empty StringBuilder: " + ((endTime - startTime) / FACTOR + " milliseconds"));
		
		/* 
		 * 처음 capacity 값이 적을 때, 스트링 길이가 늘어나면 계속 새로운 매모리 위치(크기)를 배정해줘야하므로, 
		 * 처리시간이 스트링 크기 확장 + append로 덧붙임의 2가지 과정으로 진행되기때문에 효율이 나빠짐.
		 * 하지만, 미리 capacity 의 사이즈를 지정해주면, append로 string값 추가만 해주고, 크기에 대한 연산은 할 필요가 없기 때문에 효율이 더 좋아짐.!!
		*/

		
 
		

	}

}
