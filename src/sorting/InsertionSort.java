package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {9,2,7,5,8};
		int n = arr.length;
		for(int curr = 1; curr<n;curr++) {
			int currCard = arr[curr];
			int prevIndex = curr-1;
			while(prevIndex>=0 && currCard<arr[prevIndex]) {
				arr[prevIndex+1] = arr[prevIndex];
				prevIndex--;
			}
			arr[prevIndex+1]= currCard;
		}
		for(int i =0; i< n;i++ ) {
			System.out.print(arr[i]+ " ");
		}
		/*
		 //Taking input form user
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for(int i = 0; i<n; i++) {
		   arr[i]= sc.nextInt();
		}
		
	
		for(int curr = 1; curr<n; curr++) {
			int temp = arr[curr];
			int prevI = curr-1;
			while(prevI>=0 && arr[prevI]>temp) {
				arr[prevI+1]= arr[prevI];
				prevI--;
			}
			arr[prevI+1]= temp;
		}
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
*/
	}

}
