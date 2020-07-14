package CSIS2175.L_Chapter_9;
//Date : 2020.06.24
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P026 - Verify Code

import java.util.*;
import javax.swing.JOptionPane;

public class P026_VerifyCode 
{

	public static void main(String[] args) 
	{
		char[] codes = {'B', 'E', 'K', 'M', 'P', 'T'};
		
		String entry;
		char userCode;
		int position;
		
				
		entry = JOptionPane.showInputDialog(null, "Enter a product code");
		
		userCode = entry.charAt(0);				// 유저로부터 받은 String인풋값의 0번째(인덱스) 값을 char형으로 변환?
												// 순서는 0부터 시작함!! (어차피 인풋값은 알파벳 1글자이므로, 0번째 인덱스로 지정해주면 됨)
												// 크기는 0부터 (array.length-1)까지 가능한듯
		
		position = Arrays.binarySearch(codes, userCode);	// binarySearch(type[] a, type key); a배열 내에서 key값이 몇번째 있는지를 검색해서 저장
															// 순서는 0부터 시작함!!
		
		if(position >= 0)
			JOptionPane.showMessageDialog(null,  "Position of " + userCode + " is " + position);
		else
			JOptionPane.showMessageDialog(null,  userCode + " is an invalid code");
			
					
					
					
				

	}

}
