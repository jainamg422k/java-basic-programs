 package arrayQuestion;

public class ProductOfArrayOptimised {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n = arr.length;
		int leftproduct[]= new int [n];
		int rightproduct[]=new int [n];
			
	        leftproduct[0]=1;
            rightproduct[n-1] = 1;
	    for(int curr =1;curr< n;curr++) {
	    	leftproduct[curr]= leftproduct[curr-1]*arr[curr-1];
	    }
		
      for(int curr= n-2;  curr>=0; curr-- ) {
    	  rightproduct[curr]= rightproduct[curr+1]*arr[curr+1];
      }
//      for(int i = 0;i<n;i++) {
//    	  System.out.print(leftproduct[i]+ " ");
//      }
//      System.out.println();  // both loop is for pritning leftmost and rightmost element  
//      for(int i = 0;i<n ;i++) {
//    	   System.out.print(rightproduct[i]+ " ");
//      }
       int ans[]= new int [n];   //storing ans in array
       for(int i = 0; i<n ; i++) {
    	    ans[i]= leftproduct[i]*rightproduct[i];
    	    System.out.print(ans[i]+ " ");
       }
     
	}

}
