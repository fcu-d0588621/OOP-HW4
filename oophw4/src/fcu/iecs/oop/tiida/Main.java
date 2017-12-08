package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              NissanTiida tiida1=new NissanTiida();
       System.out.println("Please enter a numer"); 
       Scanner sc = new Scanner(System.in);
         	 int number = sc.nextInt();
	int l;
         	 for(l=0;l<number;l++)
	{
		tiida1.tiida();
		
	}
	
	
	
	}

}
