package arrayQuestion;

public class ActualArrayReverse {

	 public static void actualReverse(int arr[], int n) {
			
		 int h1 = 0 , h2 =n-1;
		 while(h1<h2) {
		  int temp = arr[h1];
		  arr[h1]=arr[h2];
		  arr[h2]= temp;
		  h1++;
		  h2--;
		 }
			 
		  for ( int i = 0 ; i < n ; i++) {
		      System.out.print(arr[i] + " ");
		  }
	 }

	public static void main(String []args) { 
       int arr []= {1,2,3,4,5};
       int n = arr.length;
       actualReverse(arr,n);

	}

}
