package CSIS2175.L_Chapter_8;
//Date : 2020.07.02
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P026 - Converting String Objects to Numbers

public class P026_ConvertingStrToNum 
{

	public static void main(String[] args) 
	{
		String numStr = "649";
		
		System.out.println(555 + numStr);			// ����� 555649. ���� ������ �̷������ ����.
		
		int anInt = Integer.parseInt(numStr);
		
		System.out.println(555 + anInt);			// ����� 1204. Str�� Int������ ����ȯ ����, ���ڿ����� ��.
		
		double doubleValue = Double.parseDouble("147.82");
		
		System.out.println(123.45 + doubleValue);	// ����� 271.27 ���������� double������ ����ȯ�� ��, ���ڿ����� ��.
		
		System.out.println(numStr.valueOf('C'));	// Converts a String to an Integer class object.
		System.out.println(numStr.valueOf('1'));	// Converts a String to an Character class object.
		
		String mixStr = "7495";
		
		System.out.println(Integer.valueOf(mixStr).intValue());	
													// parseInt �� �ش� Str�� Int�� ��ü�� '��ȯ' �ϴ°�����,
													// valueOf�� �ش� Str '����' Int���� '����' �ؼ� ����ϴ°���. (���� Str ��ȭ����)
		
		System.out.println(1234 + mixStr);			// ��ȭ����.
		
		
		

	}

}
