package two2DArray;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	     int n = sc.nextInt();
//	     int m = sc.nextInt();
//	     int[][] twoD = new int [n][m]; 
//	     for(int row = 0; row <n ;row++) {
//	       for(int col=0; col<m;col++) {
//	    	   twoD[row][col]=sc.nextInt();
//	       }
//	     }
//	     for(int row = 0; row <n ;row++) {
//		       for(int col=0; col<m;col++) {
//		    	System.out.print(twoD[row][col]+ " ");
//		       }
//		       System.out.println();
//		     }
//	     int nn = twoD[0].length;
//	     System.out.println(nn);
		/*
	int jagged[][] = new int [4][];
	 jagged[0]= new int[2];
	 jagged[1]= new int[3];
	 jagged[2]= new int [1];
	 jagged[3]=new int[4];
	 int val=1;
	 for(int row = 0;row<jagged.length;row++) {
	 for(int i = 0;i < jagged[row].length;i++) {
		 jagged[row][i]= val;
	 System.out.print(jagged[row][i]+ " ");
		 val++;
	 }
	 System.out.println();
	 }
	 */
   int n = sc.nextInt();
   
   int jag[][] = new int[n][];
   for(int row =0;row<n;row++) {
	   int m  = sc.nextInt();
	     jag[row] = new int[m];
   }
   for(int row = 0; row<n;row++) {
	   System.out.println(jag[row].length);
   }
   for(int row=0; row<n;row++) {
	 for(int col = 0; col<jag[row].length;col++) {
		 System.out.print(jag[row][col]);
	 }
	 System.out.println();
   }
	}

}
