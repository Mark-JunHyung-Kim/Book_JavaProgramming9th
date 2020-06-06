package CSIS2175.L_Chapter_5;
//Date : 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~42)
//Subject : More Object Concepts

import java.time.*;				// ��¥������� ���� �� �߰����Ѿ���.
import java.util.Scanner;

public class DeliveryDate	// ��, ��, �� �� �Է¹��� ��, ������ ������ڸ�ŭ (��, Ȥ�� ����) ���ؼ� ���� ����� ����ϱ�. 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		LocalDate orderDate;
		
		int mo;
		int day;
		int year;
		
		final int WEEKS_FOR_DELIVERY = 2;	// ��۱Ⱓ 2�ֶ�� ���� ��,
		final int DAYS_FOR_DELIVERY = 15;	// ��۱Ⱓ 2�ֶ�� ���� ��,
		
		System.out.println("Enter order month ");
		mo = input.nextInt();
		
		System.out.println("Enter order day ");
		day = input.nextInt();
		
		System.out.println("Enter order year ");
		year = input.nextInt();
		
		orderDate = LocalDate.of(year,  mo,  day);
		
		System.out.println("Order date is " + orderDate);
		System.out.println("Delivery date is (plusweek) " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));	// �ش����ڿ� �Ķ���Ͱ���ŭ�� ������ ���ϴ� ���!!
		System.out.println("Delivery date is (plusday) " + orderDate.plusDays(DAYS_FOR_DELIVERY));	// �ش����ڿ� �Ķ���Ͱ���ŭ�� ���ڸ� ���ϴ� ���!!
		
	

	}

}
