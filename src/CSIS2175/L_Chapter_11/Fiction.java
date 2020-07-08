package CSIS2175.L_Chapter_11;

public class Fiction extends Book
{
	public Fiction(String title) 
	{
		super(title);
		setPrice();
	}
	
	@Override
	public void setPrice()
	{
		super.Price = 24.99;
	}

}
