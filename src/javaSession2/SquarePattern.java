package javaSession2;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		  int n = sc.nextInt();
		  int row = 1;
        int nst = n;				  
		  while(row<=n){
			  
				  int cst =1;
			  while(cst <= nst) { 
				  if (row ==1 || cst == 1  || row == n || cst == n) {
					  System.out.print("*");
				  }		
				  else {
					  System.out.print(" ");
				  }
				  cst++;
				  
				  
			  }
			 
			  
			
			  System.out.println( );
			  row++;
		  }
	     

	}

}
