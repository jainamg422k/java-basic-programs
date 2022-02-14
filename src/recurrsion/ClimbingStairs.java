package recurrsion;

public class ClimbingStairs {
    // here  n Stands for no. of stairs
	// cStep is stand for current Step
	public static int climbStaris(int n , int cStep) {
		if(cStep== n) {
			return 1; // got 1way to reach top
		}
		if(cStep> n) {
			return 0; 
		}
		//two recursive work 1Jump and 2 Jump  
		int c1 = climbStaris( n ,  cStep+1);
        int c2 = climbStaris( n ,  cStep+2);
        //total ways is choice1+choice2
        return c1 +c2;
	} 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int ways = climbStaris(4, 0);
         System.out.println("Total no. ways  to reach top is : "+ ways);
	}

}
