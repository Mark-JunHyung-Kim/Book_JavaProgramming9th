package CSIS2175.L_Chapter_10;
//Date : 2020.07.06
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P043 - A Subclass Cannot Override Methods in a final Superclass (example)

public class Candle 
{
	
	private String Color;
	int Height;								// if access modifier is private, it won't be changed in subclass
	double Price;	
	
	public Candle()
	{
		Color = "";
		Height = 0;
		Price = 0.00;
	}
	
	/*
	public Candle(String color, int height)
	{
		Color = color;
		Height = height;
		Price = height * 2.00;
	}
	*/
	
	
	// Create get methods for all three fields.
	public String getColor()
	{
		return Color;
	}
	
	public int getHeight()
	{
		return Height;
	}
	
	public double getPrice()
	{
		return Price;
	}
	
	// Create set methods for color and height.
	public void setColor(String color)
	{
		Color = color;
	}
	
	public void setHeight(int height)
	{
		Height = height;
		Price = height * 2.00;
	}
	
	// and create set method only for price (the price = $2 per inch)	
	
	public void display()
	{
		System.out.println("This is the " + Color + "-Colored Candle : " +
						   "\nThe Candle height is : " + Height + " inches " + 
						   "\nThe Candle price is : $" + Price);		
	}
		
	
	
	

}
