package CSIS2175.L_Chapter_9;
//Date : 2020.06.25
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P034 - EnumDemo

import java.util.*;
public class P034_EnumDemo 
{
	
	enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};		// 이건 메인메서드 안에다 쓰는게 아님!

	public static void main(String[] args) 
	{
		Month birthMonth;						// A Month type variable is declared.
		
		String userEntry;
		
		int position;
		int comparison;
		
		Scanner input = new Scanner(System.in);
		
		for(Month mon : Month.values())					// 메서드 values() = Returns an array of the enumerated constants(열거된 상수).
			System.out.print(mon + " ");
		
		
		
		System.out.print("\n\n Enter the first three letter of " + "your birth month (ex.FEB) >> ");		
		userEntry = input.nextLine().toUpperCase();		// 유저인풋을 대문자로 변환해서 받음 (문자만)
				
														// 어떤클래스에 쓰는지 알아야함.
		birthMonth = Month.valueOf(userEntry);			// ★ 메서드 valueOf() = Accepts a string parameter and returns an enumeration constant.		
		
		System.out.println("You entered " + birthMonth);
		
		
		
														// 어떤클래스에 쓰는지 알아야함.
		position = birthMonth.ordinal();				// ★ 메서드 ordinal() = Returns an integer that represents the constant's position in the list of constants.
														// 				   as with arrays, the first position is '0'.
		
		System.out.println(birthMonth + " is in position " + position);
		System.out.println("So its month number is " + (position + 1));		// 0번부터 시작하므로.
		
		
		
														// 어떤메서드에 쓰는지 알아야함.
		comparison = birthMonth.compareTo(Month.JUN);	// 메서드 CompareTo() = Returns a negative integer if the calling object's ordinal value is less than that of the argument
														//					 , 0 if they are the same
														//					 , and a positive integer if the calling object's ordinal value is greater than that of the argument.
														// 기준(argument)과 비교해서 같으면 0, ordinal이 작으면 음수, 크면 양수 반환 
							
		if(comparison < 0)
			System.out.println(birthMonth + " is earlier in the year than " + Month.JUN);
		else
			if(comparison > 0)
				System.out.println(birthMonth + " is later in the year than " + Month.JUN);
			else
				System.out.println(birthMonth + " is " + Month.JUN);
		
		
	}

}
