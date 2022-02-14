package arrayQuestion;

public class Roatate1{
	
	 public static void actualReverse(int arr[],int start, int n) {
			
		 int h1 = start , h2 =n-1;
		 while(h1<h2) {
		  int temp = arr[h1];
		  arr[h1]=arr[h2];
		  arr[h2]= temp;
		  h1++;
		  h2--;
		 }
		 }
	  public static void rotate2(int arr[],int n , int k ){
		   k =k %n;
		   actualReverse(arr,0 , n);
		   actualReverse(arr,0 , k);
		   actualReverse(arr, k, n);
		
		  
	  }
	
//	  public static void rotate1(int arr[],int n , int k ){
//		  //pickj last  Element
//		  k = k%n; //this is optimized step
//		  for(int i =0; i<k; i++ ) {
//		  int pick = arr[n-1];
//		  for (int curr = n-2; curr>=0; curr--) {
//			  arr[curr+1]=  arr[curr];
//		  }
//		  arr[0]= pick;
//		  }
		
		  
	 // }

	public static void main(String[] args) {
     int arr[]  =  {1 ,2 ,3,4 ,5,6,7                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               };
     int n = arr.length;
     int  k = 3;
   //  actualReverse(arr,n)
     rotate2( arr, n ,k);
    
     for (int i =0; i<n;i++) {
		  System.out.print(arr[i] + " ");
		  }
	}
	 
}
