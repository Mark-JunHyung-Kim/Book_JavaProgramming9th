package CSIS2175.L_Chapter_11;

public abstract class Book 
{
	private String Title;
	double Price;
	
	public Book(String title)
	{
		Title = title;
	}
	
	public String getTitle()
	{
		return Title;
	}
	
	public double getPrice()
	{
		return Price;
	}
	
	public abstract void setPrice();

}
