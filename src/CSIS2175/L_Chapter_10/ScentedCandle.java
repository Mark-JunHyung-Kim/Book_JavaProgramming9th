package CSIS2175.L_Chapter_10;
//Date : 2020.07.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P043 - A Subclass Cannot Override Methods in a final Superclass (example)

// Create a child class named ScentedCandle that contains an addtional data field named scent 
// and methods to get and set it.

public class ScentedCandle extends Candle 
{
	private String Scent;
	
	public ScentedCandle()
	{
		super();
		this.Scent = "No Scent";
	}
	
	/*																	// ★ 일단 조건상에는 이 컨스트럭터 만들라는말은 없었음. 
	public ScentedCandle(String color, int height, String scent)
	{
		super(color, height);
		this.Scent = scent;
	}
	*/
	
	public String getScent()
	{
		return Scent;
	}
	
	public void setScent(String scent)
	{
		Scent = scent;
	}
	
	
	// In the child class, override the parent's setHeight() method to set the price of a ScentedCandle object at $3 per inch.
	
	@Override										// no semicolon
	
	public void setHeight(int height)
	{
		Height = height;
		Price = height * 3.00;
	}
	
	public void display()
	{
		super.display();		
		System.out.println("The Candle Scent is : " + Scent);
	}

}
