package two2DArray;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
   public static void interSection(int[]a1,int[]a2) {
	    ArrayList<Integer>ans =new  ArrayList<>();
	    int left = 0 , right = 0;
	    while(left<a1.length &&  right< a2.length) {
	    	  if(a1[left]< a2[right]) {
	  	    	left++;
	  	    }
	  	    else if(a1[left]>a2[right]) {
	  	    	right++;
	  	    }
	  	    else {
	  	    	ans.add(a1[left]);
	  	    	left++;
	  	    	right++;
	  	    }
	    }
	  System.out.println(ans);
   }
	/*
	static boolean printChar(char c) {
		System.out.print(c);
		return true;
		}
*/
	public static void main(String args[]){
     //Scanner sc = new Scanner(System.in);
		/*
      int[][]arr = {{10,12,14,16},
    		        {20,22,24,26},
    		        {30,32,34,36},
    		        {40,42,44,46},
    		        {50,52,54,56}};
      int n = arr.length;
      int m = arr[0].length;
       int [][] arrNew = new int[m][n];
       for(int row = 0; row < n ; row++) {
    	   for(int col = 0; col< m ; col++) {
    		   arrNew[col][row]= arr[row][col];
    	   }
       }
       for(int row = 0; row < m ; row++) {
    	   for(int col = 0; col< n ; col++) {
    		   System.out.print(arrNew[row][col]+ " ");
    	   }
    	   System.out.println();
       }
*/
/*
int arr[][]={{1,2,3},{4,5},{6}};
  for(int[] i : arr) {
	   System.out.println(Arrays.toString(i));
      }
  */
		
    int[]  a1 = {10,20,30,40};
    int [] a2= {20,30};
    interSection(a1, a2);
	}
}
	
	

