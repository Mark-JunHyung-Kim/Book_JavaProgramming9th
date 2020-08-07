package CSIS2175.L_Chapter_9;
//Date : 2020.06.24
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P025 - Array Demo (�޼������ 24��������)

import java.util.*;

public class P025_ArrayDemo
{
	
	public static void main(String[] args)
	{
		int[] myScores = new int [5];
		display("Original array:          ", myScores);
		
		Arrays.fill(myScores,  8);
		display("After filling with 8s :          ", myScores);
		
		myScores[2] = 6;
		myScores[4] = 3;		
		display("After changing two values :          ", myScores);
		
		Arrays.parallelSort(myScores);
		display("After sorting :          ", myScores);
		
		
	}
	
	public static void display(String message, int array[])
	{
		int sz = array.length;
		System.out.print(message);
		for(int x = 0; x < sz; ++x)
			System.out.print(array[x] + " ");
		System.out.println();
	}
	
	
/*
	public static void main(String[] args) 
	{
		int[] myScores = new int [5];								// default ���� 0
		display("Original array:                  ", myScores);
		
		Arrays.fill(myScores, 8);									// fill(type[] a, type val); �ش� �迭�� val������ ä��
		display("After filling with 8s:                  ", myScores);
		
		myScores[2] = 6;
		myScores[4] = 3;
		display("After changing two values:                  ", myScores);
		
		Arrays.sort(myScores);										// sort(type[] a); a �迭�� ������������ ����.
		//Arrays.parallelSort(myScores);								
		display("After sorting:                  ", myScores);
		
				// å ������ 440 ������. 

	}
	public static void display(String message, int array[])
	{
		int sz = array.length;
		System.out.print(message);;
		for(int x = 0; x < sz; ++x)
			System.out.print(array[x] + " ");
		System.out.println();
	}
*/
}
