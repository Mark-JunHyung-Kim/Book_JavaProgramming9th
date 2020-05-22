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
		
		
		// Declaring Objects and Using Their Methods (page 145)
		UsingMethodsClassesObjects clerk = new UsingMethodsClassesObjects();
		UsingMethodsClassesObjects driver = new UsingMethodsClassesObjects();
		clerk.setEmpNum(345);
		driver.setEmpNum(567);
		System.out.println("The clerk's number is " +
							clerk.getEmpNum() +
							" and the driver's number is " +
							driver.getEmpNum());
		
		// clerk.empNum = 789; this method is not visible!

	}

}
