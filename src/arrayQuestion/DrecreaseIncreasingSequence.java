package arrayQuestion;

public class DrecreaseIncreasingSequence {
    public static void sequence(int[]arr , int n) {
        int curr = 0;
    	for( curr =  0; curr < n-1; curr++) {
    		if(arr[curr] <= arr[curr+1]) {
    		   break;	
    		}
    	}
    for(int i = curr+1 ;i<= n-2; i++ ) {
    	if(arr[i]>= arr[i+1]) {
    		System.out.println("false");
    		return;
    	}
      }
    System.out.println("true");
    }
	public static void main(String[] args) {
   		// TODO Auto-generated method stub
      int[] arr = {8,4,1,4,3};
      int n = arr.length;
      sequence(arr , n);
	}

}
