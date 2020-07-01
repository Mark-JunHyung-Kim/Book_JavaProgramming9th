package CSIS2175.ClassAssignments;

public class DemoHorses 
{

	public static void main(String[] args) 
	{
		Horse firstHorse = new Horse("Mark", "White", "2019");
		
		firstHorse.display();		
		System.out.println();
		
		firstHorse.setBtYear("1985");
		firstHorse.display();		
		System.out.println();
		
		RaceHorse secondHorse = new RaceHorse("BlackSteps", "Black", "2020", 2);
		//P016_ASubClass child = new P016_ASubClass();
		
		secondHorse.display();
		System.out.println();
		
		secondHorse.setNumRace(5);		
		secondHorse.display();

	}

}
