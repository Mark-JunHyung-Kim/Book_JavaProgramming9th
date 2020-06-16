package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.15
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P311 - Using the LocalDate class

import java.time.*;
public class P311_LocalDateDemo 
{

	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();					// new ���� ����. ����ð��� �ٷ� now()��.
		LocalDate examDay = LocalDate.of(2020,  06,  16);	// new ���� ����. �����ð��� of(��, ��, ��) ��.
		
		System.out.println("Today is : " + today);
		System.out.println("Mid-term exam day is : " + examDay);		

	}

}
