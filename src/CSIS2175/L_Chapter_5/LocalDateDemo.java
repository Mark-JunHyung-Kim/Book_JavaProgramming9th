package CSIS2175.L_Chapter_5;
//Date : 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~40)
//Subject : More Object Concepts


import java.time.*;	// LocalDate class �� �ð��� ���õ� ��� class package�� �� �߰�.
public class LocalDateDemo 
{

	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();		// new ��� �Ұ�
		LocalDate graduationDate = LocalDate.of(2018,  5,  29);	// new ��� �Ұ�.	
		LocalDate entranceDate = LocalDate.of(2020,  01,  01);	// new�� ��� ���ϴµ� ������ ��¥ ������ �����ϴٴ°���..
																// �޴��� ã�ƺ��� ���� �޼��尡,		
																//	public static LocalDate of(int year, int month, int dayOfMonth); �� �Ǿ�����
		
		
		System.out.println("Today is " + today);
		System.out.println("Graduation is " + graduationDate);
		System.out.println("Graduation is " + entranceDate);
		
	}

}
