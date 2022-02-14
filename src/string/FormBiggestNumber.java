package string;

public class FormBiggestNumber {
	// +ve return swaping  hogi
	//-ve return swapping nahi hogi
    public static int compare(int curr ,int curr_1) {// curr->x  curr+1-> y
    	String  xy  = curr + ""+curr_1;  // curr+curr+1 this will consider as int value so for that use ""
    	String yx  = curr_1 + ""+ curr;
    	int xyI = Integer.valueOf(xy);   // convert string to int
    	int yxI = Integer.valueOf(yx);   //converting String to int
        if(xyI>yxI) {
        	return -1;
        }
        else {
        	return 1;
        }
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {54,546,548,60};
	      int n = arr.length;
	      for(int cp =1; cp <= n-1; cp++) {
	    	  for (int curr = 0;curr <=n-cp-1; curr++) {
	    		  if (compare(arr[curr], arr[curr+1])>0) {
	    			  int temp = arr[curr];
	    			  arr[curr]= arr[curr+1];
	    			  arr[curr+1] = temp;
	    					  
	    		  }
	    		  
	    	  }
	      }
	      for(int i=0 ; i<n; i++) {
	    	  System.out.print(arr[i]);
	      }

	}

}
