package two2DArray;

public class SpiralArray {

	public static void main(String[] args) {
		int[][] arr= {{11,12,13,14},
					  {21,22,23,24},
					  { 31,32,33,34},
					  {41,42,43,44}} ;
	
	int n= arr.length;
	int m = arr[0].length;
	int sr=0;
	int sc =0;
	int er = n-1;
	int ec =n-1;
	int totalElements = n*m;
	int count =0;
	while(count<totalElements) {
	for(int col = sc;col<=ec;col++) {
		System.out.print(arr[sr][col]+ " ");
		count++;
	}
	sr++;
	 for(int row=sr;row<n;row++) {
		 System.out.print(arr[row][ec]+" ");
		 count++;
	 }
	 ec--;
	 for(int col= ec; col>=sc;col--) {
		 System.out.print(arr[er][col]+ " ");
		 count++;
	 }
	 er--;
	 for(int row = er; row>=sr; row--) {
	 System.out.print(arr[row][sc]+ " ");
	 count++;
	 }
	 sc++;
	}
	}
}
