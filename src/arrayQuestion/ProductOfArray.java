 package arrayQuestion;

public class ProductOfArray {

	public static void main(String[] args) {
	  int num[] = {2,2,3,4}; 
	  int n = num.length;
	  for(int curr = 0; curr<n;curr++) {
		  int product1 = 1;     //prdouct cant be zero becacuse  0* anything is always x
		  for(int prev = 0; prev <= curr-1;prev++) {
			  product1*= num[prev];
		  }
		  
		   int product2 = 1;
		 for(int future = curr+1; future <=n-1;future++) {
			   product2*=num[future];
		 }
		int  product = product1 * product2; 
		System.out.print(product+ " ");
		
	  }
	}
}

