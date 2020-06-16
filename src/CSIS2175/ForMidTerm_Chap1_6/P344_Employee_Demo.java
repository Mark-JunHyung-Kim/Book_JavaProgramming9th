package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.14
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P344 ~ P348 - Creating Employee Class

public class P344_Employee_Demo 
{

	public static void main(String[] args) 
	{
		
		
		P344_Employee[] emps = new P344_Employee[7];			// Array object 생성하는법 숙지해야함.
		
		String[] deptNames = {"Accounting", "Human Resources", "Sales"};
		
		final int START_NUM = 101;
		
		final double STARTING_SALARY = 15_000;
		
		for(int x = 0; x < emps.length; ++x)
		{
			emps[x] = new P344_Employee(START_NUM + x, STARTING_SALARY);	// Array object안에 틀 만들어서 넣는법 숙지!!
		}
		
		for(int x = 0; x < emps.length; ++x)
		{
			System.out.println(emps[x].getEmpNum() + " " + emps[x].getSalary());
		}
		
		System.out.println("이하는 enhanced loop를 쓸 때, 결과는 같음.");
		
		for(P344_Employee worker : emps)		// for(클래스명 변수이름 : 목표배열객체명)
			System.out.println(worker.getEmpNum() + " " + worker.getSalary());
		
		System.out.println("Presenting Department names..");
		
		for(int x = 0; x < deptNames.length; ++x)
			System.out.println(deptNames[x]);
			
		/*
		
		P344_Employee SampleA = new P344_Employee(100, 105.50);
		
		System.out.println(SampleA.getEmpNum());
		
		int num2 = 200;
		int num3 = 300;
		
		SampleA.setEmpNum(num2);		
		
		System.out.println(SampleA.getEmpNum());
		
		System.out.println(SampleA);
		
		SampleA.setEmpNum(num3);
		
		System.out.println(SampleA);
		
		
		
		P344_Employee SampleB = new P344_Employee(120, 113.30);
		
		System.out.println(SampleA);		// Employee 클래스의 field가 static이면, 같은 메모리location을 공유하기때문에 값이 덮어씌워짐.
		System.out.println(SampleB);
		
		
		
		System.out.println(P344_Employee.PubSta);
		System.out.println(SampleA.PubSta);				// public + static은 클래스명, 오브젝트명 두가지로 다 호출 가능.
		
		
		System.out.println(SampleA.PubNoSta);			// public + Non Static은 오브젝트명으로만 호출 가능.
		
		
		System.out.println(P344_Employee.PriSta);		// private + static은 클래스, 오브젝트명 둘다 호출 불가.
		System.out.println(SampleA.PriSta);
		
		System.out.println(P344_Employee.PriNoSta);		// private + Non static은 클래스, 오브젝트명 둘다 호출 불가.
		System.out.println(SampleA.PriNoSta);			
		*/
	}

}
