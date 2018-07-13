package health.db;

import java.sql.Connection;
import java.sql.DriverManager;
public class Provider 
{
		public static Connection getConnection() 
		{
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/health","root","susmita");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return con;
		}
	} 

