package arrayQuestion;

public class MajorityElementOptimised {

	public static void main(String[] args) {
     	// 4th Approach
        //Boyer Mooore Majority voting Algorithm 
		int [] arr = {2,2,1,1,1,2,2};
		int n  = arr.length;
		int candidate = arr[0];
		int count = 1; 
		for(int curr = 1; curr<n; curr++) {
			if(count == 0) {
				candidate = arr[curr];
				count=1;
			}
			else if(arr[curr]== candidate) {
				 count++;
			 }
			else{              //candidate != arr[curr]
				 count--;
			 }
			 
		}
		System.out.println(candidate );
		
	}

}
