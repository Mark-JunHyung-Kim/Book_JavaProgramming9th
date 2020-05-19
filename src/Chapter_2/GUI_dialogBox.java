package Chapter_2;
// Date : 2020.05.15
// Name : Mark JunHyung Kim
// Subject : How to make dialogBox (in GUI Output)

import javax.swing.JOptionPane;	// to use JOptionPane class, it should be added.
public class GUI_dialogBox {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "This is Java dialog");
		// the first argument "null" means that the message box should be placed in the center of the screen.
		
		int creditDays = 30;
		JOptionPane.showMessageDialog(null, creditDays);
		JOptionPane.showMessageDialog(null, "Every bill is due in " + creditDays + " days");
		

	}

}
