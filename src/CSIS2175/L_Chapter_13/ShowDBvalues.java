package CSIS2175.L_Chapter_13;

import java.sql.*;
public class ShowDBvalues 
{

	public static void main(String[] args) 
	{
		final String DB_URL = "jdbc:derby:myDB";		// �ڡ� ���� : protocol : subprotocol : databaseName
		
		try
		{
			
			Connection conn = DriverManager.getConnection(DB_URL);	// DB Ŀ�ؼ� ������ֱ�
						
			Statement stmt = conn.createStatement();			// statement ������Ʈ ������ֱ�
			
			String showValues = "SELECT * FROM myTable";		// ��Ʈ���� SELECT Statement ��������
			
			ResultSet result = stmt.executeQuery(showValues);	// statement �����ؼ� ���'��'�� result�� ����.
			/*
			while(result.next())
			{
				System.out.print(result.getString("Name") + " ");	  // getString�� ���� ""���� ���뿡 �ش��ϴ� column�� ���� ��ȯ.
				System.out.print(result.getString("Address") + " ");  // getDouble, int�� �����ѵ�.. 
				System.out.println(result.getString("City"));				
			}
			*/
			
			while(result.next())
			{
				System.out.print(result.getString(1));	// getString�ȿ� ���ڰ� ����, �ش� column������ ���� ����.
				System.out.print(result.getString(2));   
				System.out.print(result.getString(3));				
				System.out.print(result.getString(4));
				System.out.print(result.getString(5) + "\t");
				System.out.println(result.getString(6));
			}
			
			conn.close();			// Ŀ�ؼ� Ŭ���� ��������.
		}
		
		catch(Exception ex)
		{
			System.out.println("Error : " + ex.getMessage());
		}

	}

}
