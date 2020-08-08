package CSIS2175.L_Chapter_10;
//Date : 2020.07.04
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P024 - Accessing Superclass Methods

public class P024_TestCustomers 
{

	public static void main(String[] args) 
	{
		
		P022_Customer myCustomer1 = new P022_Customer(123, 456.78);
		
		myCustomer1.display();
		
		P023_PreferredCustomer myCustomer = new P023_PreferredCustomer(123, 456.78, 0.15);
		
		myCustomer.display();
		
		/*
		P022_Customer oneCust = new P022_Customer(124, 123.45);					// 처음 수퍼클래스 객체 생성시에는 args를 두개만
		
		P023_PreferredCustomer onePCust = new P023_PreferredCustomer(125, 3456.78, 0.15);
																				// 서브클래스는 실제로 클래스 내에 private 변수 1개만 존재하지만,
																				// 수퍼클래스의 상속클래스이기때문에 그 특성을 그대로 이어받음.
																				// 따라서, 수퍼클래스에서 필요한 args (int, double)과 서브클래스에서 필요한 double arg까지 3개로 객체 생성.
		
		oneCust.display();														// 수퍼클래스 display method 콜 
		onePCust.display();														// 서브클래스 display method 콜
		*/
	}																			// 서브클래스 display 메서드콜은, 수퍼클래스의 display 메서드콜을 포함하고있기때문에 한번에 모든 값이 다 출력됨.

}
