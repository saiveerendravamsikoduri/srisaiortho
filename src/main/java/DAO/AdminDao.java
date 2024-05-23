package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utilities.ConnectionUtil;

public class AdminDao {
	public boolean cheakAdminLogin(String username,String password)
	{
		boolean t=false;
		try
		{
			Connection con=ConnectionUtil.getConnection();
	//	System.out.println("This is the con in connection Dao"+con);
			PreparedStatement ps=con.prepareStatement("select * from adminlogin where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				t=true;
			
		}
		catch(Exception e)
		{
			
		}
		return t;
	}
}
