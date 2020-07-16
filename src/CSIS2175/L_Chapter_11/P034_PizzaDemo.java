package CSIS2175.L_Chapter_11;

public class P034_PizzaDemo implements P034_PizzaConstants 
{

	public static void main(String[] args) 
	{
		double specialPrice = 11.25;
		System.out.println("Welcome to " + COMPANY);
		System.out.println("We are having a special offer:\na " + SMALL_DIAMETER +
				           " inch pizza with four toppings\nor a " + LARGE_DIAMETER + " inch pizza with one topping\n for only $" + specialPrice);
		System.out.println("With tax, that is only $" + (specialPrice + specialPrice * TAX_RATE));

	}

}
