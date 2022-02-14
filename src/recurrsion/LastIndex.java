package recurrsion;

public class LastIndex {
	public static int lastOcc(int []arr, int n , int ci,int search) {
	  //base class
		if( ci<0) {
		return -1;  
	  } 
		// mywork
       if(arr[ci]== search) {
    	   return ci;
       }
       //recurrsion
       int recAns = lastOcc(arr, n,ci-1,search);
         return recAns;
	  }
	public static void main(String[] args) {
		int []arr = {3,4,5,6,5,7 };
		int  n = arr.length;
		int  search = 5;
		int ci = n-1;
		System.out.println(lastOcc(arr,n, ci,search));
	   

	}

}
