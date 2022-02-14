package two2DArray;

public class RowReverse {

	public static void main(String[] args) {
		int arr [][] = {{ 10,12,14,16},{20,22,24,26},{30,32,34,36},{40,42,44,46} };
		int n =arr.length;
		int m = arr[0].length;
		
       
        for(int row= 0;row<n;row++) {
        	 int left =0 , right = m-1;
        while(left<right){
        int temp = arr[row][left];
        arr[row][left]= arr[row][right];
        arr[row][right]= temp;
        left++;
        right--;
        }
        }
        for(int row= 0; row<n;row++) {
        	for(int col= 0;col<arr[row].length; col++) {
        		System.out.print(arr[row][col]+ " ");
        	}
        	System.out.println();
        }
	}
}
	

