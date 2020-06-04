package CSIS2175.L_Chapter_4;
//Date : 2020.05.30
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4 (~p55)
//Subject : Using Methods, Classes, and Objects (�Ƹ� �̹� é�ʹ� Book �����̶� ������)

public class DeclareTwoEmployees {

	public static void main(String[] args) 
	{
		Employee clerk = new Employee();	// Employee Ŭ������ ���� clerk��� �̸��� �� Object�� ����.
		Employee driver = new Employee();	// ���������� Employee Ŭ������ ���� �ٸ� �̸��� ���� object�� ���� ����.
		
											// ���⼭, �տ� Employee�� class���̰�, �ڿ� Employee()�� �޼�������!!
											// �Ѹ����, �ڿ� �޼������� default constructor�� ȣ���ؼ� �� ��ü�� ����°�!!
											// The default constructor provides specific initial values to an object's data field.
											// ex) Numeric, character, or boolean(�ʱⰪ false) fields. Ȥ�� Nonprimitive object fields (set to null)
		
		
		 /*		Employee Ŭ���� ���� setEmpNum() method (�����)
		 public void setEmpNum(int emp)
		 {
		 	empNum = emp;
		 } 
		 */
		
		clerk.setEmpNum(345);				// '.' (dot)�� �̿��� �ش� ������Ʈ�� Ŭ������ ���� method�� ��(call) ����.
		driver.setEmpNum(567);
		
		// ���⼭ ������ �̷��ٰ� �� �� ����. set �޼������� ���� �ش� ��ǲ�� (345)�� ������Ʈ�� private data field�� ���� (private�� �����ص� ������).
		// �׸��� �Ʒ� ��¹� �޼��� �� (get �޼�����)�� ���� �ش� private data field�� ����� value�� return�����ν� �ҷ���.
		// set�� ���� �� object�� empNum data field�� 345�� 567�� �����ص����Ƿ�, �޼������� �ϰԵǸ� �ش� ������ �ҷ��� �� ����.
		
		/*		Employee Ŭ���� ���� getEmpNum() method (�����)
		public int getEmpNum()	
		{
			return empNum;
		}
		*/	
		
		// clerk. �� driver. �� ���������ν�, ���� �ٸ� ��ü�� ����� ������ ȣ���ؿ�.
		System.out.println("The clerk's number is " + clerk.getEmpNum() + " and the driver's number is " + driver.getEmpNum());
		
		
		// 'set' method = Controls the data values used to set a variable
		// 'get' method = Controls how a value is retrieved. (���� �˻��ϴ� ����� ������)
	}

}
