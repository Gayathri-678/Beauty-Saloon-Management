import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Customer extends Person {
  protected String prefernce;
  Scanner sc=new Scanner(System.in);

   
    void CustomerRegistration()  throws Exception{
    	Person ad=new Person();
//    	Connection con=null;
//		 con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/saloonManagement","root","Gayu@1410");
    	 Connection con=DBConnection.getConnection();
    	//ad.getConnection();
    	ad.setfirstName();
    	ad.setEmail_Address();
    	ad.setMob();
    	ad.setCity();
    	ad.setAddress();
    	ad.setPassword();
    	
		
    	
    	/*System.out.print("ENTER YOUR FIRSTNAME :");
		super.firstName=sc.nextLine();
		System.out.print("ENTER YOUR EMAIL :");
		Email_Address=sc.nextLine();
		System.out.print("ENTER YOUR PHONENUMBER :");
		phoneNumber=sc.nextLine();
		//sc.nextLine();
		System.out.print("ENTER YOUR ADDRESS:");
		Address=sc.nextLine();
		System.out.print("ENTER YOUR CITY:");
		City=sc.nextLine();
		System.out.print("ENTER YOUR PASSWORD:");
		password=sc.nextLine();*/
    	System.out.println("----------------------------------------------------");
    	System.out.println("                  REGISTRATION SUCCESSFULL");
    	System.out.println("----------------------------------------------------");
    	
    	String query="Insert into Customer(firstName,EmailAddress,phoneNumber,Address,City,password)values ('"+ad.getfirstName()+"','"+ad.getEmail_Address()+"','"+ad.getMob()+"','"+ad.getAddress()+"', '"+ad.getCity()+"','"+ad.getPassword()+"')";
		
		Statement stmt=(Statement)con.createStatement();
		boolean res=stmt.execute(query);
   
		
    }
	
	
	String Preference() throws Exception{
//		Connection con=null;
//		 con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/saloonManagement","root","Gayu@1410");
		 Connection con=DBConnection.getConnection();
		 Statement stmt=(Statement)con.createStatement();
		//System.out.println(Customer.firstName);
		//System.out.println("Enter Your PREFERNCE");
		System.out.println("    [1]->  Haircut");
		System.out.println("    [2]->  SkinCare");
		System.out.println("    [3]->  Bridal/PhotoShoot");
		System.out.println("    [4]->  Laser Technician");
		System.out.println("    [5]->  Hyrotherapy");
		System.out.println("    [6]->  Nail Cut File & Polish");
		System.out.println("    [7]->  threading/Waxing");
		System.out.println("    [8]->  Manicure/Pedicure");
		int pref=sc.nextInt();
		sc.nextLine();
		String p="";
		String ans="";
		if(pref==1) {
//			String query="select firstName,StaffId,Experience,Price from Staff where Domain='Hair Dresser'";
//			ResultSet res=stmt.executeQuery(query);	
//			boolean flag=false;
//			System.out.println("Do You Want To Add Appoinment y/n");
//			ans=sc.nextLine();
//			p=ans;
//			
//			while(res.next()) {
//				flag=true;
//				System.out.println("\nStaff Name\t:\t"+res.getString(1)+
//						         "\nStaff Id\t:\t"+res.getString(2)+
//						         "\nExperience\t:\t"+res.getString(3)+
//						         "\nPrice\t:\t"+res.getString(4));
//				System.out.println();
//				p=p+" "+res.getString(2);
//				
//			}	
//			if(!flag) {
//				System.out.println("NO Service Offered");
//			}	
			p=SelectStaff("Hair Dresser");
		}
		if(pref==2) {
			   p=SelectStaff("Beautician");
		}
		if(pref==3) {
			p=SelectStaff("Makeup Artist");			
			}
		if(pref==4) {
			p=SelectStaff("Laser Technician");
			
		}
		if(pref==5) {
			p=SelectStaff("Hyrotherapist");
		  }
		
		if(pref==6) {
			 p=SelectStaff("Nail Technician");
		}
		if(pref==7) {
			   p=SelectStaff("threaderWaxer");
		}
		if(pref==8) {
	
		    p=SelectStaff("Manicure/Pedicure");
		}
		return p;
	}
	
	
	
	String CustomerSignin() throws Exception{
			for(int i=0;i<2;i++) {
				System.out.print("Enter your userName: ");
				String user=sc.nextLine();
				System.out.print("Enter your password: ");
				String password=sc.nextLine();
				if(login11(user, password)) 
				   return user; //System.out.println(user);
				System.out.println("Password and userId incorrect");
				System.out.print("Do you want to exit(Y/N)? ");
	        	char ch=sc.nextLine().toUpperCase().charAt(0);
	        	if(ch=='Y') 
	        		System.exit(0);
			}
			return "null";
		}
	
	 boolean login11(String userId,String password) throws Exception{
		 //con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/saloonManagement","root","Gayu@1410");
		 Connection con=DBConnection.getConnection();
		Statement st = con.createStatement();
		String query = "select firstName, password from Customer where firstName='"+userId+"' and password ='"+password+"'";
		ResultSet rs = st.executeQuery(query);
		if(!rs.next())
			return false;
		else
			return true;
	}
		 
	}

