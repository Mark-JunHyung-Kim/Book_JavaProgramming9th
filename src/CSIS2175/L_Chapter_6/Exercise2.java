package CSIS2175.L_Chapter_6;
//Date : 2020.06.12
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#6 (~p20)
//Subject : Arrays


import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) 
	{
		Scanner inputDevice = new Scanner(System.in);
		
		{
		// Q. Write an applicationthatstoresnineintegersinanarray.Displaytheintegersfromfirsttolast,andthendisplaytheintegersfromlasttofirst.		
		
		int[] nineInt = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
		
		for(int val : nineInt)			// 이거 원리 알아볼것.
			System.out.print(val + " ");
		
		System.out.println();
		
		for(int sub = nineInt.length - 1; sub >= 0; --sub)
			System.out.print(nineInt[sub] + " ");
		}
		
		/*
		{
		// Q. Writeaprogramthatallowsastudenttoenterupto10quizscoresandthencomputesanddisplaystheaverage.Toallowfor10quizscores,youcreateanarraythatcanhold10values.
		
		int[] quizScore = new int[10];
		double totalScore = 0;		// 토탈도 double로 해야 소수점까지 나옴.
		double avgScore = 0;
		
		System.out.println("Please Enter your Score ..");
		
		for(int x = 0; x < quizScore.length; ++ x) 
		{
			System.out.print("Enter your " + (x + 1) + "th score >>");
			quizScore[x] = inputDevice.nextInt();			
		}
		
		for(int x = 0; x < quizScore.length; ++ x)
			totalScore += quizScore[x];
		
		avgScore = totalScore / quizScore.length;
		
		System.out.println("Your Avg Score is : " + avgScore);
		}
		*/
		
		{
			
		
		// ★★★ 중요!! 한듯!!	
		// Q. writeaprogramthatallowsastudenttoenterupto10quizscoresandthencomputesanddisplaystheaverage.Toallowfor10quizscores,youcreateanarraythatcanhold10values,butbecausethestudentmightenterfewerthan10values,youmightuseonlypartofthearray.
			
		int[] quizScore = new int[10];
		int score = 0;
		int count = 0;
		int totalScore = 0;		// 토탈이 int값이라도, 1.0으로 한번 곱해주면 소숫점까지 나옴.
		//double avgScore = 0;	// 굳이 avg변수 만들필요 없음. 
		
		
		final int QUIT = 999;
		final int MAX = 10;
		
		System.out.println("Please Enter your Score ..");
		System.out.print("Enter your " + (count + 1) + "th score or " + QUIT + " want to exit >>");			
		score = inputDevice.nextInt();
		
		while(score != QUIT)
		{
			quizScore[count] = score;			// count 0부터 시작,
			totalScore += quizScore[count];
			++count;							// 4개를 받았으면, quizScore[count: 0-1-2-3]까지 저장되고, count가 4가 된 뒤
												// 다음 아래 if의 else에서 score에 999값을 받고, 이로 인해 while문 탈출.
			
			if(count == MAX)					// count가 10이 되면 score에 QUIT(999)를 넣어서 while문 탈출.
				score = QUIT;					// 실제로 count가 10이면, 11번째 배열값 (0부터 시작이므로)을 입력받는거라 문제가 생기므로, count 9(10번째값)까지만 받음.
												// 하지만 10번째값까지 입력받아도 결국 count는 10으로 끝남 (++count이므로) 
			else
			{
				System.out.print("Enter your " + (count + 1) + "th score or " + QUIT + " want to exit >>");
				score = inputDevice.nextInt();
			}							
		}
		
	
		
		System.out.println("The scores entered were: ");
		
		//for(int val : quizScore)			여기서 for each 쓰면 빈 array값까지 다 나옴..
			//System.out.print(val + " ");	// 이렇게 쓰지말것.
		
		for(int x = 0; x < count; ++x)
			System.out.print(quizScore[x] + " ");
		
		System.out.println();		
		
		if(count != 0)
			System.out.println("Your Avg Score is : " + totalScore * 1.0 / count);		
		else
			System.out.println("No scores were entered!");		// 이건 count0 상태에서 바로 999로 아무것도 안넣었을때!
		
		}
		
			
		
		

	}

}
