package CSIS2175.L_Chapter_11;

public class NonFiction extends Book 
{
	public NonFiction(String title) 
	{
		super(title);
		setPrice();		
	}
	
	@Override	
	public void setPrice()
	{
		super.Price = 37.99;
	}
	

}
