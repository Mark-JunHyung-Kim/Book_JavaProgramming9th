package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.15
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P319 - Nested Class (RealEstateListing)

public class P319_RealEstateListing 
{
	
	private int listingNumber;
	private double price;
	private HouseData houseData;			// ���⼭ ���� �ʵ带 �������⶧����, �ؿ����� �׳� �ڷḸ �Է��ϸ� ��.
	
	public P319_RealEstateListing(int num, double price, String address, int sqft)
	{
		listingNumber = num;
		this.price = price;
		houseData = new HouseData(address, sqft);		// HouseData houseData �ƴ�. HouseData ������.
	}
	
	public void display()
	{
		System.out.println("Listing Number is : " + listingNumber + " with price : " + price);
		System.out.println("Address information is : " + houseData.StreetAddress);
		System.out.println(houseData.squareFeet + " square feet");
		
	}	
		
	private class HouseData
	{
		private String StreetAddress;
		private int squareFeet;
		
		public HouseData(String address, int sqft)
		{
			StreetAddress = address;
			squareFeet = sqft;					
		}
	}

	

}
