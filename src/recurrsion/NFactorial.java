package recurrsion;

public class NFactorial {
	// ans  building while stack is poping out
     public static int fact(int n) {
    	 if(n==0 || n==1) {
    		 return 1;
    	 }
    	 
    	 return n*fact(n-1);
     }
     // ans  building while stack is building
     public static void fact2(int n, int  ans) {
    	 if(n==0 || n==1) {
    		 System.out.println(ans);
    		 return ;
    	 }
    	       fact2(n-1, ans*n);   //here n*ans this statement execute first then function is called
    	        return;   // if we not put return here complier automatic do return
     }
	public static void main(String[] args) {
	//	System.out.println(fact(5)); // this is for fact  function
		int n = 3;
		int ans = 1;
	   fact2(n,ans);

	}

}
