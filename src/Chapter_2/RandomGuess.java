package Chapter_2;
// Date : 2020.05.15
// Name : Mark JunHyung Kim
// Subject : Print random number

import javax.swing.JOptionPane; // automatically generated when I use JOptionPane method without importing.

public class RandomGuess {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random()*100))); 
		// 0.0���� ũ�ų� ���� 1.0 �̸��̶� *10�� +1�� ����
		// 10 �� 100���� ��ġ�� 1���� 100 ������ ���ڰ� �����µ�.
		
	}

}
