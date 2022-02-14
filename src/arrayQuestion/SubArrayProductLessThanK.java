package arrayQuestion;
/*Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements 
   in the subarray is strictly less than k. */
/*
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k
*/
public class SubArrayProductLessThanK {
    public static int subarrayofNums(int [] nums , int k) {
    	int count =0;
      for(int si = 0; si< nums.length;si++) {
    	  for(int ei = si; ei< nums.length; ei++ ) {
    		  int product =1;
    		  for(int i = si; i<=ei; i++) {
    			  product= product* nums[i];
    			
    		  }
    		
    		  if(product < k) {
    		
    			  count++; 
    			 
    		  }
    	  }
       }
      return count;
    }   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] nums = {10,5,2,6 };
       int k = 100;
       int total =subarrayofNums(nums,k);
       System.out.println(total);
	}

}
