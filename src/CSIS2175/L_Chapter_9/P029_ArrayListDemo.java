package CSIS2175.L_Chapter_9;
//Date : 2020.06.24
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P029 - Array List Demo


import java.util.ArrayList;
public class P029_ArrayListDemo 
{

	public static void main(String[] args) 				// å ������ 448
	{
		ArrayList<String> names = new ArrayList<String>();	// use angle bracket.
		
		names.add("Abigail");						// ArrayList.add("��"); �迭����Ʈ�� �� �߰�
		display(names);
		
		names.add("Brian");
		display(names);
		
		names.add("Zachary");
		display(names);
		
		names.add(2, "Christy");					// �������� �����༭ ����. (������ 2����, ������ 0, 1, 2�̹Ƿ� 3��°�� ��)
		display(names);
		
		names.remove(1);							// ArrayList�� position 1�� ���� (Brian�� ���ŵ�)
		display(names);
		
		names.set(0, "Annette");					// �̰Ŵ� ������ �ִ� position 0�� ���ο� ���� �־�(set)�ִ� ��.
		display(names);
		

	}
	public static void display(ArrayList<String> names)
	{
		System.out.println("\n The size of the list is " + names.size());	// names ArrayList�� ũ�Ⱚ Ȯ��
		for(int x = 0; x < names.size(); ++x)
			System.out.println("position " + x + " Name : " + names.get(x));	// 0���� ũ�Ⱚ���� ����� ���� ���
	}

}
