package CSIS2175.ClassAssignments;

public class Horse 
{
	private String Name;
	private String Color;
	private String BirthYear;
	
	public Horse(String name, String color, String btYear)
	{
		Name = name;
		Color = color;
		BirthYear = btYear;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String name)
	{
		Name = name;
	}
	
	public String getColor() 
	{
		return Color;		
	}
	
	public void setColor(String color)
	{
		Color = color;
	}
	
	public String getBtYear()
	{
		return BirthYear;
	}
	
	public void setBtYear(String btYear)
	{
		BirthYear = btYear;
	}
	
	public void display()
	{		
		System.out.println("Name : " + Name );
		System.out.println("Color : " + Color);
		System.out.println("BirthDay : " + BirthYear);		
	}
	
}
