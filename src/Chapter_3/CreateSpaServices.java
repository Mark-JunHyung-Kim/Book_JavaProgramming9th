package Chapter_3;
//Date : 2020.05.21
//Name : Mark JunHyung Kim
//Chapter : #3 (p148) You do it
//Subject : Declaring and Using Objects

import java.util.Scanner;

public class CreateSpaServices {

	public static void main(String[] args)
	{
//		String service;
//		double price;
		
		// 이게 원래는 SpaService firstService
		// firstService = new SpaService(); 인데, 이 두줄이 한줄로 합쳐진것.
		SpaService firstService = new SpaService();	// SpaService라는 class에 object를 생성하는것. 생성할때는 new + constructor.
		SpaService secondService = new SpaService();
		
		
		firstService = getData(firstService);	// 오브젝트 메서드콜을 이용해서, 각각의 객체를 만들고 거기에 데이터를 입력받아 저장함!!
		secondService = getData(secondService);		
		
//		System.out.print("Enter service >> ");
//		service = keyboard.nextLine();
//		System.out.print("Enter price >> ");
//		price = keyboard.nextDouble();		
//		firstService.setServiceDescription(service);
//		firstService.setPrice(price);		
		
//		keyboard.nextLine();	Ctrl + / = block comment
//		
//		System.out.print("Enter service >> ");
//		service = keyboard.nextLine();
//		System.out.print("Enter price >> ");
//		price = keyboard.nextDouble();
//		secondService.setServiceDescription(service);
//		secondService.setPrice(price);
		
		System.out.println("First service details: ");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());		
		
		
		// It can work, even though any values wasn't entered because there is default constructor in object class!
		System.out.println("Second service details: ");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
	}
	
	// 위에 하드코딩했던거를 Methods, Classes, Objects를 이용하면 이렇게 간단하게 여러개도 받아서 할수있음.
	// Because, it can save different values in each different object.
	public static SpaService getData(SpaService service)
	{
		String services;
		double price;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service >> ");
		services = keyboard.nextLine();		// 입력값 받아서 변수에 넣고
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();		// 입력값 받아서 변수에 넣고
		keyboard.nextLine();				// 이거 안넣으면 두번째 입력값 받을때 그냥 넘어감
		
		service.setServiceDescription(services);	// Using setServiceDescription method in SpaService class object,  
		service.setPrice(price);					// save each data to each object's field.
		return service;								// then, return the 'service' (OBJECT!!) to the main method!
	}
	
		// Page 158부터 볼것!!

}
