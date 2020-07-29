package CSIS2175.L_Chapter_13;

import java.sql.*;
public class TestConnection 
{

	public static void main(String[] args) 
	{
		
		final String DB_URL = "jdbc:derby:myDB";
		
		try
		{
			Connection conn = DriverManager.getConnection(DB_URL);
			System.out.println("Connection Created");
			
			conn.close();
			System.out.println("Connection Closed");
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Error: " + ex.getMessage());
		}
		

	}

}
