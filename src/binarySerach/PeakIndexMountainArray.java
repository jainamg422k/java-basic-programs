package binarySerach;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexMountainArray {

    public static int peak2(int[] arr) {
    	int start = 0;
    	int end = arr.length-1;
    	while(start<end) {
            int mid = (start+end)/2;
    		if(arr[mid]>arr[mid+1] ){
    		 end = mid;	
    		}
    		else {
    			
    		start  = mid+1;
    		}
    		
    	}
    	return start;    // we can return anything start or end coz when both are equal we get peak element
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr = {0,1,0};
       
        System.out.println(peak2(arr));
	}

}
