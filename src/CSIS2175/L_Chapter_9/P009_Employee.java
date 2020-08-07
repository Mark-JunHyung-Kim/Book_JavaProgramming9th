package CSIS2175.L_Chapter_9;
//Date : 2020.06.19
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P009 - Employee - Demo

// 기말연습용
public class P009_Employee
{
	private int empNum;
	private String lastName;
	private String firstName;
	private double salary;
	
	public P009_Employee(int num, String lName, String fName, double sal)
	{
		empNum = num;
		lastName = lName;
		firstName = fName;
		salary = sal;
	}	
	
	public P009_Employee()
	{
		empNum = 0;
		lastName = "Sample L Name";
		firstName = "Sample F Name";
		salary = 0.00;
	}	
	
	public int getEmpNum()
	{
		return empNum;
	}
	
	public void setEmpNum(int emp)
	{
		empNum = emp;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double sal)
	{
		salary = sal;
	}
	
	public void display()
	{
		System.out.println("Num"+empNum+ ": " + firstName + " " + lastName + " = " + salary);
	}
}

/*
public class P009_Employee 
{
	private int empNum;
	private String lastName;
	private String firstName;	
	private double salary;
	
	public P009_Employee(int num, String lName, String fName, double sal)
	{
		empNum = num;
		lastName = lName;
		firstName = fName;
		salary = sal;
	}	
	
	public P009_Employee()
	{
		empNum = 0;
		lastName = "Sample L Name";
		firstName = "Sample F Name";
		salary = 0.00;
	}	

	
	public int getEmpNum()
	{
		return empNum;
	}
	
	public void setEmpNum(int emp)
	{
		empNum = emp;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String name)
	{
		firstName = name;
	}

	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double sal)
	{
		salary = sal;
	}
	
	public void display()
	{
		System.out.println("Num"+empNum+ ": " + firstName + " " + lastName + " = " + salary);
	}
	

}
*/
