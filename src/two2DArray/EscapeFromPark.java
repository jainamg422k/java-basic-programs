package two2DArray;

import java.util.Scanner;

public class EscapeFromPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =  sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
       char[][] arr= new char[n][m];
       for(int row = 0; row< n; row++) {
    	   String str = sc.next();
    	   for(int col = 0; col<m ; col++ ) {
    		   arr[row][col] = str.charAt(col);
    	   }
       }
       
       for(int row = 0 ; row< n; row++) {
    	   for(int col = 0; col< m; col++) {
    		   if(s>=k ) {
    			   if(arr[row][col]=='.') {
        			   s-=2;
        		   }
        		   else if(arr[row][col]=='*') {
        			   s+=5;
        		   }
        		   else {
        			 //  row =row+1;
        			   // col =0;
        			    break;
        		   }
        		   
        		   if(col < m-1) {
        			   s--;
        		   }
        	   }
        	   
           }
    		   }
    		   
    		  
       /*
       for(int row = 0; row< n; row++) {
    	   for(int col = 0; col< m; col++) {
    		   System.out.print(arr[row][col]+ " ");
    	   }
    	   System.out.println();
       }
       */
       if(s>=k) {
    	   System.out.println("yes");
    	   System.out.println(s);
    	   
       }
       else {
    	   System.out.println(" no");
       }
      
	}

}
