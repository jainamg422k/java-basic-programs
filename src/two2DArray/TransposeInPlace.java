package two2DArray;

public class TransposeInPlace {

	public static void main(String[] args) {
		int inp [][] = {{ 10,12,14,16},
		        {20,22,24,26},
		        {30,32,34,36},
		        {40,42,44,46},
                };
int	n = inp.length;
int   m = inp[0].length;
   for(int r = 0; r <n;r++) {
	   for(int c = 0;c<m;c++) {
		   if(r<c) {
			   int temp = inp[r][c];
			   inp[r][c]= inp[c][r];
			   inp[c][r]= temp;
		   }
	   }
   } 
	   for(int row= 0; row<n;row++) {
	      	for(int col= 0;col<m; col++) {
	      		System.out.print(inp[row][col]+ " ");
	      	}
	      	System.out.println();
		  }   
   

	}

}
