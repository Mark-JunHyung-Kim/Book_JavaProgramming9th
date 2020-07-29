package CSIS2175.L_Chapter_13;


import java.sql.*;
public class CreateMyDB 
{

	public static void main(String[] args) 
	{
		final String DB_URL = "jdbc:derby:myDB;create=true";	// �ڡ� ���� : protocol : subprotocol : databaseName
																// ���⿡ create=true ���ָ� �ش� db�� ����� �ִ°�.
																// db�� ��� ����? => �ڵ����� ������Ʈ�� �߰���. 
		
		try
		{
			Connection conn = DriverManager.getConnection(DB_URL);	// Ŀ�ؼ� ������ֱ�. 
			
			//buildTables(conn);		// �޼��带 ������ְ� ���� �ؾ� ������ ��.
			
			insertValues(conn);
			
			conn.close();				// ������ �׻� close()
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Error : " + ex.getMessage());
		}

	}
	
	public static void buildTables(Connection conn)
	{
		try
		{
			Statement stmt = conn.createStatement();	         
			
			
			// �Ϲ� sql statement�� �Ȱ���
			// ��statement.execute�� ��� ������ ������ �� ����. (���ϰ��� Boolean��) 
			stmt.execute("CREATE TABLE myTable" +
		            "( personNumber CHAR(10) NOT NULL PRIMARY KEY, " +
		            "  Name CHAR(25),"    +
		            "  Address CHAR(25)," +
		            "  City CHAR(12),"    +
		            "  State CHAR(2),"    +
		            "  Zip CHAR(6) )");
			
			System.out.println("myTable is created.");
		}
		
		catch(Exception ex)
		{
			System.out.println("Error : " + ex.getMessage());
		}
	}
	public static void insertValues(Connection conn)
	{
		try
		{
			Statement stmt2 = conn.createStatement();	// statement ������Ʈ ����.		
			
			// sql���� insert�� ���°Ŷ� ����. statement.executeUpdate�� ���ϰ��� intŸ���� ��
			// �� SELECT ������ ������ �ٸ� ������ ����Ҷ� ���Ǵ� �Լ�.
			stmt2.executeUpdate("INSERT INTO myTable VALUES" +
		               "('102', 'mark Gray Kim', '7495 Rosewood St.'," +
		               " 'Burnaby', 'BC', 'V5E6C5')");
			
			stmt2.executeUpdate("INSERT INTO myTable VALUES" +
		               "('103', 'Kim Jun Hyung', '1231 hahaha St.'," +
		               " 'Burnaby', 'BC', 'V5E6C5')");
			
			System.out.println("values are populated");
		}
		
		catch(Exception ex)
		{
			System.out.println("Error : " + ex.getMessage());
		}
		
	}

}
