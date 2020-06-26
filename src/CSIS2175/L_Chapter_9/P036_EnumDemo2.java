package CSIS2175.L_Chapter_9;
//Date : 2020.06.25
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P036 - EnumDemo2

import java.util.*;
public class P036_EnumDemo2 
{
	enum Property {SINGLE_FAMILY, MULTIPLE_FAMILY, CONDOMINIUM, LAND, BUSINESS};	// �̸� enumerated�� ������ �����صΰ� ���¿뵵?

	public static void main(String[] args) 
	{
		Property propForSale = Property.CONDOMINIUM;		// Property ������Ʈ���� ����ϴ°�.
		
		switch(propForSale)		
		{
			case SINGLE_FAMILY:								// case ������ �����ݷ��� �ƴ϶� �ݷ�����
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
