package CSIS2175.L_Chapter_9;
//Date : 2020.06.20
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P011 - Employee - Demo

import java.lang.reflect.Array;
import java.util.Random;
public class P011_EmployeeDemo 
{

	public static void main(String[] args) 
	{
		
		
		P009_Employee[] someEmps = new P009_Employee[5];
		
		for(int x = 0; x < someEmps.length; ++x)
		{
			someEmps[x] = new P009_Employee(x, "Mark" + x, "Kim" + x, 
					(double) ((int) (new Random().nextDouble() * 100 * 100)) / 100);	// 랜덤값 넣는방법. 유용함.
			someEmps[x].display();
		}
		
		someEmps[0].setSalary(52.15);			// ★★중요!! 객체 클래스파일 내에서, default constructor를 안만들어주면
												// 위에서 new로 새 객체배열을 생성해줘서 메모리어드레스가 잡혀있다고 해도
												// 내부에 데이터가 없는 상태나 마찬가지이기때문에, set이나 get을 '직접'적으로 쓸수 없음!!
												// 만약 이렇게 set을 직접적으로 쓰고싶다면 꼭 default constructor를 만들어줘야함.
		
		System.out.println();
		
		bubbleSort(someEmps);
		
		for(int x = 0; x < someEmps.length; ++x)
		{			
			someEmps[x].display();
		}			
	
	}
	/*
	public static void bubbleSort(P009_Employee[] array)
	{
		int a, b;
		P009_Employee temp;
		int highSubscript = array.length - 1;		// 배열이 5개면, (0 and 1번배열), (1 and 2번배열) ... (3 and 4번배열)까지이므로
													// length값인 5로 반복문 최대를 지정해버리면 (4 and 5번배열-실제론 6번째배열)까지 해서 오류남.
		
		for(a = 0; a < highSubscript; ++a)			// for 문을 두번 쓰는 이유는, 단순 한번 for문으로 2글자씩 비교를 한번씩만 하게되면													
		{											// 앞에서 비교된 숫자들과 뒤에서 비교된 숫자들은 비교가 안됨				
			for (b = 0; b < highSubscript; ++b)		// 실제로 배열값만큼 한번씩 다 비교를 하려면 배열값^2번만큼 해야된다는 소리. (5 x 5번)
			{
				if(array[b].getSalary() > array[b+1].getSalary())			// ex, a[0] 이 2이고, a[1]이 1이라면 2 > 1는 참.
				{
					temp = array[b];										// 임시array에 2을 넣어줌 (a[t] = 2)  
					array[b] = array[b+1];									// array[0]에 1을 넣어줌 (1이 2보다 앞으로 감)
					array[b+1] = temp;										// array[1]에 임시 array에 있던 2를 넣어줌
				}															// 결국 a[0]은 1이 되고, a[1] 은 2가 되서 오름차순정렬이 됨.
			}
		}
	} */
	
	public static void bubbleSort(P009_Employee[] arr)					// 이건 연습. 
	{
		int a, b;
		P009_Employee temp;
		int high = arr.length - 1;
		
		for(a = 0; a < high; ++a)
		{
			for(b = 0; b < high; ++b)
			{
				if(arr[b].getSalary() > arr[b+1].getSalary())
				{
					temp = arr[b];
					arr[b] = arr[b+1];
					arr[b+1] = temp;
				}
			}
		}
	}
}
