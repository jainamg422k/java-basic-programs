package dsa;

import java.util.Arrays;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][4];
		
         for(int[] i : arr ) {
        	 System.out.println(Arrays.toString(i));
         }
         System.out.println("next");
         for(int i  =0;  i< arr.length;i++) {
        	 System.out.println(Arrays.toString(arr[i ]));
         }
         //System.out.println(Arrays.toString(arr));
	}

}
