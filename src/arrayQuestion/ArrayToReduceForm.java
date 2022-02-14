package arrayQuestion;

import java.util.Arrays;

public class ArrayToReduceForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,10,40,30,20};
		int n = arr.length;
		int [] arrCopy = Arrays.copyOf(arr, n);    //konse arr ki copy or kitni length tk copy bnnai hai
		int []outp = new int[n];
		Arrays.sort(arrCopy);
		//System.out.println(Arrays.toString(arrCopy));
		for(int i= 0; i<arr.length; i++) {
		for(int j =  0; j < arrCopy.length; j++) {
		    if(arr[i] == arrCopy[j]) {
		    	outp[i] = j;
		    	break;
		    }	
		 }	
	   }
		System.out.println(Arrays.toString(outp));

	}

}
