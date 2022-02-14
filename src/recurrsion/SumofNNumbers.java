package recurrsion;

public class SumofNNumbers {
	//head recurssion
    public static int sum(int n) {
    	if(n==0) {
    		return 0;
    	}
    	 int ans =n+ sum(n-1);
    	 return ans;
    }
    // tail recurssion
    public static int  sum1(int n , int ans) {
    	if(n==0) {
    	//	System.out.println(ans);
    		return ans;
    	} 
    
          int sum = sum1(n-1 , ans+n);
    	  return  sum;
    }
    
	public static void main(String[] args) {
		int n  =  5;
		int ans = 0;
		  System.out.println(sum(n)); //head recurrsion
		 System.out.println( sum1(n,ans));//tail recurrsion

	}

}
