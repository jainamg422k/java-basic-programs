package two2DArray;

import java.util.Arrays;
import java.util.Scanner;

public class RowiseSortMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m =  sc.nextInt();
		int[][] unsortedarr=  new int [n][m] ;
		for(int row =0; row<n;row++) {
			for(int col = 0; col<m;col++) {
			  unsortedarr[row][col] =sc.nextInt(); 
			}
			
		}
	 
	    for(int i = 0; i< n;i++) {
	    	for(int j =0 ;j<m;j++) {
	    	 	 Arrays.sort(unsortedarr[i]);
	    	 	 System.out.print(unsortedarr[i][j]+ " ");
	    	 	 
	    	}
	    	System.out.println();
	    }

	}

}
