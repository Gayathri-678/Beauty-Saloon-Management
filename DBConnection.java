import java.sql.*;
public class DBConnection {
	static Connection con=null;
     public DBConnection() throws Exception{
    	 //System.out.println("HI");
	 con=DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
     }
     public static Connection getConnection() throws Exception {
    	 if(con==null)
    		 new DBConnection();
    	 return con;
     }
}
