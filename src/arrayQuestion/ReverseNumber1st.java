package arrayQuestion;

public class ReverseNumber1st {

	public static void reverseArray(int arr[],int n) {
     int curr = n-1;
     while(curr>=0) {
    	 System.out.print(arr[curr]+ " ");
       curr--;
     }
	}
	public static void main(String []args) { 
	int arr [] = { 1,2,3,4,5};
	int n = arr.length;
	reverseArray(arr, n );
	}

}
