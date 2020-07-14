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
		
		userCode = entry.charAt(0);				// �����κ��� ���� String��ǲ���� 0��°(�ε���) ���� char������ ��ȯ?
												// ������ 0���� ������!! (������ ��ǲ���� ���ĺ� 1�����̹Ƿ�, 0��° �ε����� �������ָ� ��)
												// ũ��� 0���� (array.length-1)���� �����ѵ�
		
		position = Arrays.binarySearch(codes, userCode);	// binarySearch(type[] a, type key); a�迭 ������ key���� ���° �ִ����� �˻��ؼ� ����
															// ������ 0���� ������!!
		
		if(position >= 0)
			JOptionPane.showMessageDialog(null,  "Position of " + userCode + " is " + position);
		else
			JOptionPane.showMessageDialog(null,  userCode + " is an invalid code");
			
					
					
					
				

	}

}
