package javaSession2;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner( System.in);
          int n = sc.nextInt();
          int row = 1;
          int nst = 1; 
          while(row <= 2*n-1) {
        	  int cst = 1;
        	  while(cst<= nst) {
        		  System.out.print("*");
        		  cst++;
        	  }
        	   if(row < n) {
        		   nst++;
        	   }
        	   else {
        		   nst--;
        	   }
        	  System.out.println();
        	  row++;
          }
	}

}
