package Chapter_3;
//Date : 2020.05.20
//Name : Mark JunHyung Kim
//Chapter : #3 (p133~)
//Subject : Using Methods, Classes, and Objects

public class UsingMethodsClassesObjects {	
	
	// nonstatic method means it can return a different value for every object!
	// I can compile it, but cannot execute this class because it does not contain a main() method!!

	private int empNum;	// 주로 unique identifier (primary key) 가 첫번째로 옴!
	private String empLastName;	// 두개가 같이 (연속으로 혹은 한 statement 내에서) 실행되는 경우는 보통 붙여서 씀!
	private String empFirstName; // 두개가 같이 (연속으로 혹은 한 statement 내에서) 실행되는 경우는 보통 붙여서 씀!
	private double empSalary;	
	public int getEmpNum()	// accessor method (get)
	{
		return empNum;
	}
	public void setEmpNum(int emp)	// mutator methods (set)
	{
		empNum = emp;
	}	
	public String getEmpLastName()	// get - set 반복.. auto는 없나
	{
		return empLastName;
	}
	public void setEmpLastName(String name)
	{
		empLastName = name;
	}
	public String getEmpFirstName()
	{
		return empFirstName;
	}
	public void setEmpFirstName(String name)
	{
		empFirstName = name;
	}
	public double getEmpSalary()
	{
		return empSalary;		
	}
	public void setEmpSalary(double sal)
	{
		empSalary = sal;
	}
	
	
	// page 141 부터 이어서 볼것!! (Organizing Classes)
	
	
	 
	
}

