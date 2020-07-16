package CSIS2175.L_Chapter_11;
//Date : 2020.07.09
//Name : Mark JunHyung Kim
//Chapter : Lecture#10 = Chapter#11
//Subject : Using the toString() Method

public class P017_DisplayDog 
{

	public static void main(String[] args) 
	{
		P017_Animal myDog;
		
		myDog = new P017_Dog();
		
		
		
		myDog.setName("Mark");
		
		
		String dogString = myDog.toString();		// Even though neither the Animal nor the Dog class contains
													// a toString() method, the Dog object can use it because it inherits from 'Object'.
		
		
		System.out.println(dogString);
		
		myDog.speak();
		
		
		// ¡Ú¡ÚOutput = Classname + @ + Hash Code (a calculated number used to uniquely identify an object).
	}

}
