package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr []= {9,2,7,5,8};
		  int n = arr.length;
		
		  for(int marker =0;marker < n-1; marker++) {
			  int minValue = Integer.MAX_VALUE;
			  int minIndex = -1;
			  for(int curr = marker;curr<n;curr++) {
				  if (arr[curr]<minValue) {
					  minValue = arr[curr];
					  minIndex = curr;
				  }
			  }
			  int temp = arr[marker];
			  arr[marker]= arr[minIndex];
			  arr[minIndex]= temp;
			//  System.out.println(minValue);
		  }
	     for(int i =  0;  i< n; i++) {
	    	 System.out.print(arr[i] + " ");
	     }
	}

}


/*
user input 
Scanner sc = new Scanner(System.in);
int n =  sc.nextInt();
int arr[] = new int[n];
for(int i = 0; i<n;i++) {
	arr[i]= sc.nextInt();
	//System.out.println( arr[i]+ " ");
}
for(int marker =0;marker < n-1;marker++) {
   int minvalue = Integer.MAX_VALUE;
   int minIndex= -1;
   for(int curr= marker; curr<n-1;curr++) {
	   if(arr[curr]<minvalue) {
		   minvalue = arr[curr];
		   minIndex =curr;
	   }
   }
   int temp =arr[marker];
   arr[marker]= arr[minIndex];
  arr[minIndex] = temp;
}
for(int i = 0; i<n;i++) {
   System.out.println(arr[i]);
}
} 
}
*/


