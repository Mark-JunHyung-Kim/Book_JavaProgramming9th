package CSIS2175.L_Chapter_9;
//Date : 2020.06.25
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P034 - EnumDemo

import java.util.*;
public class P034_EnumDemo 
{
	
	enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};		// �̰� ���θ޼��� �ȿ��� ���°� �ƴ�!

	public static void main(String[] args) 
	{
		Month birthMonth;						// A Month type variable is declared.
		
		String userEntry;
		
		int position;
		int comparison;
		
		Scanner input = new Scanner(System.in);
		
		for(Month mon : Month.values())					// �޼��� values() = Returns an array of the enumerated constants(���ŵ� ���).
			System.out.print(mon + " ");
		
		
		
		System.out.print("\n\n Enter the first three letter of " + "your birth month (ex.FEB) >> ");		
		userEntry = input.nextLine().toUpperCase();		// ������ǲ�� �빮�ڷ� ��ȯ�ؼ� ���� (���ڸ�)
				
														// �Ŭ������ ������ �˾ƾ���.
		birthMonth = Month.valueOf(userEntry);			// �� �޼��� valueOf() = Accepts a string parameter and returns an enumeration constant.		
		
		System.out.println("You entered " + birthMonth);
		
		
		
														// �Ŭ������ ������ �˾ƾ���.
		position = birthMonth.ordinal();				// �� �޼��� ordinal() = Returns an integer that represents the constant's position in the list of constants.
														// 				   as with arrays, the first position is '0'.
		
		System.out.println(birthMonth + " is in position " + position);
		System.out.println("So its month number is " + (position + 1));		// 0������ �����ϹǷ�.
		
		
		
														// ��޼��忡 ������ �˾ƾ���.
		comparison = birthMonth.compareTo(Month.JUN);	// �޼��� CompareTo() = Returns a negative integer if the calling object's ordinal value is less than that of the argument
														//					 , 0 if they are the same
														//					 , and a positive integer if the calling object's ordinal value is greater than that of the argument.
														// ����(argument)�� ���ؼ� ������ 0, ordinal�� ������ ����, ũ�� ��� ��ȯ 
							
		if(comparison < 0)
			System.out.println(birthMonth + " is earlier in the year than " + Month.JUN);
		else
			if(comparison > 0)
				System.out.println(birthMonth + " is later in the year than " + Month.JUN);
			else
				System.out.println(birthMonth + " is " + Month.JUN);
		
		
	}

}
