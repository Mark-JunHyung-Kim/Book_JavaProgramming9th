package CSIS2175.L_Chapter_5;
//Date : 2020.06.06
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~46)
//Subject : More Object Concepts

public class SchoolDemo 
{

	public static void main(String[] args) 
	{
		School mySchool = new School("Audubon Elementary", "3500 Hoyne", 60618, 350);
		// Ŭ���� School���� ������� mySchool�̶�� ������Ʈ��, School Constructor�� �ش� �Ķ���͵��� �Է°����� �ؼ� ���� �Ͽ� �ش� ������ ������ ��.
		
		mySchool.display();
		// ���� mySchool ������Ʈ�� Ŭ���� ���� �ִ� display�޼��带 ���ؼ� ���.
		// display�� �� ����, School Ŭ������ display�޼��� ���� �ϰ�, �� School Ŭ������ display�޼��� ������ NameAndAddress Ŭ������ display ���� �������� (nested�ϰ�) �ݵǴ°� Ȯ���� �� ����.
	

	}

}
