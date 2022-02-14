package javaSession2;

import java.util.Scanner;

public class ReplaceAll {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in); 
	     long n = sc.nextLong();
	     long temp = n;
	     long multiplier =1;
	     long finalV=0;
	     long rem =0;
	    
	     while(n>0) {
	    	  rem = n%10;
	    	 if(rem==0) {
	         	 rem =5;
	    	 }
	    	// System.out.print(rem);
	    	 long value = rem * multiplier;
	    	   finalV=finalV + value;
	            n = n/10;
	            multiplier = multiplier *10;
	     }
	     if(temp==0) {
	    	 System.out.println(5);
	     }
	     else {
	     System.out.print(finalV);
	     }

	}

}
