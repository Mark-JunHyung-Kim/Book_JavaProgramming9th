package CSIS2175.L_Chapter_10;
//Date : 2020.07.05
//Name : Mark JunHyung Kim
//Chapter : Lecture#09 = Chapter#10
//Subject : P033 - A Subclass Cannot Override 'static or final' Methods in Its Superclass

public class P034_ProfessionalBaseballPlayer extends P033_BaseballPlayer 
{
	double salary;

	//@Override;									// Override ����
	
	
	public static void showOrigins()				// Don't do it : A nonstatic method cannot override a static member of a parent class
	{
		
		//super.showOrigins()							// Don't do it : You cannot refer to 'super' in a static method.
		P033_BaseballPlayer.showOrigins();				// Child class can access its parent's nonprivate, static method.
														// �� �׳� ����Ŭ�������� ����Ŭ������ 'non private + static'�޼��带 �����ϴ°���.
														// �� ���� ����Ŭ������ ����Ŭ������ Ư���� ��ӹ��� ���ߴ���, ������ ������!
		
		System.out.println("The first professional " + " major league baseball game was played in 1871");
	}
	
	
	
	/*
	@Override
	public void displayMessage()				// Don't do it : A child class method cannot override a 'final' parent class method.
	{	
		System.out.println("I have nothing to say");
	}
	*/

}
