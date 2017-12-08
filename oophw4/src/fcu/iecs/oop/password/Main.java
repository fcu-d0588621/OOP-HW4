package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

 PasswordEncorder encorder =new PasswordEncorder();
		
 while(true)
{
	 System.out.println("Please enter a password"); 
	 Scanner sc = new Scanner(System.in);
	 String id = sc.next();
	 int num= id.compareTo("exit");
	  
	 if(num==0) 
	{
		  sc.close();
		  break;
    }
	 String password=encorder.encode(id);
     System.out.println(password);
   
}

	}
}