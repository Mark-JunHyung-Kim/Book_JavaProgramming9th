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
		StringBuilder nameString = new StringBuilder("Barbara");		// StringBuilder�� �� ���� ����� �Ȱ��� new �Ἥ ��.
		
		// �ڡ� ���� new StringBuilder(int) ������, arg�� int���� �־��ָ�, �װ� StringBuilder�� capacity ���� �̸� �����ִ°���.
		
		int nameStringCapacity = nameString.capacity();					// capacity() method : finds the capacity of a StringBuilder object.
		
		System.out.println("Capacity of nameString is " + nameStringCapacity);
																		// �⺻ ���۰� 16? 16 + ���ڿ� ���̸�ŭ?
		
		StringBuilder addressString = null;
		addressString = new StringBuilder("6311 Hickory Nut Grove Road");
		
		int addStringCapacity = addressString.capacity();
		
		System.out.println("Capacity of addressString is " + addStringCapacity);	// �⺻ 16 + 27���� = 43
		
		
		nameString.setLength(20);										// StringBuilder ���� String�� length�� �ٲ�.
		System.out.println("The name is " + nameString + "end");		// ���ڿ� ���̰� 20�� ��, �տ������� Barbara �Էµ�.
		
		addressString.setLength(20);
		System.out.println("The address is " + addressString);			// ���������� address StringBuilder�� ���̸� 20�ڷ� ����
																		// ������� 27������ �տ������� 20���ڸ� ǥ���.
		
		StringBuilder myName = new StringBuilder("Mark");
		System.out.println(myName);
		
		System.out.println(myName.append(" is dead"));					// append() method : Adds characters to the 'end' of a StringBuilder object.
																		// �ڡ� ����!! ���� StringBuilder���� '�߰�'��Ű�°Ŷ�, �������� ���ο���� �����!
		
		
		System.out.println(myName.insert(5, "Gray "));					// insert() method : Adds characters at a 'specific location' within a StringBuilder object.
		
		
		
		myName.setCharAt(0, 'D');										// setCharAt() method : changes a character at a 'specific position' within a StringBuilder object
		System.out.println(myName);										// �������� �𸣰�����, println���� �ٷ� ����ϴ°� �Ұ���. ��ȯ �� ���.
		
		
		
		System.out.println(myName.charAt(5));							// charAt() method : Accepts an argument that is the offset of the character position from the beginning of a String
																		// 					 Returns the 'character' at that 'position'
																		// ���Ը��ؼ�, arg�� ���� index���� ��ġ�ϴ� char�� ��ȯ��.		

	}

}
