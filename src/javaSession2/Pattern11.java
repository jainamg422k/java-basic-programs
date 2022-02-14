package javaSession2;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int row = 1;
		int  nst = 1;
		while(row <= n) {
			int cst = 1;
			while (cst <= nst) {
				if(cst % 2 == 0) {
				  System.out.print("!");
			    }
		      else {
			    System.out.print("*");
			   }
				cst++;
			}
			nst+=2;
	       System.out.println();
	       row++;
		}
		
		 
		

	}

}
