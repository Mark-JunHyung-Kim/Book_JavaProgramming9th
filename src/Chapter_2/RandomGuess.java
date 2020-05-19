package Chapter_2;
// Date : 2020.05.15
// Name : Mark JunHyung Kim
// Subject : Print random number

import javax.swing.JOptionPane; // automatically generated when I use JOptionPane method without importing.

public class RandomGuess {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random()*100))); 
		// 0.0보다 크거나 같고 1.0 미만이라 *10과 +1을 쓴듯
		// 10 을 100으로 고치면 1부터 100 사이의 숫자가 나오는듯.
		
	}

}
