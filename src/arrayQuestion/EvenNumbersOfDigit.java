package arrayQuestion;

import java.util.Scanner;

public class EvenNumbersOfDigit {
	/*
	Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
	 */
    public static int seprateDigit(int[]arr) {
    	int digit = 0;
    	 for(int curr = 0 ; curr < arr.length; curr++) {
    		  int count =0;
    		  while(arr[curr]>0) {
    			  count++;
    			    arr[curr]/=10;
    		  }
    		  
    		  if(count %2 == 0) {
    			  digit++;
    		  }
    	 }
    	return digit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
          int[] arr = new int[size];
          for(int i = 0 ; i< arr.length; i++) {
        	  arr[i]= sc.nextInt();
          }
         System.out.println( seprateDigit(arr));
	}

}
