package two2DArray;

public class RotateAntiClockwise {

	public static void main(String[] args) {
		int arr [][] = {{ 10,12,14,16},{20,22,24,26},{30,32,34,36},{40,42,44,46} };
		int n =arr.length;
		int m = arr[0].length;
		
      //1st step reverse arary 
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
        //2nd Step Transpose array
        for(int r = 0; r <n;r++) {
     	   for(int c = 0;c<m;c++) {
     		   if(r<c) {
     			   int temp = arr[r][c];
     			   arr[r][c]= arr[c][r];
     			   arr[c][r]= temp;
     		   }
     	   }
        }
        //printing array
        for(int row= 0; row<n;row++) {
        	for(int col= 0;col<arr[row].length; col++) {
        		System.out.print(arr[row][col]+ " ");
        	}
        	System.out.println();
        }

	}

}
