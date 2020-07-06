package CSIS2175.L_Chapter_10;
//Date : 2020.07.05
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P033 - A Subclass Cannot Override 'static or final' Methods in Its Superclass

public class P033_BaseballPlayer 
{
	private int jerseyNumber;
	private double battingAvg;
	
	
	public static void showOrigins()
	{
		System.out.println("Abner Doubleday is often " + "credited with inventing baseball");
	}
	
	
	/*
	public final void displayMessage()
	{
		System.out.println("Abner Doubleday is often " + "credited with inventing baseball");
	}
	*/
}

