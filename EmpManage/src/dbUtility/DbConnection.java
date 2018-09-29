package dbUtility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	
	/**
	 * Method for creating connection
	 * @return
	 */
	public Connection getConnection1() 
	{
	  Connection con = null;
	  try 
	  {
	  Class.forName("com.mysql.jdbc.Driver");
	  con = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=root");
	  } 
	  catch (Exception e) 
	  {
	  System.out.println("Error in connection" + e);
	  }
	  return con;
	}

}
