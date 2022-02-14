package arrayQuestion;
import java.util.Scanner;

public class RemoveDuplicationInSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         int n = sc.nextInt(); 
		int[]arr =  new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] =sc.nextInt();
		}
		int index = 0;
		for( int curr = 0; curr <= n-2; curr++ ) {
			 if(arr[curr] != arr[curr+1]) {
				 arr[index] = arr[curr];
				 index++;
			 }
		}
		arr[index] = arr[n-1];
          for(int i = 0 ; i<= index; i++) {
        	  System.out.println(arr[i]);
          }
         
	}

}
