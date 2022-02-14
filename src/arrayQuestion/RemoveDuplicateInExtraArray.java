package arrayQuestion;

public class RemoveDuplicateInExtraArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int []arr = {0,0,1,1,1,2,2,3,4,4};
           int n = arr.length;
           if(n <= 1) {  // if Array contain  only one element
           	return;
           }
           int []out = new int[n];
           int index  = 0 ;
           for(int curr = 0; curr <= n-2; curr++) {
        	    if( arr[curr] != arr[curr+1]) {
        	    	out[index] = arr[curr];
        	    	index++;
        	    }
           }
           out[index] = arr[n-1];
           for(int i = 0; i<=index; i++) {
        	   System.out.println(out[i]);
           }
           
	}
}
