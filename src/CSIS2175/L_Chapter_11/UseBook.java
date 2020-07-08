package CSIS2175.L_Chapter_11;

public class UseBook 
{

	public static void main(String[] args) 
	{
		Fiction myFic = new Fiction("MarkBook");
		NonFiction myNonFic = new NonFiction("My Diary");
		
		System.out.println("The Fiction book : " + myFic.getTitle() + " is $" + myFic.getPrice());
		System.out.println("The Non-Fiction book : " + myNonFic.getTitle() + " is $" + myNonFic.getPrice());

	}

}
