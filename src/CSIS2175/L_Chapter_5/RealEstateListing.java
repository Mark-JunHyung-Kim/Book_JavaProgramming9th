package CSIS2175.L_Chapter_5;
//Date : 2020.06.07
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (47 ~ 52)
//Subject : More Object Concepts

public class RealEstateListing 
{
	private int listingNumber;
	private double price;
	private HouseData houseData;		// Nested class 'HouseData' �̿�, �ű� �ν��Ͻ� ����
	
	public RealEstateListing(int num, double price, String address, int sqFt)		// ����Ʈ����
	{
		listingNumber = num;
		this.price = price;
		houseData = new HouseData(address, sqFt);	// Nested class�� ����Ʈ���� �̿�, �ش� ��ǲ���� houseData object�� �־���.
	}
	
	public void display()			// ��¿� �޼��� 
	{
		System.out.println("Listing number #" + listingNumber + " Selling for $" + price);
		System.out.println("Address: " + houseData.streetAddress);			// houseData�� HouseData Class�� �̿��Ѱ��̹Ƿ�, �ش� Ŭ������ �޼��带 �����.
		System.out.println(houseData.squareFeet + " square feet");			// �̷��� �ϸ� ��½� �� Ŭ���� �������� ������ ȣ���ϴ°� �ƴ϶� NestedŬ������ ������ ȣ���ؼ� ����� �� ����
																			// ������.. ���� �����ؼ� ��밡���ϴٴ°�?..
	}	
	
	private class HouseData			// Nested Class�� ���� private access modifier�� ��.
	{
		private String streetAddress;
		private int squareFeet;
		
		public HouseData(String address, int sqFt)	// Nested class�� ����Ʈ����.
		{
			streetAddress = address;
			squareFeet = sqFt;
		}
		
	}

}
