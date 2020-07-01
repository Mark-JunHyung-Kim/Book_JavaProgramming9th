package CSIS2175.L_Chapter_9;
//Date : 2020.06.22
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P017 - Find Rent

import javax.swing.*;
public class P017_FindRend 
{

	public static void main(String[] args) 
	{
		int[][] rents = { {400, 450, 510},				// Floor 0 rents
						  {500, 560, 630},				// Floor 1 rents
						  {625, 676, 740},				// Floor 2 rents
						  {1000, 1250, 1600} };			// Floor 3 rents
		
		System.out.println(rents.length);			// �迭 row�� ����
		System.out.println(rents[1].length);		// �迭[1]row�� column�� ����.
		
		String entry;
		int floor;
		int bedrooms;		// bedroom�� ��쵵, 0��, 1��, 2���� ó����. (1, 2, 3 �ƴ�)
		
		entry = JOptionPane.showInputDialog(null, "Enter a floor number ");		// ��ǲ�ڽ� �����ϴ°�
		
		floor = Integer.parseInt(entry);										// ��ǲ�� Int������ ��ȯ�Ͽ� �޴°� (���ڰ� ������ ������)
		
		entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms ");
		
		bedrooms = Integer.parseInt(entry);
		
		JOptionPane.showMessageDialog
			(null,  "The rent for a " + bedrooms + " bedroom apartment on floor " + floor + " is $ " + rents[floor][bedrooms]);

	}

}