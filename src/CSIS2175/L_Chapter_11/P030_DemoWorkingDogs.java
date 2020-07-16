package CSIS2175.L_Chapter_11;

public class P030_DemoWorkingDogs 
{

	public static void main(String[] args) 
	{
		P029_WorkingDog aSheepherder = new P029_WorkingDog();  // 항상 서브클래스에서 오브젝트 생성. 
		aSheepherder.setName("Mark");
		aSheepherder.setHoursOfTraining(40);
		
		System.out.println(aSheepherder.getName() + " says ");
		aSheepherder.speak();
		aSheepherder.work();
		
		
		
		

	}

}
