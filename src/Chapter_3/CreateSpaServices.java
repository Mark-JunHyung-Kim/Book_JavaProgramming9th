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
		
		// �̰� ������ SpaService firstService
		// firstService = new SpaService(); �ε�, �� ������ ���ٷ� ��������.
		SpaService firstService = new SpaService();	// SpaService��� class�� object�� �����ϴ°�. �����Ҷ��� new + constructor.
		SpaService secondService = new SpaService();
		
		
		firstService = getData(firstService);	// ������Ʈ �޼������� �̿��ؼ�, ������ ��ü�� ����� �ű⿡ �����͸� �Է¹޾� ������!!
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
	
	// ���� �ϵ��ڵ��ߴ��Ÿ� Methods, Classes, Objects�� �̿��ϸ� �̷��� �����ϰ� �������� �޾Ƽ� �Ҽ�����.
	// Because, it can save different values in each different object.
	public static SpaService getData(SpaService service)
	{
		String services;
		double price;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter service >> ");
		services = keyboard.nextLine();		// �Է°� �޾Ƽ� ������ �ְ�
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();		// �Է°� �޾Ƽ� ������ �ְ�
		keyboard.nextLine();				// �̰� �ȳ����� �ι�° �Է°� ������ �׳� �Ѿ
		
		service.setServiceDescription(services);	// Using setServiceDescription method in SpaService class object,  
		service.setPrice(price);					// save each data to each object's field.
		return service;								// then, return the 'service' (OBJECT!!) to the main method!
	}
	
		// Page 158���� ����!!

}
