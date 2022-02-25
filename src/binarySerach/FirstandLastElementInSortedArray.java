package binarySerach;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Find First and Last Position of Element in Sorted Array
public class FirstandLastElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {5,7,7,7,7,8,8,10};
		int target = 7;
		int[] ans =searchRange(nums, target);
           System.out.println(Arrays.toString(ans));
	}
	 public static int[] searchRange(int[] nums, int target) {
	        int ans[] = {-1,-1};
	        int start = search(nums ,target,true);
	        int end = search(nums ,target,false);
	       ans[0] = start;
	       ans [1] = end;
	        return ans;
	 }
	 public static int search(int[] nums,int target,boolean firstIndex ){
		 int ans = -1;  
		 int start = 0; 
		   int end =  nums.length;
		   while(start<= end) {
			   int mid = (start+end)/2;
			   if( target  == nums[mid]) {
				   ans = mid;
				   if(firstIndex) {
					   end = mid -1;
				   }
				   else {
					   start = mid+1;
				   }
			   }
			   else if(target > nums[mid]) {
				   start = mid+1;
			   }
			   else {
				   end = mid-1;
			   }
		   }
		   
	 return ans;
}
	 

}
