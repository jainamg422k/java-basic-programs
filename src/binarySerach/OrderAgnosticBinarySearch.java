package binarySerach;

public class OrderAgnosticBinarySearch {
   //if we dont know in which order is given array ascending or descending order to check that and base tha apply binary search 
	//algorithm logic
	public static int binarySearch2(int []arr,int target) { //descending order logic
		int start = 0 , end = arr.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(target>arr[mid]) {
				end = mid -1;
			}
			else if(target < arr[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return-1;
	}
	public static int binarySearch1(int []arr,int target) {   //ascending order logic
		int start = 0 , end = arr.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(target>arr[mid]) {
				start = mid+1;
			}
			else if(target < arr[mid]) {
				end = mid -1;
			}
			else {
				return mid;
			}
	}
		return-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []arr = {3,3,3,3,5,6,12,14,20,33};
         int target = 14;
        int firstelement = arr[0];
        int lastelement = arr[arr.length-1];
        if(lastelement> firstelement) {
        	int ans =binarySearch1(arr, target);
        	System.out.println(ans);
        }
        else {
        	int ans = binarySearch2(arr, target);
        	System.out.println(ans);
        }
	}

}
