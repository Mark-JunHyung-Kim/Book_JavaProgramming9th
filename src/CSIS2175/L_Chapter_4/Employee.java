package CSIS2175.L_Chapter_4;
//Date : 2020.05.31
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4
//Subject : Using Methods, Classes, and Objects (�Ƹ� �̹� é�ʹ� Book �����̶� ������)

public class Employee 
{
	
	// This valuables can be used in Employee class only.
	// Data fields (�̷� ������) and methods may be placed in any order within a class.
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
	public String getEmpLastName()	// ������ ����. �׳� EmpLastName�� ����.
	{
		return empLastName;
	}
	public void setEmpLastName(String name)	// �Է��� �޾Ƽ� ������ ������ ���ϰ��� ����.
	{
		empLastName = name;
	}
	public String getEmpFirstName()	// �޴°� ����. �׳� empFirstName�� ����.
	{
		return empFirstName;
	}
	public void setEmpFirstName(String name)	// �Է¹����� �ش� ���� (datafield)�� ����
	{
		empFirstName = name;
	}
	public double getEmpSalary()	// empSalary�� ����. (������ ����)
	{
		return empSalary;
	}
	public void setEmpSalary(double sal)	// ������ sal �Է� �޾Ƽ� empSalary�� ����. ���ϰ� ����.
	{
		empSalary = sal;
	}

}
