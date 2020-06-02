package Chapter_4;
//Date : 2020.06.01
//Name : Mark JunHyung Kim
//Chapter : Book : Chapter#4 (P184-185)
//Subject : More Object Concepts

public class DemoOverload 
{

	public static void main(String[] args) 
	{
		int month = 6, day = 1, year = 2020;
		displayDate(month);
		displayDate(month, day);
		displayDate(month, day, year);
	}
	
	// Following 3 methods are similar examples which I did in the C# mid-term in the last semester.
	public static void displayDate(int mm)
	{
		System.out.println("Event date " + mm + "/25/2018");
	}
	public static void displayDate(int mm, int dd)
	{
		System.out.println("Event date " + mm + "/" + dd + "/2019");
	}
	public static void displayDate(int mm, int dd, int yy)
	{
		System.out.println("Event date " + mm + "/" + dd + "/" + yy);
	}

}
