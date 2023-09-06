import java.util.*;
import java.sql.*;
public class Admin extends Person{
	static Scanner sc=new Scanner(System.in);

    void customerDetails() throws Exception {
    	Connection con=null;
    	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
    	String query="Select * from Customer";
    	Statement stmt=(Statement)con.createStatement();
		ResultSet res=stmt.executeQuery(query);	
		boolean flag=false;
		
		while(res.next()) {
			System.out.println("\nCustomer Id\t: \t"+res.getInt(1)+
			           "\nCustomer Name\t: \t"+res.getString(2)+
			           "\nEmail Address\t: \t"+res.getString(3)+
			           "\nPhone Number\t: \t"+res.getString(4)+
			           "\nAddress\t\t: \t"+res.getString(5)+
			           "\nCity\t\t: \t"+res.getString(6)
			           //"\nPassword\t: \t"+res.getString(7)
			           );
	System.out.println();
		}
		}
		
		
		
    void delStaff(String name) throws Exception {
    	Connection con=null;
    	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
    	String query="Delete from staff where firstName like '"+name+"' ";
    	Statement stmt=(Statement)con.createStatement();
		boolean res=stmt.execute(query);
		System.out.println("Record has Successfully Deleted");
    }
    
    void staffDetails()throws Exception {
    	Connection con=null;
    	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
    	String query="Select * from staff ";
    	Statement stmt=(Statement)con.createStatement();
		ResultSet res=stmt.executeQuery(query);
		while(res.next()) {
			System.out.println("\nStaff Id\t: \t"+res.getString(1)+
					           "\nStaff Name\t: \t"+res.getString(2)+
					           "\nEmail Address\t: \t"+res.getString(3)+
					           "\nPhone Number\t: \t"+res.getString(4)+
					           "\nCity\t\t: \t"+res.getString(5)+
					           "\nAddress\t\t: \t"+res.getString(6)+
					           "\nDomain\t\t: \t"+res.getString(7)+
					           "\nExperience\t: \t"+res.getString(8)+
					           //"\nPassword\t: \t"+res.getString(9)+
					           "\nPrice\t\t: \t"+res.getString(10));
			System.out.println();
		}
    }
    
 
 
}
