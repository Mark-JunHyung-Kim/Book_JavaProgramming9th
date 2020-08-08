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
		P022_Customer oneCust = new P022_Customer(124, 123.45);					// ó�� ����Ŭ���� ��ü �����ÿ��� args�� �ΰ���
		
		P023_PreferredCustomer onePCust = new P023_PreferredCustomer(125, 3456.78, 0.15);
																				// ����Ŭ������ ������ Ŭ���� ���� private ���� 1���� ����������,
																				// ����Ŭ������ ���Ŭ�����̱⶧���� �� Ư���� �״�� �̾����.
																				// ����, ����Ŭ�������� �ʿ��� args (int, double)�� ����Ŭ�������� �ʿ��� double arg���� 3���� ��ü ����.
		
		oneCust.display();														// ����Ŭ���� display method �� 
		onePCust.display();														// ����Ŭ���� display method ��
		*/
	}																			// ����Ŭ���� display �޼�������, ����Ŭ������ display �޼������� �����ϰ��ֱ⶧���� �ѹ��� ��� ���� �� ��µ�.

}
