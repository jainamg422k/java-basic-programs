package javaSession2;

public class minValueInArray {

	public static int minInArray (int arr[]) {
		int minValue = Integer.MAX_VALUE;
		for(int index = 0 ; index < arr.length;index++) {
			if(arr[index]< minValue) {
				minValue = arr[index];
			}
		}
		return minValue;
	} 
	public static void main(String []args) { 
	int arr [] = {10,5,3,9};
	 int ans =minInArray(arr);
     System.err.println(ans );	
	}

}
