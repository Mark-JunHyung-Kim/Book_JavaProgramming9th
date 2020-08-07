package CSIS2175.L_Chapter_9;
//Date : 2020.06.22
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P017 - Find Rent

import javax.swing.*;
import java.util.*;
public class P017_FindRend 
{

	public static void main(String[] args) 
	{		
		int[][] rents = { {400, 450, 510},				// Floor 0 rents
						  {500, 560, 630},				// Floor 1 rents
						  {625, 676, 740},				// Floor 2 rents
						  {1000, 1250, 1600} };			// Floor 3 rents
		
		System.out.println(rents.length);			// 배열 row의 길이
		System.out.println(rents[0].length);		// 배열[1]row의 column의 길이.
		
		String entry;
		int floor;
		int bedrooms;		// bedroom의 경우도, 0개, 1개, 2개로 처리됨. (1, 2, 3 아님)
		
		entry = JOptionPane.showInputDialog(null, "Enter a floor number ");		// 인풋박스 생성하는것
		
		floor = Integer.parseInt(entry);										// 인풋값 Int값으로 변환하여 받는것 (문자값 넣으면 오류남)
		
		entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms ");
		
		bedrooms = Integer.parseInt(entry);
		
		JOptionPane.showMessageDialog
			(null,  "The rent for a " + bedrooms + " bedroom apartment on floor " + floor + " is $ " + rents[floor][bedrooms]);
		
		
		int[][] jaggedArray = new int[2][];			// 각각 다른 배열수를 가진 two-demensional array 만들기.
		
		jaggedArray[0] = new int[10];
		jaggedArray[1] = new int[5];
		
		for(int i = 0; i < jaggedArray[0].length; ++i)
			System.out.print(jaggedArray[0][i] + " ");
		
		System.out.println();
		
		for(int i = 0; i < jaggedArray[1].length; ++i)
			System.out.print(jaggedArray[1][i] + " ");
		

	}

}
