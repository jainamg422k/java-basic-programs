package recurrsion;

public class FibonacciNumber {
 public static int fibo(int n ) {
	 if(n== 0 || n==1) {
		 return n;
	 }
	 // recursive work
	  int fn1= fibo(n-1);
	  int fn2= fibo(n-2);
	  // my work
	  int ans = fn1 +fn2;
	  // int ans  = fibo(n-1)+fibo(n-2);    // recursive and my work combine; 
	  return ans;
 }
	public static void main(String[] args) {
		 System.out.println(fibo(5));

	}

}
