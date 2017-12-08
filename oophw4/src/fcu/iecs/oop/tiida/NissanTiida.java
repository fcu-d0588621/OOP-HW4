package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class NissanTiida 
{
	
	int n=1,x=0;
	public void tiida()
{
	    
		int i,j;
		
		for(i=0;i<n;i++)
	    {
	    	System.out.print("*");
	    	
	    for(j=0;j<x;j++)
	    {
	    	System.out.print("*");
	    }
	    System.out.print("\n");
	    }
		System.out.print("\n");
		n++;x++;
		//System.out.println(n);
		//System.out.println(x);
}             
	
}