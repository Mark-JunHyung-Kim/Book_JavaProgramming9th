package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.15
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P351 - Calculate Student Quiz Scores


import java.util.*;
public class P341_Exercise_StudentQuizScores 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		/*
		 
		int[] stdScores = new int[9];
		

		// Exercise Q.1 : 

		for(int x = 0; x < stdScores.length; ++x)
		{
			int order = x + 1;
			System.out.print("Please your " + order + " Score : >> ");
			stdScores[x] = input.nextInt();
		}

		for(int x = 0; x < stdScores.length; ++x)
			System.out.print(stdScores[x] + " ");
		
		System.out.println();

		for(int x = stdScores.length - 1; x >= 0; --x)
			System.out.print(stdScores[x] + " ");
		
		System.out.println();

		//--------------------------------------------------------------------------------------

		// Exercise Q.2 :

		int[] stdScores2 = new int[10];
		final int SCORESIZE = 10;
		int totalScore = 0;
		double avgScore = 0;			//		선언은 앞에.

		for(int x = 0; x < SCORESIZE; ++x)
		{
			int order = x + 1;
			System.out.print("Please your " + order + " Score : >> ");
			stdScores2[x] = input.nextInt();
			totalScore += stdScores2[x];
		}
		
		System.out.println();
		avgScore = totalScore / 10.0;			//	계산은 항상 뒤에.

		System.out.println("Your total score is : " + totalScore);
		System.out.println("And Your average score is : " + avgScore);

		//--------------------------------------------------------------------------------------
		
		// Exercise Q.3:	내가짠거

		int[] stdScores3 = new int[10];
		final int SCORESIZE2 = 10;		
		int totalScore2 = 0;
		int scoreNum = 0;
		int quitSign = 0;
		final int QUIT = 999;
		double avgScore2;


		while(scoreNum < SCORESIZE2 && quitSign != QUIT)
		{
			int order = scoreNum + 1;
			int expScore;
			System.out.print("Please your " + order + " Score or " + QUIT + " if you want to quit >>");	
			expScore = input.nextInt();			
			
			if(expScore == QUIT)
				quitSign = expScore;
			else
			{
				stdScores3[scoreNum] = expScore;
				totalScore2 += stdScores3[scoreNum];
				++scoreNum;	
			}
		}
		System.out.println();		
		

		if(scoreNum <= SCORESIZE2 && scoreNum != 0)
		{
			avgScore2 = (double) (totalScore2 / scoreNum);		// if문 안에 안넣으면 오류남!!
			System.out.println("The number of your scores : " + scoreNum + ", and your total score is : " + totalScore2 + ", and your average score is : " + avgScore2);
		}			
		else
			System.out.println("You didn't enter any score..");
			
		*/

		//--------------------------------------------------------------------------------------
		
		// Exercise Q.3:	책에있는거
		
		int[] scores = new int[10];
		int score = 0;
		int count = 0;
		int total = 0;
		
		final int QUIT = 999;
		final int MAX = 10;
		
		System.out.print("Enter quiz score or " + QUIT + " to quit  >>");
		score = input.nextInt();
		
		while(score != QUIT)
		{
			scores[count] = score;
			total += scores[count];
			++count;
			
			if(count == MAX)
				score = QUIT;
			else
			{
				System.out.print("Enter quiz score or " + QUIT + " to quit  >>");
				score = input.nextInt();
			}				
		}
		
		for(int x = 0; x < count; ++x)
			System.out.print(scores[x] + " ");
		
		if(count != 0)
			System.out.println("The number of your scores is " + count + ", and total score is " + total + ", and avg score is : " + (total * 1.0)/count);
		else
			System.out.println("You didn't put any score..");






	}

}
