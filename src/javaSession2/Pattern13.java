package javaSession2;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in); 
	int n =sc.nextInt();
	int row = 1;
	int nsp= 0;
	int nst= n;
	while(row <= 2*n-1) {
	    int csp = 1;
	    while (csp<= nsp) {
	    	System.out.print(" "); 
	          csp++;
	    }
		int cst = 1;
		while (cst <=nst) {
			System.out.print("*");
			cst++;
		}
		if(row <n) {
			nsp+=2;
			nst --;
		}
		else {
			nsp-=2;
			nst++;
		}
		System.out.println();
		row++;
	}

	}

}
