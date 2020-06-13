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
		
		for(int val : nineInt)			// �̰� ���� �˾ƺ���.
			System.out.print(val + " ");
		
		System.out.println();
		
		for(int sub = nineInt.length - 1; sub >= 0; --sub)
			System.out.print(nineInt[sub] + " ");
		}
		
		/*
		{
		// Q. Writeaprogramthatallowsastudenttoenterupto10quizscoresandthencomputesanddisplaystheaverage.Toallowfor10quizscores,youcreateanarraythatcanhold10values.
		
		int[] quizScore = new int[10];
		double totalScore = 0;		// ��Ż�� double�� �ؾ� �Ҽ������� ����.
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
			
		
		// �ڡڡ� �߿�!! �ѵ�!!	
		// Q. writeaprogramthatallowsastudenttoenterupto10quizscoresandthencomputesanddisplaystheaverage.Toallowfor10quizscores,youcreateanarraythatcanhold10values,butbecausethestudentmightenterfewerthan10values,youmightuseonlypartofthearray.
			
		int[] quizScore = new int[10];
		int score = 0;
		int count = 0;
		int totalScore = 0;		// ��Ż�� int���̶�, 1.0���� �ѹ� �����ָ� �Ҽ������� ����.
		//double avgScore = 0;	// ���� avg���� �����ʿ� ����. 
		
		
		final int QUIT = 999;
		final int MAX = 10;
		
		System.out.println("Please Enter your Score ..");
		System.out.print("Enter your " + (count + 1) + "th score or " + QUIT + " want to exit >>");			
		score = inputDevice.nextInt();
		
		while(score != QUIT)
		{
			quizScore[count] = score;			// count 0���� ����,
			totalScore += quizScore[count];
			++count;							// 4���� �޾�����, quizScore[count: 0-1-2-3]���� ����ǰ�, count�� 4�� �� ��
												// ���� �Ʒ� if�� else���� score�� 999���� �ް�, �̷� ���� while�� Ż��.
			
			if(count == MAX)					// count�� 10�� �Ǹ� score�� QUIT(999)�� �־ while�� Ż��.
				score = QUIT;					// ������ count�� 10�̸�, 11��° �迭�� (0���� �����̹Ƿ�)�� �Է¹޴°Ŷ� ������ ����Ƿ�, count 9(10��°��)������ ����.
												// ������ 10��°������ �Է¹޾Ƶ� �ᱹ count�� 10���� ���� (++count�̹Ƿ�) 
			else
			{
				System.out.print("Enter your " + (count + 1) + "th score or " + QUIT + " want to exit >>");
				score = inputDevice.nextInt();
			}							
		}
		
	
		
		System.out.println("The scores entered were: ");
		
		//for(int val : quizScore)			���⼭ for each ���� �� array������ �� ����..
			//System.out.print(val + " ");	// �̷��� ��������.
		
		for(int x = 0; x < count; ++x)
			System.out.print(quizScore[x] + " ");
		
		System.out.println();		
		
		if(count != 0)
			System.out.println("Your Avg Score is : " + totalScore * 1.0 / count);		
		else
			System.out.println("No scores were entered!");		// �̰� count0 ���¿��� �ٷ� 999�� �ƹ��͵� �ȳ־�����!
		
		}
		
			
		
		

	}

}
