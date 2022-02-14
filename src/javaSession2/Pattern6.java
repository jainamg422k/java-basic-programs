package javaSession2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	 int n = sc.nextInt();
	 int row = 1;
	 int nsp =0;
	 int nst = n ;
	 while(row<=n) {
		  int csp = 1;
		  while (csp <= nsp) {
			  System.out.print(" ");
			  csp++;
		  }
		  int cst =1;
		  while(cst <= nst) {
			  System.out.print("*");
			    cst++;
		  }
		  nsp+=2;
		  nst--;
			
		 System.out.println();
	      row++;
	 }
	}
}
