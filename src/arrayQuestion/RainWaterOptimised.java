package arrayQuestion;

public class RainWaterOptimised {

	public static void main(String[] args) {
		int height[] = {3,1,2,1,4};
		int n = height.length;
		int leftMax[]= new int[n];
		int max = 0;
		for(int curr = 0;curr<n;curr++) {
			if(max<height[curr]) {
				max = height[curr];
			}
		leftMax[curr] = max;
		}
	  
		int rightMax[]= new int[n];
		  max=0;
		for(int curr = n-1; curr >=0;curr--) {
			if( max<height[curr]) {
				max = height[curr];
			}
			rightMax[curr]=max;
		}
		/*
		for(int i=0;i<n;i++) {    //printing arr of leftmax ->  3 3 3 3
			System.out.print(leftMax[i]+ " ");
		}
		*/
		/*
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(rightMax[i]+ " "); //printing array of rightma->4 4 4 4 
		}
		*/
		int ans = 0;
		for(int curr = 0;curr<n;curr++) {
			int min= Math.min(leftMax[curr],rightMax[curr]);
			int waterStored = min - height[curr];
		 ans +=  waterStored ;
		}
		
		System.out.println("Total water stored  "  + ans);
	}

}
