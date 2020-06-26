package CSIS2175.L_Chapter_9;
//Date : 2020.06.25
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P036 - EnumDemo2

import java.util.*;
public class P036_EnumDemo2 
{
	enum Property {SINGLE_FAMILY, MULTIPLE_FAMILY, CONDOMINIUM, LAND, BUSINESS};	// 미리 enumerated된 값들을 지정해두고 쓰는용도?

	public static void main(String[] args) 
	{
		Property propForSale = Property.CONDOMINIUM;		// Property 오브젝트에서 사용하는것.
		
		switch(propForSale)		
		{
			case SINGLE_FAMILY:								// case 쓸때는 세미콜론이 아니라 콜론으로
			case MULTIPLE_FAMILY:
				System.out.println("Listing fee is 5%");
				break;
			case CONDOMINIUM:
				System.out.println("Listing fee is 6%");
				break;
			case LAND:
			case BUSINESS:
				System.out.println("We do not handle this type of property");		
		}
		

	}

}
