package CSIS2175.L_Chapter_11;

public class P014_AnimalArrayDemo 
{

	public static void main(String[] args) 
	{
		P017_Animal[] myAni = new P017_Animal[2];
		myAni[0] = new P017_Dog();
		myAni[1] = new P017_Cow();
		
		for(int x = 0; x < myAni.length; ++x)
			myAni[x].speak();

	}

}
