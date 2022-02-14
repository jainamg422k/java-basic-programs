package recurrsion;

public class power {
	//2ndApproch with head recurrsion means we take break conditon directly with Zero
	public static int power2(int x , int n) {
		if(n== 0) {
			return 1;
		}	
	    int recAns = power2(x,n-1);
	     return x*recAns;
		}
	//head recurrsion  // here we take  0 as a special case
	public static int pow(int x ,int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return x;
		}
		//recur
		  int recans =  pow(x,n-1);
		//mera
		int   myans = x* recans;
		  return myans;
	}
	// tail recurrsion
	public static void power (int x, int n, int ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		 power(x , n-1, ans *x);
	}

	public static void main(String[] args) {
		//System.out.println(pow(2,3));
		System.out.println(power2(2,3));
		 power( 2 , 3, 1);
		
	}

}
