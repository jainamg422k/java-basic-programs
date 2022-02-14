package arrayQuestion;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*// Approach 1st
		int[]arr = {1,1,2,1,2,2,2};
		int n =arr.length;
		for(int curr = 0; curr < n-1; curr++) {
			int count = 1;
			for(int i = curr+1 ; i< n; i++) {
				if(arr[curr]== arr[i]) {
					count++;
				}
			}
			 if(count > n/2) {
				 System.out.println("Majority Element in array is"+ " "+ arr[curr]);
				 break;
			 }
		}
		*/
		//2nd Approach
		/*
        int []arr = {1,1,2,2,2,1,1,1,2,2,2};
        Arrays.sort(arr);
      //  System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int count = 1;
        for(int curr = 0; curr<=n-2 ; curr++) {
        	if(arr[curr] == arr[curr+1]) {
        		count++;
        	}
        	
        		if(count > n/2) {
            		System.out.println(arr[curr]);
            		break;
            	}
        		 if( arr[curr]!= arr[curr+1]) {
        			 count =1;
        		 }
        }
        */
        
        //3r Approch

		int[] arr = {2,1,1,1,1,2,2,2,2,2,2,2};
		Arrays.sort(arr);
		System.out.println(arr[arr.length/2]);
	}
	
}
        		
        		
        	
        	
        	
        	
        	
        	
        	
        	
