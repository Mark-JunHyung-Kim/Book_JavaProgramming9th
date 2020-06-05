package CSIS2175.L_Chapter_5;
//Date : 2020.06.04
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~19)
//Subject : More Object Concepts

	// Overloading Constructors

public class Employee 
{
	private int empNum;	
	
	Employee(int num)	// Parameterized constructor
	{
		empNum = num;		
	}
	
	Employee()		// default constructor
	{
		empNum = 999;		
	}

}

//	For example, If I create an Employee object with the statement,
//	Employee aWorker = new Employee();
//		=> the Employee object receives an initial empNum value of 999.
//				
//	However, when I create an Employee object with,
//	Employee anotherWorker = new Employee(7677);
//		=> the the anotherWorker Employee recieves an initial empNum of 7677.
