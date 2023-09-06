import java.util.*;

public class Main {
		public static void main(String[] args) throws Exception{
			System.out.println(
					"\n\t******************************BEAUTY SALOON -Management-System***********************************\n");
			boolean check = false;
			Scanner sc = new Scanner(System.in);
			Admin a = new Admin();
			
			
			DBConnection  c=new DBConnection();
			c.getConnection();
//			c.getConnection();
//			c. createTableCustomer();
//			c.createTableDomain();
//			c.createTableStaff();
//			c.createTableAppoinment() ;
			System.out.print(
					"\t**********************************************************************\n");
			System.out.print(
					"\t*                  1. LOGIN                                          *\n");
			System.out.print(
					"\t*                  2. SIGN UP                                        *\n");
			System.out.print(
					"\t**********************************************************************\n");
			System.out.println("Enter Your Choice");
			int choiceLS=sc.nextInt();
			sc.nextLine();
			
			 
			Staff staff=new Staff();
			 
			switch(choiceLS) {
			case 1:
				 System.out.println("Enter Your UserName");
				 String Username=sc.nextLine();
				 System.out.println("Enter your Password");
				 String password=sc.nextLine();
				 Appointment app=new Appointment();
				 Customer cus=new Customer();
				 if(cus.login11(Username,password)) {
					 System.out.println("    1] Enter Your Prefernce ");
						String ans=cus.Preference();
						
						String s[]=ans.split(" ");
						//System.out.println(s[0]);
						if(s[0].equals("y")) {
							app.addAppoinment(s[1]);
						}
					
						else {
							System.out.println("DO You need to quit Apppoinment");
							String anss=sc.nextLine();
							if(anss.equals("yes"))
						     System.exit(0);
								
						}}
				 else if(staff.login11(Username,password)) {
					 
					 System.out.println("----------------------------------------------------");
					 System.out.println("\t\t1. View Appoinment");
					 System.out.println("\t\t2. Delete Appoinment");
					 System.out.println("----------------------------------------------------");
					 int stafChoice=sc.nextInt();
					 switch(stafChoice) {
					 case 1:
						 System.out.println("----------------------------------------------------");
							System.out.println("\t\t TO VIEW YOUR APPOINMENT: ");
							System.out.print("\t\t Enter your StaffId :");
							String name;
							 name=sc.next();
					    	System.out.println("----------------------------------------------------");
					    	
							app.viewAppoinments(name);
							break;
					 case 2:
						    app.delAppoinment();
						   break;
					 }
					}
				 else if(Username.equals("abc")&& password.equals("1234")) { 
					 Admin admin=new Admin();
					 int choiceadmin=0;
							while(choiceadmin!=5) {
							System.out.print(
									"\t************************************************************************\n");
							System.out.print(
									"\t*                  1]. DELETE STAFF                                    *\n");
							System.out.print(
									"\t*                  2]. CUSTOMER- Details                               *\n");
							System.out.print(
									"\t*                  3]. STAFF - DETAILS                                 *\n");
							System.out.print(
									"\t*                  4]. APPOINTMENT DETAILS                             *\n");
							System.out.print( 
									"\t*                  5]. DELETE APPOINTMENT                              *\n");
							System.out.print( 
									"\t*                  6]. EXIT                                            *\n");
							
							System.out.print(
									"\t***********************************************************************\n");
							System.out.println("Enter your Choice from Above");
							
							 choiceadmin=sc.nextInt();
							 sc.nextLine();
							Admin obj=new Admin();
							switch(choiceadmin) {
							case 1:
								System.out.println("Enter Staff name to be Deleted");
								String name=sc.nextLine();
							    obj.delStaff(name);
							   break;
								
							case 2:  //customer details
								obj.customerDetails();
									break;
								
							case 3: //staff detials
								obj.staffDetails();
									break;
							case 4: //appoinmemt detials
								app.appoinmentDetails();
								 break;
							case 5:
								app. delAppoinment() ;
							case 6: //exit 
								System.out.println("System Exited");
								System.exit(0);
								break;
							}
						}
						}
						
					  break;
					 
			case 2:
				
				System.out.println("----------------------------------------------------");
				System.out.println("\t\t 1.Customer Registration");
				System.out.println("\t\t 2.Staff Registration");
				System.out.println("----------------------------------------------------");
					 int Regchoice=sc.nextInt();
					 switch(Regchoice) {
					 case 1:
						 System.out.println("Enter Customer Details ");
							cus.CustomerRegistration();
							break;
					 case 2:
						 staff.staffRegistration();;
							
							break;
					 }
				 break;
			  default:
				System.out.println("----------------------------------------------------");
				System.out.println("\t\tInvalid Choice!!");
				System.out.println("----------------------------------------------------");
				break;
				 }
					 
			////
			
			
			
			
			
			/*int choice=0;
			while (choice!=4) {
				System.out.print(
						"\t**********************************************************************\n");
				System.out.print(
						"\t*                  1. ADMIN                                          *\n");
				System.out.print(
						"\t*                  2. CUSTOMER                                       *\n");
				System.out.print(
						"\t*                  3. STAFF                                          *\n");                        
				System.out.print(
						"\t*                  4. EXIT                                           *\n");
				//System.out.print("                                                                *\n");
				System.out.print(
						"\t**********************************************************************\n");
				choice = sc.nextInt();
				sc.nextLine();
	// Login			
				switch(choice) {
	//admin
				case 1:  //Admin Portal
					boolean checkadmin = false;
					System.out.println("     ******************************* Welcome to Admins portal *********************");
					String un;
					String pd;
					System.out.print(" USERNAME-->");
					un = sc.nextLine();
					System.out.print(" Password-->");
					pd = sc.nextLine();
					if((un.equals("abc")&& pd.equals("1234"))||(un.equals("xyz")&& pd.equals("1234")))
						checkadmin=true;
						//System.out.println(checkadmin);
					int choiceadmin=0;
					if(checkadmin) {
						while(choiceadmin!=5) {
						System.out.print(
								"\t************************************************************************\n");
						System.out.print(
								"\t*                  1]. DELETE STAFF                                    *\n");
						System.out.print(
								"\t*                  2]. CUSTOMER- Details                               *\n");
						System.out.print(
								"\t*                  3]. STAFF - DETAILS                                 *\n");
						System.out.print(
								"\t*                  4]. APPOINTMENT DETAILS                             *\n");
						System.out.print( 
								"\t*                  5]. DELETE APPOINTMENT                              *\n");
						System.out.print( 
								"\t*                  6]. EXIT                                            *\n");
						
						System.out.print(
								"\t***********************************************************************\n");
						System.out.println("Enter your Choice from Above");
						
						  choiceadmin=sc.nextInt();
						 sc.nextLine();
						Admin obj=new Admin();
						switch(choiceadmin) {
						case 1:
							System.out.println("Enter Staff name to be Deleted");
							String name=sc.nextLine();
						    obj.delStaff(name);
						   break;
							
						case 2:  //customer details
							obj.customerDetails();
								break;
							
						case 3: //staff detials
							obj.staffDetails();
								break;
						case 4: //appoinmemt detials
							a.appoinmentDetails();
							 break;
						case 5:
							obj. delAppoinment() ;
						case 6: //exit 
							System.out.println("System Exited");
							System.exit(0);
							break;
						}
					}
					}
					else
						System.out.println("Invalid username or password");
				  break;
				  
				    case 2:
				    	Customer cs=new Customer();
				    	System.out.println("Enter Your Options : ");
						System.out.println("    [1]->  CustomerRegistration");
						System.out.println("    [2]->  Customer Sign");
						
						String choicecust=sc.nextLine();
						//sc.nextLine();
						switch(choicecust) {
						case "1":
							System.out.println("Enter Customer Details ");
							cs.CustomerRegistration();
							break;
						case "2":
							String flag=cs.CustomerSignin();
							if(!flag.equals("null")) {
							System.out.println("    1] Enter Your Prefernce ");
							String ans=cs.Preference();
							
							String s[]=ans.split(" ");
							System.out.println(s[0]);
							if(s[0].equals("y")) {
								cs.addAppoinment(s[1]);
							}
						
							else {
								System.out.println("DO You need to quit Apppoinment");
								String anss=sc.nextLine();
								if(anss.equals("yes"))
							     System.exit(0);
									
							}}
							break;
							default:
								System.out.println("----------------------------------------------------");
								System.out.println("\t\tInvalid Choice!!");
								System.out.println("----------------------------------------------------");
								break;
						}
				    	
						
						
						break;
						
				    case 3:
				    Staff st=new Staff();
				    	//st.staffRegistration();   
				    	System.out.println("Enter Your Options : ");
						System.out.println("    [1]->  StaffRegistration");
						System.out.println("    [2]->  Staff Sign");
						
						String choiceStaff=sc.next();
						
						switch(choiceStaff) {
						case "1":
							st.staffRegistration();;
							
							break;
						case "2":
							String flag=st.StaffSignin();
							if(!flag.equals("null")) {
						    	System.out.println("----------------------------------------------------");
								System.out.println("\t\tTO VIEW YOUR APPOINMENT: ");
								System.out.print("\t\tEnter your StaffId :");
								String name;
								 name=sc.next();
						    	System.out.println("----------------------------------------------------");
						    	
								st.viewAppoinments(name);
							}
							break;
						default:
							System.out.println("----------------------------------------------------");
							System.out.println("\t\tInvalid Choice!!");
							System.out.println("----------------------------------------------------");
							break;
						}
						break;
				    case 4:
				    	System.out.println("----------------------------------------------------");
				    	System.out.println("              System Exited!!");
				    	System.out.println("----------------------------------------------------");
				    	System.exit(0);
				    	break;
				    	
				    	default:
				    		System.out.println("Invalid Choice");
				    		break;
				}
	}*/

}
}
