package arrayQuestion;
//leetcode Question
//https://leetcode.com/problems/richest-customer-wealth/
public class CustomerWealth {
	
    public static int maximumWealth(int[][]accounts) {
    
    	int max = 0;
    for(int i = 0; i< accounts.length;i++) {
    	int count = 0; 
    	 for(int j = 0; j<accounts[i].length;j++) {
              count+=accounts[i][j];
         
      } 
    	 if(max<count) {
    		 max = count;
    	 }
    }    	
    
  return max;      
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][]accounts = {{1,2,3},{3,2,1}};
      System.out.println(  maximumWealth(accounts));
	}

}
