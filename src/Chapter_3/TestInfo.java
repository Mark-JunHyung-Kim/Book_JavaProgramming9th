package Chapter_3;
// Date : 2020.05.18
// Name : Mark JunHyung Kim
// Chapter : #3 (p102~)
// Subject : Understanding Method Calls and Placement


public class TestInfo {

	public static void main(String[] args) {
		
		System.out.println("Calling method from another class: ");
		UnderstandingMethodCallsAndPlacement.displayInfo();
		
		// Calling a static Method from Another Class
		// => have to use 'full' name. (classname.method name)
		
		UnderstandingMethodCallsAndPlacement.displayAddress();
		
		// it should be in the same directory.

	}

}
