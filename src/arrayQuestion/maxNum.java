package arrayQuestion;

import java.util.Scanner;

public class maxNum {
	public static void maxNum(int arr[],int n1) {
		int maxValue = Integer.MIN_VALUE;
		for(int curr = 0; curr < n1; curr++ ) {
			if (arr[curr]> maxValue) {
				maxValue = arr[curr];
			}
		}
	System.out.println(maxValue);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();         //Size of array
		int arr []= new int[n];
		int n1 = arr.length;
		for (int i = 0; i<n;i++) {
			arr[i]= sc.nextInt();     //Puting Values in array
		}
	    maxNum (arr,n1);
}
}