
package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO
{
	public void createTeam(Team team) throws ClassNotFoundException, SQLException, IOException 
	{
		//System.out.println("Create Team");
		Connection con=ConnectionManager.getConnection();
		if(con!=null)
			System.out.println("Established");
		String sql="INSERt INTO PROKABADDI(name ,coach,captain,cityid,cityname)VALUES(?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		City city=(City) team.getCity();
		
		st.setString(1, team.getName());
		st.setString(2,team.getCoach());
		st.setString(3,team.getCaptain());
		st.setLong(4,city.getCityId());
		st.setString(5, city.getCityName());
		
		st.executeUpdate();
		con.close();
		
		
	}
}
