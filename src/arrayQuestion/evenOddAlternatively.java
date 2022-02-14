package arrayQuestion;
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class evenOddAlternatively {
	public static void ArrangeArray(int[] arr,int  n) {
		Arrays.sort(arr);
		 ArrayList <Integer> even = new ArrayList<>();
		 ArrayList <Integer> odd = new ArrayList<>();
		 for(int i = 0; i< n; i++) {
				if(arr[i]%2==0) {
					even.add(arr[i]);
				}
				else {
					odd.add(arr[i]);
				}
			}
		int index =  0, i = 0,  j = 0;
		boolean flag = false;
		 if( arr[0]%2== 0) {
			 flag = true;
		 }
		 while(index < n) {
	    	   if(flag == true) {
	    		   arr[index] = (int)even.get(i);
	    		   i++;
	    		   index++;
	    		   flag = !flag;
	    	   }
	    	   else {
	               
	    		   arr[index] =(int) odd.get(j);
	    		   j++;
	    		   index++;
	    		   flag = !flag;
	    	   }
	       }
       
		 for(int l = 0; l< n; l++) {
	    	   System.out.println(arr[l]);
	       }
      // return arr;
	   
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  int[] arr= {3,4,52,5,57,8,73,2};
			int n = arr.length;
			  ArrangeArray(arr, n);
//		for(int i = 0; i< n ; i++) {
//		System.out.println(ans[i]);
//		}
	}
}
		
	
		
		


		
		
	
	
