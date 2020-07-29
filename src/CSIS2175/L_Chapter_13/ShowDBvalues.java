package CSIS2175.L_Chapter_13;

import java.sql.*;
public class ShowDBvalues 
{

	public static void main(String[] args) 
	{
		final String DB_URL = "jdbc:derby:myDB";		// ★★ 구조 : protocol : subprotocol : databaseName
		
		try
		{
			
			Connection conn = DriverManager.getConnection(DB_URL);	// DB 커넥션 만들어주기
						
			Statement stmt = conn.createStatement();			// statement 오브젝트 만들어주기
			
			String showValues = "SELECT * FROM myTable";		// 스트링에 SELECT Statement 저장해줌
			
			ResultSet result = stmt.executeQuery(showValues);	// statement 실행해서 결과'셋'을 result에 저장.
			/*
			while(result.next())
			{
				System.out.print(result.getString("Name") + " ");	  // getString을 통해 ""안의 내용에 해당하는 column의 값을 반환.
				System.out.print(result.getString("Address") + " ");  // getDouble, int등등도 가능한듯.. 
				System.out.println(result.getString("City"));				
			}
			*/
			
			while(result.next())
			{
				System.out.print(result.getString(1));	// getString안에 숫자가 들어가면, 해당 column순번의 값을 리턴.
				System.out.print(result.getString(2));   
				System.out.print(result.getString(3));				
				System.out.print(result.getString(4));
				System.out.print(result.getString(5) + "\t");
				System.out.println(result.getString(6));
			}
			
			conn.close();			// 커넥션 클로즈 잊지말것.
		}
		
		catch(Exception ex)
		{
			System.out.println("Error : " + ex.getMessage());
		}

	}

}
