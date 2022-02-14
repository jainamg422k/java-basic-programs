package javaSession2;

public class searchElementArray {
	public static int searchElement(int []arr, int search) {
		
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i]==search) {
		 	return i;
			}
			
			
			
		}
		return  -1;
	}
   public static void main(String[] args) {
	   int arr [] = {10 ,5 ,3, 9};
	 int  ans =  searchElement(arr, 15);
	 System.out.println(ans);
	   

	
	}

}
