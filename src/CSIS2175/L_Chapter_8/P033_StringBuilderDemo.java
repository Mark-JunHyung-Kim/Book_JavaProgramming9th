package CSIS2175.L_Chapter_8;
//Date : 2020.07.03
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P033 - StringBuilder Demo


import javax.swing.JOptionPane;
public class P033_StringBuilderDemo 
{

	public static void main(String[] args) 
	{
		StringBuilder nameString = new StringBuilder("Barbara");		// StringBuilder도 새 변수 선언시 똑같이 new 써서 함.
		
		// ★★ 만약 new StringBuilder(int) 값으로, arg에 int값을 넣어주면, 그건 StringBuilder의 capacity 값을 미리 정해주는것임.
		
		int nameStringCapacity = nameString.capacity();					// capacity() method : finds the capacity of a StringBuilder object.
		
		System.out.println("Capacity of nameString is " + nameStringCapacity);
																		// 기본 버퍼가 16? 16 + 문자열 길이만큼?
		
		StringBuilder addressString = null;
		addressString = new StringBuilder("6311 Hickory Nut Grove Road");
		
		int addStringCapacity = addressString.capacity();
		
		System.out.println("Capacity of addressString is " + addStringCapacity);	// 기본 16 + 27문자 = 43
		
		
		nameString.setLength(20);										// StringBuilder 내의 String의 length를 바꿈.
		System.out.println("The name is " + nameString + "end");		// 문자열 길이가 20개 중, 앞에서부터 Barbara 입력됨.
		
		addressString.setLength(20);
		System.out.println("The address is " + addressString);			// 마찬가지로 address StringBuilder의 길이를 20자로 제한
																		// 결과값은 27글자중 앞에서부터 20글자만 표기됨.
		
		StringBuilder myName = new StringBuilder("Mark");
		System.out.println(myName);
		
		System.out.println(myName.append(" is dead"));					// append() method : Adds characters to the 'end' of a StringBuilder object.
																		// ★★ 주의!! 원래 StringBuilder값에 '추가'시키는거라, 변수값이 새로운값으로 변경됨!
		
		
		System.out.println(myName.insert(5, "Gray "));					// insert() method : Adds characters at a 'specific location' within a StringBuilder object.
		
		
		
		myName.setCharAt(0, 'D');										// setCharAt() method : changes a character at a 'specific position' within a StringBuilder object
		System.out.println(myName);										// 왜인지는 모르겠지만, println으로 바로 출력하는건 불가능. 변환 후 출력.
		
		
		
		System.out.println(myName.charAt(5));							// charAt() method : Accepts an argument that is the offset of the character position from the beginning of a String
																		// 					 Returns the 'character' at that 'position'
																		// 쉽게말해서, arg로 받은 index값에 위치하는 char를 반환함.		

	}

}
