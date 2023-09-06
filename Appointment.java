import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Appointment {
	static Scanner sc=new Scanner(System.in);
	void addAppoinment(String ans) throws Exception{
		//Connection con=null;
		 //con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/saloonManagement","root","Gayu@1410");
		 Connection con=DBConnection.getConnection();
		System.out.println("Enter CustomerId");
		int CustId=sc.nextInt();sc.nextLine();
		System.out.println("Enter Appoinment Date");
		String AppDate=sc.nextLine();
		System.out.println("Enter Appoinment Time");
		String AppTime=sc.nextLine();
		   String query="Insert into Appoinment (CustomerId,StaffId,AppoinmentDate,Appoinmentime)values('"+CustId+"','"+ans+"','"+AppDate+"','"+AppTime+"')";
			Statement stmt=(Statement)con.createStatement();
			//System.out.println("0-0-");
			boolean res=stmt.execute(query);
			
		System.out.println("----------------------------------------------------");
    
		System.out.println("            Thank you For Booking an appoinment");
		System.out.print( "               Your Appoinment Id is  ");
		String querys="select appoinmentId from appoinment where Appoinmentdate='"+AppDate+"' ";
		ResultSet rest=stmt.executeQuery(querys);	
		
		String k="";
		while(rest.next()) {
			k=rest.getString(1);
		}
		System.out.println(k);
    	System.out.println("----------------------------------------------------");
	   
		
	}
 void viewAppoinments(String name)throws Exception {
    	 
    	 Connection con=null;
 		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
 		boolean flag=false;
    	 String query="select * from Appoinment where staffId like '"+name+"'";//where Staffname= '"+name+"'";
			Statement stmt=(Statement)con.createStatement();
			ResultSet res=stmt.executeQuery(query);	
			while(res.next()) {
				flag=true;
				System.out.println("\nCustomer Id\t:\t"+res.getInt(1)+
				           "\nAppointment Id\t:\t"+res.getInt(2)+
				           "\nStaff Id\t:\t"+res.getString(3)+
				           "\nDate\t\t:\t"+res.getString(4)+
				           "\nTime\t\t:\t"+res.getString(5));
		System.out.println();
			}	
			if(!flag) {
			System.out.println("----------------------------------------------------");
				System.out.println("\t\tNo Appointments");
			System.out.println("----------------------------------------------------");
     }
     }
      void appoinmentDetails() throws Exception{
	    Connection con=null;
	 	//System.out.println("Cust_id  apnmt_id  staff_id    date     time");
	 	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
	 	String query="Select * from appoinment;";
	 	Statement stmt=(Statement)con.createStatement();
		ResultSet res=stmt.executeQuery(query);
			while(res.next()) {
				System.out.println("\nCustomer Id\t:\t"+res.getInt(1)+
						           "\nAppointment Id\t:\t"+res.getInt(2)+
						           "\nStaff Id\t:\t"+res.getString(3)+
						           "\nDate\t\t:\t"+res.getString(4)+
						           "\nTime\t\t:\t"+res.getString(5));
				System.out.println();
				
			 }
			 }    
       void delAppoinment()throws Exception {
	 	Connection con=null;
	 	System.out.println("Enter Appoinment Number to be deleted");
	 	int id=sc.nextInt();
	 	//sc.next();
	 	con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
	 	String query="delete from appoinment where appoinmentid='"+id+"'";
	 	Statement stmt=(Statement)con.createStatement();
			int res=stmt.executeUpdate(query);
	     System.out.println("Successfully Deleted");
	     }
 
}
