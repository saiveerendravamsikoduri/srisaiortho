package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static  Connection getConnection()
	{
		Connection con = null;
		try 
		{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
			  Class.forName("com.mysql.cj.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
			
		}
		catch(Exception e)
		{
			System.out.println("The Error in the Connection is "+ e);
		}
		return con;
	}
}
