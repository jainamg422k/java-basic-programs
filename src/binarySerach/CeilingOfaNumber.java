package binarySerach;

public class CeilingOfaNumber {
	//question link
	//https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/
	public static int ceiling(int []arr,int target) {
		//edge case -> what if the target element is greater than last or greatest element in array
		int start = 0 , end = arr.length-1;
		if(target > arr[arr.length-1]) {  //edge case 
			return -1;      
		}
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]== target) {
				return arr[mid];
			}
			else if(target>  arr[mid]) {
			   start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return arr[start];
	}
	public static int floorofNumber(int []arr, int target ) {
		if(target< arr[0]) {
			return -1;
		}
		int start = 0 ; int end = arr.length-1;
	     while(start<=end) {
	    	 int mid =  (start+ end)/2;
	    	 if(target == arr[mid]) {
	    		 return arr[mid];
	    	 }
	    	 else if(target> arr[mid]) {
	    		 start = mid +1;
	    	 }
	    	 else {
	    		 end = mid -1;
	    	 }
	     }
	     return arr[end];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int []arr = {3,3,5,9,14,16,18};
           int target = 2;
           System.out.println("Ceiling of the number is "+" "+ceiling(arr ,target));
           System.out.println("Floor of the number is"+" "+floorofNumber(arr, target));
	}

}
