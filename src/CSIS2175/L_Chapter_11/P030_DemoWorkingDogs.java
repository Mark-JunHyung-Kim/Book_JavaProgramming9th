package CSIS2175.L_Chapter_11;

public class P030_DemoWorkingDogs 
{

	public static void main(String[] args) 
	{
		P029_WorkingDog aSheepherder = new P029_WorkingDog();  // �׻� ����Ŭ�������� ������Ʈ ����. 
		aSheepherder.setName("Mark");
		aSheepherder.setHoursOfTraining(40);
		
		System.out.println(aSheepherder.getName() + " says ");
		aSheepherder.speak();
		aSheepherder.work();
		
		
		
		

	}

}
