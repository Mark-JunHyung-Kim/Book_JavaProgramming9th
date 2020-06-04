package CSIS2175.L_Chapter_4;
//Date : 2020.05.31
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4
//Subject : Using Methods, Classes, and Objects (아마 이번 챕터는 Book 내용이랑 같은듯)

public class Employee 
{
	
	// This valuables can be used in Employee class only.
	// Data fields (이런 변수들) and methods may be placed in any order within a class.
	private int empNum;		
	private String empLastName;
	private String empFirstName;
	private double empSalary;
	
	public int getEmpNum()
	{
		return empNum;
	}	
	public void setEmpNum(int emp)	// after getting emp value of int data type as input valuable, but there is no return.
	{
		empNum = emp;
	}
	public String getEmpLastName()	// 받은거 없음. 그냥 EmpLastName만 리턴.
	{
		return empLastName;
	}
	public void setEmpLastName(String name)	// 입력을 받아서 저장은 하지만 리턴값은 없음.
	{
		empLastName = name;
	}
	public String getEmpFirstName()	// 받는거 없음. 그냥 empFirstName만 리턴.
	{
		return empFirstName;
	}
	public void setEmpFirstName(String name)	// 입력받은거 해당 변수 (datafield)에 저장
	{
		empFirstName = name;
	}
	public double getEmpSalary()	// empSalary를 리턴. (받은거 없음)
	{
		return empSalary;
	}
	public void setEmpSalary(double sal)	// 더블형 sal 입력 받아서 empSalary에 넣음. 리턴값 없음.
	{
		empSalary = sal;
	}

}
