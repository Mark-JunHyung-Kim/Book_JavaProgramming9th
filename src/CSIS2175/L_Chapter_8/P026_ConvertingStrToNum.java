package CSIS2175.L_Chapter_8;
//Date : 2020.07.02
//Name : Mark JunHyung Kim
//Chapter : Lecture#08 (After Chapter#9)
//Subject : P026 - Converting String Objects to Numbers

public class P026_ConvertingStrToNum 
{

	public static void main(String[] args) 
	{
		String numStr = "649";
		
		System.out.println(555 + numStr);			// 결과는 555649. 숫자 연산은 이루어지지 않음.
		
		int anInt = Integer.parseInt(numStr);
		
		System.out.println(555 + anInt);			// 결과는 1204. Str이 Int형으로 형변환 된후, 숫자연산이 됨.
		
		double doubleValue = Double.parseDouble("147.82");
		
		System.out.println(123.45 + doubleValue);	// 결과는 271.27 마찬가지로 double형으로 형변환된 후, 숫자연산이 됨.
		
		System.out.println(numStr.valueOf('C'));	// Converts a String to an Integer class object.
		System.out.println(numStr.valueOf('1'));	// Converts a String to an Character class object.
		
		String mixStr = "7495";
		
		System.out.println(Integer.valueOf(mixStr).intValue());	
													// parseInt 는 해당 Str을 Int값 객체로 '변환' 하는거지만,
													// valueOf는 해당 Str '에서' Int값을 '추출' 해서 사용하는것임. (원래 Str 변화없음)
		
		System.out.println(1234 + mixStr);			// 변화없음.
		
		
		

	}

}
