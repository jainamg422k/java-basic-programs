package javaSession2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
	     int row= 1;
	     int nsp = n-1;
	     int nst = 1;
	     while(row<= n) {
	    	 //print Spaces
	    	 int csp = 1;
	    	while(csp <= nsp) {
	    		System.out.print(" ");
	    		 csp++;
	    	}
	    	//print star
	    	int cst=1;
	       while(cst <= nst) {
	    	   System.out.print("*");
	    	   cst++;
	       }
	    	nsp--;
	    	nst++;
	    	
	    	 System.out.println();
	    	 row++;
	     }
	     

	}

}
