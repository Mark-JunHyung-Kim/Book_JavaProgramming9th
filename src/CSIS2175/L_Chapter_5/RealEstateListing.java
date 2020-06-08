package CSIS2175.L_Chapter_5;
//Date : 2020.06.07
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (47 ~ 52)
//Subject : More Object Concepts

public class RealEstateListing 
{
	private int listingNumber;
	private double price;
	private HouseData houseData;		// Nested class 'HouseData' 이용, 신규 인스턴스 생성
	
	public RealEstateListing(int num, double price, String address, int sqFt)		// 컨스트럭터
	{
		listingNumber = num;
		this.price = price;
		houseData = new HouseData(address, sqFt);	// Nested class의 컨스트럭터 이용, 해당 인풋값을 houseData object에 넣어줌.
	}
	
	public void display()			// 출력용 메서드 
	{
		System.out.println("Listing number #" + listingNumber + " Selling for $" + price);
		System.out.println("Address: " + houseData.streetAddress);			// houseData는 HouseData Class를 이용한것이므로, 해당 클래스의 메서드를 써야함.
		System.out.println(houseData.squareFeet + " square feet");			// 이렇게 하면 출력시 본 클래스 내에서의 변수를 호출하는게 아니라 Nested클래스의 변수를 호출해서 사용할 수 있음
																			// 장점은.. 좀더 정리해서 사용가능하다는것?..
	}	
	
	private class HouseData			// Nested Class는 보통 private access modifier로 씀.
	{
		private String streetAddress;
		private int squareFeet;
		
		public HouseData(String address, int sqFt)	// Nested class의 컨스트럭터.
		{
			streetAddress = address;
			squareFeet = sqFt;
		}
		
	}

}
