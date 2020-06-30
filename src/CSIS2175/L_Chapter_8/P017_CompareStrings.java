package CSIS2175.L_Chapter_8;
//Date : 2020.06.29
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P017 - Compare Strings

import java.util.Scanner;
public class P017_CompareStrings 
{

	public static void main(String[] args) 
	{
		String aName = "Carmen";
		String anotherName;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name >>  ");
		anotherName = input.nextLine();
		
		if(aName.equals(anotherName))							// Using the equals() method to compare two strings!
			System.out.println(aName + " equals " + anotherName);
		else
			System.out.println(aName + " does not equal " + anotherName);
		
		if(aName.equalsIgnoreCase(anotherName))					// equalsIgnoreCase() = ��ҹ��� ���о��� ���ϴ°�
			System.out.println(aName + " equals without Case size " + anotherName);
		else
			System.out.println(aName + " does not equal " + anotherName);
		
		
		System.out.println("aName is different as " + aName.compareTo(anotherName));
																// �ڡ�compareTo() = Strings ��, ������ 0 ��ȯ, 
																// arg�� ������Ʈ������ ������ ������ŭ ���� ��ȯ (+���)
																// arg�� ������Ʈ������ ũ�� ū��ŭ ���� ��ȯ (-����)
		

	}

}
