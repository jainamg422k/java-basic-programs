package arrayQuestion;
//Sliding Window approach
public class SubArrayProductLessThanKOptimised {
	
    public static void subArrayProduct(int []nums,int k) {
    	
        int left = 0; 
        int right = 0;
        int prod =1;
        int count = 0;
        while(right<nums.length) {
        	prod *= nums[right];
        	while(prod>=k) {
        		prod = prod/nums[left];   
        		left++;
        	}
        	count+=right - left+1;
        	right++;
        }
        System.out.println(count);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,5,2,6};
		int k = 100;
		subArrayProduct(nums, k);
       
	}

}
