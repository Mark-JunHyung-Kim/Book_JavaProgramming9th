package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P315 - Name and address - with School class.

public class P315_NameAndAddress 
{
	private String Name;
	private String Address;
	private int ZipCode;
	
	public P315_NameAndAddress(String name, String address, int zipCode)
	{
		Name = name;
		Address = address;
		ZipCode = zipCode;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public int getZipCode()
	{
		return ZipCode;
	}
	
	public void display()
	{
		System.out.println("Name : " + Name);
		System.out.println("Address : " + Address);
		System.out.println("ZipCode : " + ZipCode);
		
	}
	

}
