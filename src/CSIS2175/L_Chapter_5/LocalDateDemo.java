package CSIS2175.L_Chapter_5;
//Date : 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~40)
//Subject : More Object Concepts


import java.time.*;	// LocalDate class 외 시간에 관련된 모든 class package를 다 추가.
public class LocalDateDemo 
{

	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();		// new 사용 불가
		LocalDate graduationDate = LocalDate.of(2018,  5,  29);	// new 사용 불가.	
		LocalDate entranceDate = LocalDate.of(2020,  01,  01);	// new를 사용 안하는데 변수에 날짜 대입이 가능하다는것은..
																// 메뉴얼 찾아보니 원래 메서드가,		
																//	public static LocalDate of(int year, int month, int dayOfMonth); 로 되어있음
		
		
		System.out.println("Today is " + today);
		System.out.println("Graduation is " + graduationDate);
		System.out.println("Graduation is " + entranceDate);
		
	}

}
