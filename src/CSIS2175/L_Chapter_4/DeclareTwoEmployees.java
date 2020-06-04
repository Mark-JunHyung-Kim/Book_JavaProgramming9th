package CSIS2175.L_Chapter_4;
//Date : 2020.05.30
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#4 (~p55)
//Subject : Using Methods, Classes, and Objects (아마 이번 챕터는 Book 내용이랑 같은듯)

public class DeclareTwoEmployees {

	public static void main(String[] args) 
	{
		Employee clerk = new Employee();	// Employee 클래스를 통해 clerk라는 이름의 새 Object를 생성.
		Employee driver = new Employee();	// 마찬가지로 Employee 클래스를 통해 다른 이름의 여러 object를 생성 가능.
		
											// 여기서, 앞에 Employee는 class명이고, 뒤에 Employee()는 메서드콜임!!
											// 한마디로, 뒤에 메서드콜은 default constructor를 호출해서 빈 객체를 만드는것!!
											// The default constructor provides specific initial values to an object's data field.
											// ex) Numeric, character, or boolean(초기값 false) fields. 혹은 Nonprimitive object fields (set to null)
		
		
		 /*		Employee 클래스 내의 setEmpNum() method (참고용)
		 public void setEmpNum(int emp)
		 {
		 	empNum = emp;
		 } 
		 */
		
		clerk.setEmpNum(345);				// '.' (dot)을 이용해 해당 오브젝트의 클래스를 통한 method를 콜(call) 가능.
		driver.setEmpNum(567);
		
		// 여기서 순서는 이렇다고 할 수 있음. set 메서드콜을 통해 해당 인풋값 (345)를 오브젝트의 private data field에 저장 (private로 선언해둔 변수들).
		// 그리고 아래 출력문 메서드 콜 (get 메서드콜)을 통해 해당 private data field에 저장된 value를 return함으로써 불러옴.
		// set을 통해 각 object에 empNum data field에 345나 567을 저장해뒀으므로, 메서드콜을 하게되면 해당 값들을 불러올 수 있음.
		
		/*		Employee 클래스 내의 getEmpNum() method (참고용)
		public int getEmpNum()	
		{
			return empNum;
		}
		*/	
		
		// clerk. 과 driver. 를 구분함으로써, 각각 다른 객체에 저장된 값들을 호출해옴.
		System.out.println("The clerk's number is " + clerk.getEmpNum() + " and the driver's number is " + driver.getEmpNum());
		
		
		// 'set' method = Controls the data values used to set a variable
		// 'get' method = Controls how a value is retrieved. (값을 검색하는 방법을 제어함)
	}

}
