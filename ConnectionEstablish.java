import java.sql.*;
import java.util.*;
public class ConnectionEstablish {
	
  // static Connection con=null;
//	 ConnectionEstablish() throws Exception{
//		 con=DBConnection.getConnection();
//		 createSign() ;
//		 createTableCustomer();
//		 createTableStaff();
//	 }
//   public  void getConnection() throws Exception {
//	   
//    	try {
//    		//class.forname();
//    		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
//    		//System.out.print(con);
//    	}
//    	catch(Exception e){
//    		System.out.println("Exception in connection");
//    	}
//    }
   
   void createTableCustomer() throws Exception {
	   Connection con=DBConnection.getConnection();
		  String query="create table if not exists Customer(CustId int primary key AUTO_INCREMENT,firstName varchar(20),EmailAddress varchar(50),phoneNumber varchar(20),Address varchar(30),City varchar(30),password varchar(20))";
		  Statement stmt=(Statement)con.createStatement();
		  boolean res=stmt.execute(query); 
		  
		  if(res)
		   System.out.println("Error");

		 }
   
   void createTableStaff() throws Exception {
	   Connection con=DBConnection.getConnection();
		  String query="create table if not exists Staff(Staffid varchar(20),firstName varchar(20),EmailAddress varchar(50),phoneNumber varchar(25),City varchar(30),Address varchar(30),Domain varchar(20),Experience varchar(20),password varchar(20),Price varchar(20))";
		  Statement stmt=(Statement)con.createStatement();
		  boolean res=stmt.execute(query); 
		  
		  if(res)
		   System.out.println("Error");
		  //else
		 // System.out.println("Table created");
		 }
//   void createTableDomain() throws Exception {
//	   Connection con=DBConnection.getConnection();
//		  String query="create table if not exists StaffDomain(StaffId varchar(20),Name varchar(20),Domain varchar(20),Experience varchar(20),Price varchar(20))";
//		  Statement stmt=(Statement)con.createStatement();
//		  boolean res=stmt.execute(query); 
//		  
//		  if(res)
//		   System.out.println("Error");
//		 // else
//		  //System.out.println("Table created");
//		  
//		 }
   void createTableAppoinment() throws Exception  {
	   Connection con=DBConnection.getConnection();
		  String query="create table if not exists Appoinment(CustomerID int(10),AppoinmentId int primary key AUTO_INCREMENT,StaffId varchar(20),AppoinmentDate varchar(20),Appoinmentime varchar(20))";
		  Statement stmt=(Statement)con.createStatement();
		  boolean res=stmt.execute(query); 
		  
		  if(res)
		   System.out.println("Error");
		  
		 }
   static void InsertStaff(String a,String name,String mail,String mob,String city,String address,String domain,String Exp,String pass,String price) throws Exception{
  	
		 Person ad=new Person();
		 Connection con=DBConnection.getConnection();
	   String query="Insert into Staff values ('"+a+"','"+name+"','"+mail+"','"+mob+"','"+city+"','"+address+"','"+domain+"','"+Exp+"','"+pass+"','"+price+"')";
		Statement stmt=(Statement)con.createStatement();
		int res=stmt.executeUpdate(query);
	   
 }
   static String SelectStaff(String domain)throws Exception   {
	   
	   Connection con=DBConnection.getConnection();
	   String query="select firstName,StaffId,Experience,Price from Staff where Domain='"+domain+"'";
		Statement stmt=(Statement)con.createStatement();
		ResultSet res=stmt.executeQuery(query);
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Do You Want To Add Appoinment y/n");
		String ans=sc.nextLine().toLowerCase();
		String p="";
		if(ans.equals("y")) {
		 p=ans;
		while(res.next()) {
			flag=true;
			System.out.println("\nStaff Name\t:\t"+res.getString(1)+
			         "\nStaff Id\t:\t"+res.getString(2)+
			         "\nExperience\t:\t"+res.getString(3)+
			         "\nPrice\t:\t"+res.getString(4));
	        System.out.println();
			
			p+=" "+res.getString(2);
			//p+=" "+res.getString(2);
			
		}	
		//System.out.println(p);
		if(!flag) {
			System.out.println("NO Service Offered");
		}	
		}
		else {
			System.out.println("Thank You System Exited!!");
			System.exit(0);
		}
		return p;
   }
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionEstablish ef=new ConnectionEstablish();
		//ef.getConnection();
	}

}
