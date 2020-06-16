package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.15
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P313 - Using the LocalDate class (Delivery Date)

import java.time.*;
import java.util.*;
public class P313_DeliveryDateDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		
		int mo;
		int day;
		int year;
		
		final int WEEKS_FOR_DELIVERY = 2;
		
		System.out.print("Enter order month >> ");
		mo = input.nextInt();
		
		System.out.print("Enter order day >> ");
		day = input.nextInt();
		
		System.out.print("Enter order year >> ");
		year = input.nextInt();
		
		LocalDate orderDate = LocalDate.of(year,  mo,  day);
		
		System.out.println("The order date info is : " + orderDate);
		
		System.out.println("The delivery date is : " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));
		
		// plusWeeks, plusDays, plusMonths, plusYears 등등 가능함.
	}

}
