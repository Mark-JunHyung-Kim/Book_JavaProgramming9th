package Chapter_3;
//Date : 2020.05.20
//Name : Mark JunHyung Kim
//Chapter : #3 (p144~)
//Subject : You Do It (객체 만드는 예제)

public class SpaService
{
	private String serviceDescription;
	private double price;	
	
	public String getServiceDescription()
	{
		return serviceDescription;
	}
	public void setServiceDescription(String service)
	{
		serviceDescription = service;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double servicePrice)
	{
		price = servicePrice;
	}
	
	
	
	public SpaService()
	{
		serviceDescription = "XXX";
		price = 0;
	}
	
	 

}
