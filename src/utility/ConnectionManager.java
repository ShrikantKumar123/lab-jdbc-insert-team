package utility;
import java.io.IOException;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class ConnectionManager
{
	
	public  static Connection getConnection() throws SQLException, ClassNotFoundException, IOException 
	 {
		
		Properties properties=loadPropertiesFile();
		
		String driver = properties.getProperty("driver");
		String url= properties.getProperty("url");
		String user=properties.getProperty("username");
		String password=properties.getProperty("password");
		//System.out.println(url);
		Class.forName(driver);
	    Connection con;
		con=DriverManager.getConnection(url,user,password);
		 
		 return con;
	 }
	 public static Properties loadPropertiesFile() throws IOException 
	 {
	
		 Properties properties = new Properties();
		 InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		 properties.load(in);
		 in.close();
		 return properties;
		 
	 }
	
}
