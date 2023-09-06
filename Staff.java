import java.util.*;
import java.sql.*;
import java.sql.*;
public class Staff extends Person{
	static int hairDresser=2;
	static int beautician=2;
	static int makeupartist=2;
	static int laserTechy=2;
	static int hydrotherapist=2;
	static int nailTechy=2;
	static int threaderWaxer=2;
	static int maniPedi=2;
    
     void staffRegistration() throws Exception{
    	 Person ad=new Person();
    	    ad.setfirstName();
			ad.setMob();
			ad.setEmail_Address();
			ad.setCity();
			ad.setAddress();
			ad.setExperience();
			ad.setPrice();
			ad.setPassword();
    	 Connection con=null;
    		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/saloonManagement","root","Gayu@1410");
   
    	
		System.out.println("Enter Your Domain Number");
		System.out.println("    [1]->  Hair Dresser");
		System.out.println("    [2]->  Beautician");
		System.out.println("    [3]->  Makeup Artist");
		System.out.println("    [4]->  Laser Technician");
		System.out.println("    [5]->  Hyrotherapist");
		System.out.println("    [6]->  Nail Technician");
		System.out.println("    [7]->  threader/waxer");
		System.out.println("    [8]->  Manicure/Pedicure");
		int domain=sc.nextInt();
		 
		 System.out.println(ad.getfirstName());
		if(domain==1) {
			hairDresser=hairDresser++;
			String a="hairDresser"+hairDresser;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"Hair Dresser",ad.getExperience(),ad.getPassword(),ad.getPrice());	

            System.out.println("Your ID is "+a);

		}  
		else if(domain==2) {
			beautician+=beautician;
			String a="beautician"+""+beautician;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"Beautician",ad.getExperience(),ad.getPassword(),ad.getPrice());	

			System.out.println("Your ID is "+a);
		}
		else if(domain==3) {
			makeupartist++;
			String a="makeupartist"+makeupartist;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"Makeup Artist",ad.getExperience(),ad.getPassword(),ad.getPrice());	
			System.out.println("Your ID is "+a);
		}
		else if(domain==4) {
			
			laserTechy=laserTechy++;
			String a="laserTechy"+laserTechy;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"Laser Technician",ad.getExperience(),ad.getPassword(),ad.getPrice());	
			System.out.println("Your ID is "+a);
			
		}
		else if(domain==5) {
			hydrotherapist++;
			String a="hydrotherapist"+hydrotherapist;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"Hyrotherapist",ad.getExperience(),ad.getPassword(),ad.getPrice());	
			System.out.println("Your ID is "+a);
		}
		else if(domain==6) {
			nailTechy++;
			String a="nailTechy"+nailTechy;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"Nail Technician",ad.getExperience(),ad.getPassword(),ad.getPrice());	
			System.out.println("Your ID is "+a);
		}
		else if(domain==7) {
			threaderWaxer++;
			String a="threaderWaxerr"+threaderWaxer;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"threaderWaxer",ad.getExperience(),ad.getPassword(),ad.getPrice());	
			System.out.println("Your ID is "+a);
		}
		else if(domain==8){
			
			ConnectionEstablish obj= new ConnectionEstablish();
			maniPedi++;
			String a="maniPedi"+""+maniPedi;
			ConnectionEstablish.InsertStaff(a,ad.getfirstName(),ad.getEmail_Address(),ad.getMob(),ad.getCity(),ad.getAddress(),"Manicure/Pedicure",ad.getExperience(),ad.getPassword(),ad.getPrice());
			System.out.println("Your ID is "+a);
		}
     }
		
   
     
    
     
 	String StaffSignin() throws Exception{
		{    
			
			for(int i=0;i<2;i++) {
				System.out.print("Enter your staffName: ");
				String user=sc.nextLine();
				System.out.print("Enter your password: ");
				String password=sc.nextLine();
				if(login11(user, password)) 
				   return user;//System.out.println(user);
				System.out.println("Password and userId incorrect");
				System.out.print("Do you want to exit(Y/N)? ");
	        	char ch=sc.nextLine().toUpperCase().charAt(0);
	        	if(ch=='Y') 
	        		System.exit(0);
			}
			return "null";
		}
	}
	 boolean login11(String userId,String password) throws Exception{
		 //con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/saloonManagement","root","Gayu@1410");
		Connection con=DBConnection.getConnection();
		Statement st = con.createStatement();
		String query = "select firstName, password from Staff where firstName='"+userId+"' and password ='"+password+"'";
		ResultSet rs = st.executeQuery(query);
		if(!rs.next())
			return false;
		else
			return true;
	
     
}
}
