package CSIS2175.L_Chapter_5;
//Date : 2020.06.05
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (34)
//Subject : More Object Concepts


//import java.lang.Math;	// It can be omitted because it's prewritten class.
//MathŬ������ ���п� ���õ� �⺻���� method���� ����ִ� class��.

// class import �Ҷ� * �ϸ� �ش� Ŭ������ ��� '��Ű��' (package)�� �� import ����
public class PrewrittenConstantsAndMethods 
{

	public static void main(String[] args) 
	{
		int radius = 5;
		
		double areaOfCircle = java.lang.Math.PI * radius * radius;
		//double areaOfCircle = Math.PI * radius * radius;	// MathŬ������ prewritten Ŭ�����̱⶧����, ���� import�����ʾƵ� ��밡��.
		
		System.out.println("Area of circle is = " + areaOfCircle);
		
		
		
		
	

	}

}
