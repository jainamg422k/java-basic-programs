package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoSortedArray {
	 public static void intersection(int[] a1 , int[] a2) {
		 ArrayList<Integer>ans = new ArrayList<>();
		  
		  int l = 0 , r= 0;
		  while(l < a1.length && r <a2.length) {
		  if(a1[l]< a2[r] ) {
			  l++;
		  }
		  else if(a1[l]>a2[r]) {
			  r++;
		  }
		  else {
			  ans.add(a1[l]);
			  l++;
			  r++;
		  }
		  }
		  /*
		  for(int i = 0; i < ans.size(); i++) {
			  System.out.print(ans.get(i)+ " ");
		  }
	*/	  
		  System.out.println(ans);
	 }

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
	    int [] a1 = new int [n];
	    int [] a2 = new int [m];
	    for(int i = 0; i<n; i++) {
	    	 a1[i]= sc.nextInt();
	    }
	    for(int j = 0; j<m;j++) {
	    	a2[j]= sc.nextInt();
	    }
	    intersection(a1 ,a2);
	    
	    
	}

}
