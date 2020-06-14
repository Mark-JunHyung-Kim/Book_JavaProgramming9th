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

				// ★★중요!!!!!! 배열의 경우에, 메서드를 한번 거쳐서 나오는 과정에서 리턴타입도 지정 안하고 리턴을 안해주더라도 원래 값들을 바꿔주는 기능이 있음!!
				// 일반 변수의 메서드 콜같은 경우, 리턴을 하지않으면 원래 값이 변하지 않지만, 배열의 경우에는 바뀜!!!!!! 주의할것!!!!!
		
	}
	public static void methodGetArray(int[] args) 
	{
		int x;

		System.out.print("At the start of method : ");
		for(x = 0; x < args.length; ++x)
			System.out.print(args[x] + " ");
		
		System.out.println();
		
		int y = 8585;
		for(x = 0; x < args.length; ++x)		// ★★ 여기서 argument로 들어온 배열의 값 뿐만 아니라, 원래 배열값까지도 바뀌게 됨!!!! 
			args[x] = y;
		
		System.out.print("At the end of method : ");
		for(x = 0; x < args.length; ++x)
			System.out.print(args[x] + " ");
	}
	

}
