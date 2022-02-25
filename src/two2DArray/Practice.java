package two2DArray;
import java.util.Arrays;
import java.util.Scanner;

import javaSession2.searchElementArray;

public class Practice {
	
   
	public static void main(String args[]){
		 int []arr = {2,2,3,3,3,3,42,34,224,2,242};
		 int n = arr.length;
		 int [] index  = {-1,-1};
		 int target = 242;
		 for(int i : arr) {
			 if(i== target) {
				 index[0]= i;
				 break;
			// System.out.println(i);
			 } 
		 }
		 for(int i = n-1; i>=0; i--) {
			 if(arr[i]== target) {
				 index[1] = i;
			    break;
			 }
		 }
	       System.out.println(Arrays.toString(index));
	}
}





	
	

