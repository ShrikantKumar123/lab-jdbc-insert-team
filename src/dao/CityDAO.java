
package dao;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.City;
import utility.ConnectionManager;

public class CityDAO
{
	public City getCityByName(String name) throws SQLException, ClassNotFoundException, IOException
	{
		Connection con = ConnectionManager.getConnection();
		
		Statement stmt=  con.createStatement();
		
		
		ResultSet rs =stmt.executeQuery("select * from PROKABADDI ");
		
		while(rs.next())
		{
			if(name.equals(rs.getString("NAME")))
			{
			long id=rs.getLong(4);
			System.out.println("name = "+rs.getString(1));
			System.out.println("coach name = "+rs.getString(2));
			System.out.println("Captain name = "+rs.getString(3));
			
			
			
			
			String s=rs.getString(5);
			//sSystem.out.println(s);
			
			City city=new City(id,s);
			
			return city;
			}
		}
		
		
		return null;
		
	}
	
}

