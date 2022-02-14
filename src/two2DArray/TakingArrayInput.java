package two2DArray;

import java.util.Scanner;

public class TakingArrayInput {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	System.out.println(str1);
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 char[][] matrix= new char [n][m];
//	 String str = sc.next();
//	 char cc = str.charAt(0); //taking single character as input 
	 for(int r = 0;r<n; r++) {
		String str = sc.next();
	//	System.out.println(str);
		 for(int c = 0;c<m;c++) {
			 matrix[r][c]= str.charAt(c);
			 
		 }
	 }
	 for(int r = 0;r<n; r++) {
		 for(int c = 0;c<m;c++) {
			System.out.print(matrix[r][c]+ " "); 
		 }
		 System.out.println();
	 }
	}
}

