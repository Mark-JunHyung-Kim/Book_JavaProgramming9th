package CSIS2175.L_Chapter_11;
//Date : 2020.07.09
//Name : Mark JunHyung Kim
//Chapter : Lecture#10 = Chapter#11
//Subject : Using the toString() Method

public abstract class P017_Animal 
{
	private String name;
	public abstract void speak();
	public String getName()
	{
		return name;
	}
	
	public void setName(String animalName)
	{
		name = animalName;
	}
}
