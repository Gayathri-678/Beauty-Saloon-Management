import java.util.*;
public class Person extends ConnectionEstablish{
   private String firstName;
   private String phoneNumber;
   private String Email_Address;
   private String password;
   private String City;
   //protected String Country;
   private String Address;
   private String experience;
   private String price;
   public static Scanner sc=new Scanner(System.in);
    
    public void setfirstName() {
    	System.out.print("ENTER YOUR FirstName:");
		firstName=sc.nextLine();
    } 
    public void setEmail_Address() {
    	System.out.print("ENTER YOUR Email :");
		Email_Address=sc.nextLine();
    }
    public void setMob()  {
    	System.out.print("ENTER YOUR PhoneNumber :");
		phoneNumber=sc.nextLine();
    }
    public void setCity() {
    	System.out.print("ENTER YOUR City :");
		City=sc.nextLine();
    }
    public void setAddress(){
    	System.out.print("ENTER YOUR Address :");
		Address=sc.nextLine();
    }
   public void setExperience(){
	   System.out.print("ENTER YOUR Experience :");
		experience=sc.nextLine();
    }
   public void setPassword() {
	   System.out.print("ENTER YOUR PASSWORD:");
		password=sc.nextLine();
   }
   public void setPrice() {
	   System.out.print("ENTER YOUR Price/hr :");
		price=sc.nextLine();
   }
    
  public String getfirstName() {
	   return firstName;
   }
  
   protected String getEmail_Address() {
	   return Email_Address;
   }
   protected String getMob() {
	   return phoneNumber;
   }
   protected String getCity() {
	   return City;
   }
   protected String getAddress() {
	   return Address;
   }
   protected String getExperience() {
	   return experience;
   }
   protected String getPrice() {
	   return price;
   }
   
   protected String getPassword() {
	   return password;
   }
} 
