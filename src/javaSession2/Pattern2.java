package javaSession2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			int n = sc.nextInt();
			int row= 1;
			int nst = 1;
				while(row <= n) {
					int cst = 1;
					while (cst <= nst) {
						System.out.print("*");
						cst++;
					}
					nst++;
					System.out.println();
					row++;
				}
		
	}

}
