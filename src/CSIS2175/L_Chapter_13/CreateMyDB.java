package CSIS2175.L_Chapter_13;


import java.sql.*;
public class CreateMyDB 
{

	public static void main(String[] args) 
	{
		final String DB_URL = "jdbc:derby:myDB;create=true";	// ★★ 구조 : protocol : subprotocol : databaseName
																// 여기에 create=true 해주면 해당 db를 만들어 주는것.
																// db는 어디에 저장? => 자동으로 프로젝트에 추가됨. 
		
		try
		{
			Connection conn = DriverManager.getConnection(DB_URL);	// 커넥션 만들어주기. 
			
			//buildTables(conn);		// 메서드를 만들어주고 콜을 해야 실행이 됨.
			
			insertValues(conn);
			
			conn.close();				// 끝날땐 항상 close()
			
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
			
			
			// 일반 sql statement랑 똑같음
			// ★statement.execute는 모든 구문을 수행할 수 있음. (리턴값은 Boolean값) 
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
			Statement stmt2 = conn.createStatement();	// statement 오브젝트 생성.		
			
			// sql에서 insert문 쓰는거랑 같음. statement.executeUpdate는 리턴값이 int타입의 값
			// ★ SELECT 구문을 제외한 다른 구문을 사용할때 사용되는 함수.
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
