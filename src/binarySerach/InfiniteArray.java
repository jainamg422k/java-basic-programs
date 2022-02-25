package binarySerach;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr  = {2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20};
          int target = 2;
         int ans = ans(arr,target);
	      System.out.println(ans);
	}
	public static int ans(int [] arr ,int target) {
		int start = 0; 
	     int end = 1;
	     while(target>arr[end]) {
	    	 int newStart = end+1;
	    	 // end + sizeofBox *2
	    	  end = end +(end-start+1)*2;
	    	  start = newStart;
	     }
	     return binarysearch( arr ,target,start,end);
	}
	public static int binarysearch(int[]arr,int target,int start,int end) {
		    while(start<=end) {
		    	int mid = start+end/2;
		    	if(target == arr[mid]) {
		    		return mid;
		    	}
		    	else if (target< arr[mid]) {
		    		end = mid -1;
		    	}
		    	else{
		    		start = mid+1;
		    	}
		    }
		    return -1;
	}

}
