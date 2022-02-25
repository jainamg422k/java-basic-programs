package binarySerach;
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
	public static int search(int[]arr,int  target) {
		int peak  = peakIndex(arr);
		//solve this with help of orderAgnostic binary search
		int firstIndex = binarySearch(arr, target, 0, peak);
		if(firstIndex!= -1) {
			return firstIndex;
		}
		else {
			int secondIndex = binarySearch(arr, target, peak+1, arr.length-1);
			if(secondIndex != -1) {
				return secondIndex;
			}
		}
		
		return -1;
	}
    public static int peakIndex(int[]arr) {
    	int start = 0;
    	int end = arr.length-1;
    	while(start< end) {
    	     int mid  = (start+end)/2;
    	     if(arr[mid]>arr[mid+1]) {
    	    	 end = mid;
    	     }
    	     else {
    	    	 start = mid+1;
    	     }
    	}
    	return start;
    }
    public static int binarySearch(int []arr,int target,int start ,int end) {
    	boolean isAsc = arr[start]<arr[end];   //true; condition
    	while(start <= end) {
    		int mid = (start+end)/2;
    		if(isAsc) {
    			if(target>arr[mid]) {
    				 start = mid+1;
    			}
    			else  if (target<arr[mid]){
    				  end = mid-1;
    			}
    			else {
    				return mid;
    			}
    		}
    		else {
    			 if(target> arr[mid]) {
    				  end = mid -1;
    			 }
    			 else if(target< arr[mid]) {
    				 start= mid+1;
    			 }
    			 else {
    				  return mid;
    			 }
    		}
    	}
    	return -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = {1,2,4,3,5,3,1};
	     int target = 3;
	    System.out.println( search(array, target));
	  
	}

}
