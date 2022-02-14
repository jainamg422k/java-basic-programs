  package arrayQuestion;

public class GenerateSubArray {
	public static void subArray(int arr[],int n) {
		int maxSum  = Integer.MIN_VALUE;
		for (int si = 0; si<  n ; si++) {
			for(int ei =si; ei < n;ei++ ) {
				int sum = 0;
				for (int k =si; k <=ei;k++) { // [0,2]-> {1,2,3}
					sum+=  arr[k];
					System.out.print(arr[k]+ " ");
				
				}
				if(sum> maxSum) {
					maxSum = sum;
				}
				System.out.print(" sum is "+ sum);
				System.out.println();
 			}
		}
		System.out.println("maxsum sum "+ maxSum);
	}
	public static void main(String []args) {
		 int arr[] = {1,2,3,4,} ;
		 int n = arr.length;
		
		 subArray(arr,n);
	} 
}
