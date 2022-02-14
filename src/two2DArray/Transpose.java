package two2DArray;

public class Transpose {

	public static void main(String[] args) {
		int inp [][] = {{ 10,12,14,16},
				        {20,22,24,26},
				        {30,32,34,36},
				        {40,42,44,46},
                         {50,52,54,56}};
	  int	n = inp.length;
	  int   m = inp[0].length;
	  int outp[] [] = new int[m][n];
	  
	  for(int row= 0; row<m;row++) {
      	for(int col= 0;col<n; col++) {
      	   outp[row][col]= inp[col][row];
      	}
	  }
	  for(int row= 0; row<m;row++) {
      	for(int col= 0;col<outp[row].length; col++) {
      		System.out.print(outp[row][col]+ " ");
      	}
      	System.out.println();
	  }

	}
}
