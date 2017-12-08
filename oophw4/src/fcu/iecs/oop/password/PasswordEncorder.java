package fcu.iecs.oop.password;
import java.util.Scanner;
public class PasswordEncorder 
{

	public String encode (String id) 
	{
		
		
	     id=id.replace('A', '4');
	     id=id.replace('a', '4');
	     id=id.replace('E', '3');
	     id=id.replace('e', '3');
	     id=id.replace('i', '1');
	     id=id.replace('I', '1');
	     id=id.replace('O', '0');
	     id=id.replace('o', '0');
	     id=id.replace('T', '7');
	     id=id.replace('t', '7');
	       return id;
	    // System.out.println(id);  
		
	  
	    	}

}
