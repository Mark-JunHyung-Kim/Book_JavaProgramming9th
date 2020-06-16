package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.13
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P141 - Do while Demo

public class P141_DoWhileDemo {

	public static void main(String[] args) 
	{
		
		int count = 1;		
		
		do
		{
			System.out.println("Count is : " + count);
			count ++;			// 이거 안써주면 무한반복!!
			
		}while(count < 5);		// dowhile문에서는 while뒤에 statement가 안들어감. 와일 뒤에 ; 잊지말것. 1~4까지 출력.
		
		

	}
	
	

}
