package CSIS2175.L_Chapter_11;

public class BookArray 
{

	public static void main(String[] args) 
	{
		Book[] someBooks = new Book[10];
		
		someBooks[0] = new Fiction("Fairy tale");
		someBooks[1] = new NonFiction("Mark's Diary");
		someBooks[2] = new Fiction("The Snow White");
		someBooks[3] = new NonFiction("Lucy's Diary");
		someBooks[4] = new Fiction("The Sleeping Princess");
		someBooks[5] = new NonFiction("Haha's Diary");
		someBooks[6] = new Fiction("The Mermaid Princess");
		someBooks[7] = new NonFiction("Your Diary");
		someBooks[8] = new Fiction("The World of Warcraft");
		someBooks[9] = new NonFiction("His Diary");
		
		for(int x = 0; x < someBooks.length; ++x )
			System.out.println(someBooks[x].getTitle() + " is : $" + someBooks[x].getPrice());
		

	}

}
