package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.14
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P344 ~ P348 - Creating Employee Class

public class P344_Employee 
{
	private /*static*/ int empNum;				// �̰� static�� �Ǹ�, ���� ������Ʈ�� ���� ���� �޸�location�� ����ϱ⶧���� 
	private /*static*/ double empSal;			// ������Ʈ�� ������ ����� �ǹ̰� ����!! (A����� B�� �ٸ������� ����� A�� �� ������ �������!!
	
	/*
	public static int PubSta = 1;
	public int PubNoSta = 2; 
	
	private static int PriSta = 3;
	private int PriNoSta = 4;
	*/
	
	public P344_Employee(int e, double s)			// Ŭ���� ������Ʈ ����°� �ٽ� �ܿ��.
	{												// �̰� ������ �ȵǾ������� this�� ����!!
		empNum = e;
		empSal = s;		
	}
	
	public P344_Employee(double y)					// �� this�� �ٸ� ������ constructor�� ����������!
	{												// ��, ���� 1�� ����Ʈ���� �޼��尡 ������ �Ǿ�߸� ��������!!
		this(0, y);	
	}
	
	
	public int getEmpNum()
	{
		return empNum;
		
	}	
	
	public double getSalary()
	{
		return empSal;
	}
	
	
	public void setEmpNum(int value)
	{
		empNum = value;		
	}
	
	public String toString()
	{
		String resultValue = empNum + " " + empSal;
		return resultValue;
	}
	

}
