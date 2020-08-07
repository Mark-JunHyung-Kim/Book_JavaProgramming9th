package CSIS2175.L_Chapter_9;
//Date : 2020.06.24
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P025 - Array Demo (메서드들은 24페이지에)

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
		int[] myScores = new int [5];								// default 값은 0
		display("Original array:                  ", myScores);
		
		Arrays.fill(myScores, 8);									// fill(type[] a, type val); 해당 배열을 val값으로 채움
		display("After filling with 8s:                  ", myScores);
		
		myScores[2] = 6;
		myScores[4] = 3;
		display("After changing two values:                  ", myScores);
		
		Arrays.sort(myScores);										// sort(type[] a); a 배열을 오름차순으로 정렬.
		//Arrays.parallelSort(myScores);								
		display("After sorting:                  ", myScores);
		
				// 책 페이지 440 페이지. 

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
