package Chapter_3;
//Date : 2020.05.20
//Name : Mark JunHyung Kim
//Chapter : #3 (p133~)
//Subject : Using Methods, Classes, and Objects

public class UsingMethodsClassesObjects {	
	
	// nonstatic method means it can return a different value for every object!
	// I can compile it, but cannot execute this class because it does not contain a main() method!!

	private int empNum;	// �ַ� unique identifier (primary key) �� ù��°�� ��!
	private String empLastName;	// �ΰ��� ���� (�������� Ȥ�� �� statement ������) ����Ǵ� ���� ���� �ٿ��� ��!
	private String empFirstName; // �ΰ��� ���� (�������� Ȥ�� �� statement ������) ����Ǵ� ���� ���� �ٿ��� ��!
	private double empSalary;	
	public int getEmpNum()	// accessor method (get)
	{
		return empNum;
	}
	public void setEmpNum(int emp)	// mutator methods (set)
	{
		empNum = emp;
	}	
	public String getEmpLastName()	// get - set �ݺ�.. auto�� ����
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
	
	
	// page 141 ���� �̾ ����!! (Organizing Classes)
	
	
	 
	
}

