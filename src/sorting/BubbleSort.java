package sorting;

public class BubbleSort {

	public static void main(String[] args) {
      int arr[]= {30,50,40,1};
      int n = arr.length;
      for(int cp =0; cp < n-1; cp++) {
    	  for (int curr = 0;curr <n-cp; curr++) {
    		  if (arr [curr]> arr[curr+1]) {
    			  int temp = arr[curr];
    			  arr[curr]= arr[curr+1];
    			  arr[curr+1] = temp;
    					  
    		  }
    		  
    	  }
      }
      for(int i=0 ; i<n; i++) {
    	  System.out.print(arr[i]+ " ");
      }

	}

}
