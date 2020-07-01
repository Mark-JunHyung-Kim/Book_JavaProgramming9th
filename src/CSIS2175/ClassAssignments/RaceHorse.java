package CSIS2175.ClassAssignments;

public class RaceHorse extends Horse
{	
	private int NumRace;
	public RaceHorse(String name, String color, String btYear, int num)
	{
		super(name, color, btYear);
		NumRace = num;
	}
	
	public int getNumRace()
	{
		return NumRace;
	}
	
	public void setNumRace(int num)
	{
		NumRace = num;
	}
	
	@Override
	public void display()
	{
		System.out.println("The information of " + NumRace + " horse is... ");
		super.display();
		System.out.println("Number : " + NumRace);
	}
}
