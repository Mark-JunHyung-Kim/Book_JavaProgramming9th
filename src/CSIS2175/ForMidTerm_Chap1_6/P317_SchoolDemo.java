package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P317 - School class Demo 

public class P317_SchoolDemo {

	public static void main(String[] args) 
	{
		P316_School mySchool = new P316_School("Hongik Uni.", "Rosewood St.", 450636, 306);
		
		mySchool.display();
		
		P302_Student myStudent = new P302_Student(1, 30.50);
		myStudent.display();

	}

}
