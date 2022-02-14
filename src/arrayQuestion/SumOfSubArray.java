package arrayQuestion;

public class SumOfSubArray {
    public static void subArray(int[]arr,int n) {
    	int maxSum = Integer.MIN_VALUE;
       for(int si = 0 ; si< n; si++) {
    	   int sum = 0;
    	   for(int ei = si; ei< n; ei++) {
    		   sum+=arr[ei];
    		   if(sum >maxSum ) {
    			   maxSum =  sum;
    		   }
    		   System.out.print(si + " "+ ei+ " "+ sum);
    		   System.out.println();
    	   }
    	 
       }
       System.out.println("Maximum sum is"+ maxSum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int n = arr.length;
		subArray(arr, n);
         
	}

}
