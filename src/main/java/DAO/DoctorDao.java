package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.DoctorModel;
import Utilities.ConnectionUtil;

public class DoctorDao {
	public boolean addDoctor(DoctorModel dm)
	{
		boolean b=false;
		try 
		{
			Connection con=ConnectionUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into doctor values(?,?,?,?,?)");
			ps.setInt(1, dm.getId());
			ps.setString(2, dm.getName());
			ps.setString(3, dm.getQualification());
			ps.setString(4, dm.getPassword());
			ps.setInt(5, dm.getExperience());
			b=ps.execute();
		}
		catch(Exception e)
		{
			System.out.println("The Error in the Docto Dao is "+e);
		}
		return b;
		
	}
}
