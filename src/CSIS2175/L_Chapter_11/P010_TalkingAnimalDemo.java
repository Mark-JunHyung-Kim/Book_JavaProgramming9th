package CSIS2175.L_Chapter_11;

public class P010_TalkingAnimalDemo 
{

	public static void main(String[] args) 
	{
		P017_Animal animal = new P017_Dog();
		animal.speak();
		P017_Animal animal2 = new P017_Cow();
		animal2.speak();
		
		P017_Dog dog = new P017_Dog();
		P017_Cow cow = new P017_Cow();
		
		dog.setName("Mark");
		cow.setName("Kim");
		talkingAnimal(dog);
		talkingAnimal(cow);

	}
	
	public static void talkingAnimal(P017_Animal animal)
	{
		System.out.println("Come one. Come all");
		System.out.println("See the amazing talking animal!");
		System.out.println(animal.getName() + " says");
		animal.speak();
		System.out.println("********************");
	}

}
