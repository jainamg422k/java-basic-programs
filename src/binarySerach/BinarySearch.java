package binarySerach;

public class BinarySearch {
// for binary search array should be in sorted order either ascending or decending
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []arr = {2,4,6,9,11,12,20,36,48,88};
      int []arr2 = {10,9,8,7,6,5,4,3,2,1};
      int  target = 2;
      System.out.println(search2(arr2,target)); // when array is in sorted descending order
      System.out.println(search(arr, target));  //when arrqay is in sorted ascending order
	}
	//when array is in sorted descending order
	public static int search2(int []arr,int target) {
		int start = 0 , end = arr.length-1;
		while(start <= end) {
		int mid = (start +end)/2;
		if(target>arr[mid]) {
			end = mid -1;	
		}
		else if(target <arr[mid]) {
			
			  start = mid +1;
		}
		else {
			return mid;
		}
	  }
			
  return -1;
	}
	//when array is in sorted ascending order
	public static int search(int []arr,int target) {
		int start = 0 , end = arr.length-1;
		while(start <= end) {
		int mid = (start +end)/2;
		if(target>arr[mid]) {
			 start = mid +1;
		}
		else if(target <arr[mid]) {
			
			 
			  end = mid -1;
		}
		else {
			return mid;
		}
	  }
			
  return -1;
	}
}
