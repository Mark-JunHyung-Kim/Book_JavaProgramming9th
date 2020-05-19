package Chapter_2;
// Date : 2020.05.15
// Name : Mark JunHyung Kim
// Chapter : #2 (p82)
// Subject : Using the JOptionPane Class to Accept GUI Input

	// (Show)InputDialog - Prompts the user for text input
	// ConfirmDialog - Asks the user a question, providing buttons that the user can click for Yes, No, and Cancel responses.


import javax.swing.JOptionPane;
public class JOptionPane_AcceptGUI_Input {

	public static void main(String[] args) {
		
		/*
		String result;
		
		result = JOptionPane.showInputDialog(null, "What is your name? "); // input
		
		JOptionPane.showMessageDialog(null,  "Hello, " + result + "!");  // output
		
		JOptionPane.showInputDialog(null, "Hihihi", "Default value");	
		// 1st arg. = screen component
		// 2nd arg. = object message
		// 3rd arg. = initial value
		
		JOptionPane.showInputDialog(null, "What is your area code?", "Area code information", JOptionPane.QUESTION_MESSAGE);
		// #1 = screen component
		// #2 = object message
		// #3 = the title
		// #4 = a class field discribing the type of dialog box (ERROR, INFORMATION, PLAIN, QUESTION, WARNING + _MESSAGE)
		
		
		// Page 85 : Using dialog box with 'Parse' methods.
		
		String wageString, dependentsString;
		double wage, weeklyPay;
		int dependents;
		final double HOURS_IN_WEEK = 37.5;
		
		wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;	// Double = double class -> it changes wageString to weeklyPay as 'double' data type.
		
		dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
		
		dependents = Integer.parseInt(dependentsString); // Integer = integer class -> it changes dependentsString to dependents as 'integer' data type.
		
		JOptionPane.showMessageDialog(null,  "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
		*/
		
		
		// Page 86 : Using Confirm Dialog Boxes
		
		int selection;
		boolean isYes;
		
		selection = JOptionPane.showConfirmDialog(null,  "Do you want to upgrade to first class?");
		isYes = (selection == JOptionPane.YES_OPTION);	// if user selected 'yes', selection will be same with yes, and it will be also 'True'.
		JOptionPane.showMessageDialog(null,  "You responded " + isYes);
		
		
		  // confirm dialog box's five arguments
		  // = parent component, prompt message, title, integer that indicates which option button will be shown, the kind of dialog box 
		  // ex..
		
		JOptionPane.showConfirmDialog(null,  "A data input error has occurred. Continue?", "Data input error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		
		
		// 88페이지부터 볼것.
		
		
		
		
		
		
		
	}

}
