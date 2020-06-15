package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.14
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P344 ~ P348 - Creating Employee Class

public class P344_Employee_Demo 
{

	public static void main(String[] args) 
	{
		P344_Employee[] emps = new P344_Employee[7];			// Array object �����ϴ¹� �����ؾ���.
		
		String[] deptNames = {"Accounting", "Human Resources", "Sales"};
		
		final int START_NUM = 101;
		
		final double STARTING_SALARY = 15_000;
		
		for(int x = 0; x < emps.length; ++x)
		{
			emps[x] = new P344_Employee(START_NUM + x, STARTING_SALARY);	// Array object�ȿ� Ʋ ���� �ִ¹� ����!!
		}
		
		for(int x = 0; x < emps.length; ++x)
		{
			System.out.println(emps[x].getEmpNum() + " " + emps[x].getSalary());
		}
		
		System.out.println("���ϴ� enhanced loop�� �� ��, ����� ����.");
		
		for(P344_Employee worker : emps)		// for(Ŭ������ �����̸� : ��ǥ�迭��ü��)
			System.out.println(worker.getEmpNum() + " " + worker.getSalary());
		
		System.out.println("Presenting Department names..");
		
		for(int x = 0; x < deptNames.length; ++x)
			System.out.println(deptNames[x]);
			

	}

}
