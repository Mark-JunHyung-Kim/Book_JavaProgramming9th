package CSIS2175.L_Chapter_10;
//Date : 2020.07.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P043 - A Subclass Cannot Override Methods in a final Superclass (example)

public class DemoCandles 
{

	public static void main(String[] args) 
	{
		
		Candle blueCandle = new Candle();		
		blueCandle.setColor("Blue");
		blueCandle.setHeight(25);		
		
		
		//Candle blueCandle = new Candle("Blue", 25);
		
		blueCandle.display();
		
		System.out.println();
		
		
		
		ScentedCandle redCandle = new ScentedCandle();
		redCandle.setColor("Red");
		redCandle.setHeight(15);		
		redCandle.setScent("Rose");
		
		
		//ScentedCandle redCandle = new ScentedCandle("Red", 15, "Rose");
		
		redCandle.display();

	}

}
