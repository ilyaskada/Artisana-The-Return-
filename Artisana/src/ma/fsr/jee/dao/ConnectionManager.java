package ma.fsr.jee.dao;
import java.sql.*;

public class ConnectionManager {
	static Connection conn;
	 
    public static Connection getConnection()
    {
        try
        {
            String url = "jdbc:mysql://localhost/";
            String dbName ="artisana"; // le nom de la base de connées ^^
            String uname = "root";
            String pwd = "";
 
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
                conn = DriverManager.getConnection(url+dbName,uname,pwd);
            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return conn;
    }
}
