package CSIS2175.L_Chapter_5;
//Date : 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~42)
//Subject : More Object Concepts

import java.time.*;				// 날짜계산기능을 위해 꼭 추가시켜야함.
import java.util.Scanner;

public class DeliveryDate	// 년, 월, 일 을 입력받은 후, 고정된 배송일자만큼 (주, 혹은 일자) 더해서 최종 배송일 출력하기. 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		LocalDate orderDate;
		
		int mo;
		int day;
		int year;
		
		final int WEEKS_FOR_DELIVERY = 2;	// 배송기간 2주라고 쳤을 때,
		final int DAYS_FOR_DELIVERY = 15;	// 배송기간 2주라고 쳤을 때,
		
		System.out.println("Enter order month ");
		mo = input.nextInt();
		
		System.out.println("Enter order day ");
		day = input.nextInt();
		
		System.out.println("Enter order year ");
		year = input.nextInt();
		
		orderDate = LocalDate.of(year,  mo,  day);
		
		System.out.println("Order date is " + orderDate);
		System.out.println("Delivery date is (plusweek) " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));	// 해당일자에 파라메터값만큼의 주차를 더하는 기능!!
		System.out.println("Delivery date is (plusday) " + orderDate.plusDays(DAYS_FOR_DELIVERY));	// 해당일자에 파라메터값만큼의 일자를 더하는 기능!!
		
	

	}

}
