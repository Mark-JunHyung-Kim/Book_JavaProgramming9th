package CSIS2175.L_Chapter_9;
//Date : 2020.06.20
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P011 - Employee - Demo

import java.lang.reflect.Array;
import java.util.Random;
public class P011_EmployeeDemo 
{

	public static void main(String[] args) 
	{
		
		
		P009_Employee[] someEmps = new P009_Employee[5];
		
		for(int x = 0; x < someEmps.length; ++x)
		{
			someEmps[x] = new P009_Employee(x, "Mark" + x, "Kim" + x, 
					(double) ((int) (new Random().nextDouble() * 100 * 100)) / 100);	// ������ �ִ¹��. ������.
			someEmps[x].display();
		}
		
		someEmps[0].setSalary(52.15);			// �ڡ��߿�!! ��ü Ŭ�������� ������, default constructor�� �ȸ�����ָ�
												// ������ new�� �� ��ü�迭�� �������༭ �޸𸮾�巹���� �����ִٰ� �ص�
												// ���ο� �����Ͱ� ���� ���³� ���������̱⶧����, set�̳� get�� '����'������ ���� ����!!
												// ���� �̷��� set�� ���������� ����ʹٸ� �� default constructor�� ����������.
		
		System.out.println();
		
		bubbleSort(someEmps);
		
		for(int x = 0; x < someEmps.length; ++x)
		{			
			someEmps[x].display();
		}			
	
	}
	/*
	public static void bubbleSort(P009_Employee[] array)
	{
		int a, b;
		P009_Employee temp;
		int highSubscript = array.length - 1;		// �迭�� 5����, (0 and 1���迭), (1 and 2���迭) ... (3 and 4���迭)�����̹Ƿ�
													// length���� 5�� �ݺ��� �ִ븦 �����ع����� (4 and 5���迭-������ 6��°�迭)���� �ؼ� ������.
		
		for(a = 0; a < highSubscript; ++a)			// for ���� �ι� ���� ������, �ܼ� �ѹ� for������ 2���ھ� �񱳸� �ѹ����� �ϰԵǸ�													
		{											// �տ��� �񱳵� ���ڵ�� �ڿ��� �񱳵� ���ڵ��� �񱳰� �ȵ�				
			for (b = 0; b < highSubscript; ++b)		// ������ �迭����ŭ �ѹ��� �� �񱳸� �Ϸ��� �迭��^2����ŭ �ؾߵȴٴ� �Ҹ�. (5 x 5��)
			{
				if(array[b].getSalary() > array[b+1].getSalary())			// ex, a[0] �� 2�̰�, a[1]�� 1�̶�� 2 > 1�� ��.
				{
					temp = array[b];										// �ӽ�array�� 2�� �־��� (a[t] = 2)  
					array[b] = array[b+1];									// array[0]�� 1�� �־��� (1�� 2���� ������ ��)
					array[b+1] = temp;										// array[1]�� �ӽ� array�� �ִ� 2�� �־���
				}															// �ᱹ a[0]�� 1�� �ǰ�, a[1] �� 2�� �Ǽ� �������������� ��.
			}
		}
	} */
	
	public static void bubbleSort(P009_Employee[] arr)					// �̰� ����. 
	{
		int a, b;
		P009_Employee temp;
		int high = arr.length - 1;
		
		for(a = 0; a < high; ++a)
		{
			for(b = 0; b < high; ++b)
			{
				if(arr[b].getSalary() > arr[b+1].getSalary())
				{
					temp = arr[b];
					arr[b] = arr[b+1];
					arr[b+1] = temp;
				}
			}
		}
	}
}
