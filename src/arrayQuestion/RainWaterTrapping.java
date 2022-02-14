package arrayQuestion;

public class RainWaterTrapping {

	public static void main(String[] args) {
		int height[] = {3,1,2,1,4};
		int n = height.length;
	 	 
		int total =0;
		for(int curr=0;curr<n;curr++) {
			//curr-> means me 
			//index-> 0 to curr-1;->max(left)
			int leftMax = 0;
			for(int prev = 0;  prev<= curr-1;prev++) {
				if(leftMax< height[prev]) {
					leftMax = height[prev];
				}
			}
			//index-> curr+1 to n-1;->max(right)
			int rightMax= 0;
			for(int future  = curr+1; future<=n-1; future++) {
				if(rightMax<height[future]) {
					rightMax = height[future];
				}
			}
			int min = Math.min(leftMax, rightMax);
			//apni height minus
			int waterStored = min - height[curr];
			//System.out.print(waterStored + "  ");
			if(waterStored<0) {
				waterStored =0;
			}
			total+=waterStored;
			System.out.println(waterStored);
			
		}
		
  System.out.println("total water Stored = "+ total);
	}

}
