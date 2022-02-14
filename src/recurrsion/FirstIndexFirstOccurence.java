package recurrsion;

public class FirstIndexFirstOccurence {
	
   public static int  firstOcc(int [] arr, int ci,int n, int search) {
	   // base case
	   if(ci == n) {
		   return -1;
	   }
	   //my work   
	   if(arr[ci]== search) {
	    	 return ci;
	     }
	   //recurrsive work
	    int  recAns =firstOcc (arr,  ci+1, n , search);
	     return recAns;
	    
   }

    
	public static void main(String[] args) {
	
	 int []arr = {3,4,5,6,7,5,7 };
	 int n = arr.length;
		int ci = 0;
		int search = 5;
	 System.out.println(firstOcc(arr, ci, n, search));

	}

}
