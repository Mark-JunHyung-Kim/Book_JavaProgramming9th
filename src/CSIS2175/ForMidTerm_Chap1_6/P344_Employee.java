package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.14
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P344 ~ P348 - Creating Employee Class

public class P344_Employee 
{
	private /*static*/ int empNum;				// 이게 static이 되면, 여러 오브젝트를 만들어도 같은 메모리location을 사용하기때문에 
	private /*static*/ double empSal;			// 오브젝트를 여러개 만드는 의미가 없음!! (A만들고 B를 다른값으로 만들면 A도 그 값으로 덮어씌워짐!!
	
	/*
	public static int PubSta = 1;
	public int PubNoSta = 2; 
	
	private static int PriSta = 3;
	private int PriNoSta = 4;
	*/
	
	public P344_Employee(int e, double s)			// 클래스 오브젝트 만드는거 다시 외울것.
	{												// 이게 선언이 안되어있으면 this도 못씀!!
		empNum = e;
		empSal = s;		
	}
	
	public P344_Employee(double y)					// 이 this는 다른 버전의 constructor나 마찬가지임!
	{												// 즉, 먼저 1번 컨스트럭터 메서드가 선언이 되어야만 쓸수있음!!
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
