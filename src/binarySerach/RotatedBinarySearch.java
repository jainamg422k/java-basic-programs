package binarySerach;

public class RotatedBinarySearch {
	public static int search(int []arr ,int target) {
		int pivot = findPivot(arr);
		//if we not found the pivot that means array is not rotated 
		if(pivot == -1) {
			//just to normal binary search
		return	binarysearch(arr, target,0,arr.length-1);
			
		}
		// if pivot is found so have to ascending sorted array
		  if(arr[pivot] == target) {
			  return pivot;
		  }
		  else if( target > arr[0]) {
			  return binarysearch(arr, target, 0, pivot-1);
		  }
		 return binarysearch(arr, target, pivot+1, arr.length-1);
	}
	public static int binarysearch(int []arr,int target,int start,int end) {
		
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
    public static int findPivot (int []arr) {
    	int start = 0 ;
    	int end = arr.length-1;
    	while(start<= end) {
    	  int mid = (start+end)/2;
    	 if(mid<end &&arr[mid]>arr[mid+1]) {
    		 return mid;
    	 }
    	 else if(arr[mid]<arr[mid-1]) {
    	   return mid -1;
    	}
    	else if(mid > start &&arr[start]>= arr[mid]) {
    		end = mid-1;
    	}
    	else {
    		 start = mid+1;
    	}
     }	
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(search(arr, target));
	}

}
