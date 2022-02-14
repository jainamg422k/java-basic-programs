package divdeAndConquer;

import java.util.Arrays;

public class QuickSort {
	
    public static void quickSort(int arr[], int s , int e) {
    	if(s>=e) {
    		return;
    	}
    	int mid = (s+e)/2;
    	int pivot = arr[mid];
    	int left = s ,  right = e;
    	while(left<=right) {
    		while(arr[left]< pivot) {
    			left++;
    		}
    		while(arr[right]>pivot) {
    			right--	;
    		}
    		if(left<=right) {
    		int temp = arr[left];
    		   arr[left]= arr[right];
    		   arr[right]= temp;
    		   left++;
    		   right--;
    		  
    	}
    	}
    	 quickSort(arr, s, right);
	      quickSort(arr, left, e );
    	  System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
	 int arr[] = {50, 40,80,90,70,10,30,60,120}; 
	 quickSort(arr, 0, arr.length-1);

	}

}
