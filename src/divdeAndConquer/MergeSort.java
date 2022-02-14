package divdeAndConquer;

public class MergeSort {
	public static int[] merge(int left[], int [] right) {
		int [] merged = new int[left.length+ right.length];
		int i = 0 , j= 0,k=0;
		while(i<left.length && j<right.length) {
		if(left[i]< right[j]) {
			merged[k] = left[i];
		  i++;
		 k++;
		}else {
			merged[k] = right[j];
			j++;
			k++;
		}
		}
		while(i<left.length) {
			merged[k]= left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			merged[k]= right[j];
			j++;
			k++;
		}

		return merged;
		
	}
	
	//start->0  end -> n-1;
	public static int[] mergeSort(int []arr, int start, int  end) {
         if(start == end) {
        	 int []bca = new int[1];
        	  bca[0] = arr[start];
        	 return bca; 
         }
		int mid = (start+ end)/2;
        int[]left = mergeSort(arr, start, mid );
     	int[]right=mergeSort(arr, mid+1,end);
        int[]combine =merge(left, right);
        return combine;
	}

	public static void main(String[] args) {
		 int[] arr = {6,5,3,1,8,7,2,4};
		for(int e: mergeSort(arr,0,arr.length-1)) {
		  System.out.print(e+ " ");
		
		
		}

	}

}
