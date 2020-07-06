package CSIS2175.L_Chapter_10;
//Date : 2020.07.05
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P042 - A Subclass Cannot Override 'final' Methods in Its Superclass

public class P042_HideAndGoSeekPlayer
{
	
	public final class HideAndGoSeekPlayer
	{
		private int count;
		public void displayRules()
		{
			System.out.println("You have to count to " + count + " before you start looking for hiders");
		}
	}
	
	/*
	public final class ProfessionalHideAndGoSeekPlayer extends HideAndGoSeekPlayer		// Don't do it : You cannot exetend a final class!
	{
		private double salary;
	}
	*/	
	
	
	// 페이지 043에 클래스 assignment 왠지 나올거같음. 미리 해둘것.
	
}


