package javaSession2;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	     int n = sc.nextInt();
	     int nsp = n/2;
	     int nst = 1;
	     for (int row =1;  row<= n; row++) {
	       for(int csp=1; csp<=nsp; csp++) {
	    	   System.out.print(" ");
	       }
	       for (int cst = 1; cst <= nst; cst++) {
	    	   System.out.print("*");
	       }
	       if(row<=n/2) {
	    	   nsp --;
	    	   nst+=2;
	       }
	       else {
	    	   nsp++;
	    	   nst-=2;
	       }
	       System.out.println();
	     }
	     
			
	}

}
