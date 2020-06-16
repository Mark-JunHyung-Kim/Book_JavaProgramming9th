package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P156 - ++ --

public class P156_PrefixPostfixDemo {

	public static void main(String[] args) 
	{
		int myNumber, answer;
		
		myNumber = 17;
		
		System.out.println("1 : " + myNumber);
		
		answer = ++ myNumber;
		
		System.out.println("2 : " + myNumber);
		System.out.println("3 : " + answer);
		
		myNumber = 17;
		System.out.println("4 : " + myNumber);
		
		answer = myNumber ++;
		System.out.println("5 : " + myNumber);
		System.out.println("6 : " + answer);
		
		
		

	}

}
