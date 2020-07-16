package CSIS2175.L_Chapter_11;

public class P029_WorkingDog extends P017_Dog implements P029_Worker 
{
	private int hoursOfTraining;
	public void setHoursOfTraining(int hrs)
	{
		hoursOfTraining = hrs;
	}
	
	public int getHoursOfTraining()
	{
		return hoursOfTraining;
	}
	
	// override work method in Worker interface
	public void work()
	{
		speak();
		System.out.println("I am a dog who works");
		System.out.println("I have " + hoursOfTraining + " hours of professional training!");
	}

}
