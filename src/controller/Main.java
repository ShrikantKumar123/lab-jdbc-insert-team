package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main 

{
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		CityDAO citydao=new CityDAO();
		TeamDAO teamdao=new TeamDAO();
		
		System.out.println("Enter city name");
		String cityName=br.readLine();
		
		System.out.println("Enter city id");
		long id=Long.parseLong(br.readLine());
		
		City city=new City(id,cityName);
		
		System.out.println("Enter your  name");
		String name=br.readLine();
		
		System.out.println("Enter coach name");
		String coachName=br.readLine();
		
		System.out.println("Enter captian name");
		String captianName=br.readLine();
		
		
		Team team=new Team(name,coachName,captianName,city);
		
		teamdao.createTeam(team);
		
		System.out.println(" Enter team name to get deatils of cityname and cityID");
		
		String check=br.readLine();
	city=	citydao.getCityByName(check);
	
	System.out.println("City id = "+city.getCityId());
	System.out.println("city name = "+city.getCityName());
		
	}
	
}

