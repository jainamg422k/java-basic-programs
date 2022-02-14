package arrayQuestion;

public class maxSubArraysumOptimized {
	public static void subArray(int arr[],int n) {
		int maxSum  = Integer.MIN_VALUE;
		int maxSumStart = 0 , maxSumEnd = 0; 
		for (int si = 0; si<  n ; si++) {
			int sum =0;
		
			for(int ei =si; ei < n;ei++ ) {
				 sum = sum +arr[ei];
				 if(sum>maxSum) {
					 maxSumStart = si;
					 maxSumEnd = ei;
					 maxSum = sum;
				 }
				 System.out.println(si + " "+ ei + "  " + sum);
				
 			}
		}
		System.out.println("maxsum sum "+ maxSum+ " "+ "maxSumStart"+ maxSumStart+ "maxSumEnd"+ maxSumEnd);
	}
	public static void main(String []args) {
		 int arr[] = {1,2,3,4,} ;
		 int n = arr.length;
		
		 subArray(arr,n);
}
}