package two2DArray;

public class ZigZagTwoD {

	public static void main(String[] args) {
	int arr [][]= {{11,12,13,14},
			       {21,22,23,24},
	               {31,32,33,34},
	               {41,42,43,44}};
	int n = arr.length;
	int m =arr[0].length;
	for(int row =0;row<n;row++) {
		if(row % 2==0) {
		for(int col= 0;col<m;col++) {
		    System.out.print(arr[row][col]+ " ");	
		}
		}
		else {
		for(int  col = m-1;col>=0;col--) {
			System.out.print(arr[row][col]+" ");
		}
		}
		System.out.println();
	}

	}

}
