package recurrsion;

public class GenerateValidParentheses {
	
    public static void generateParentheses(String comb , int n,int oc,int cc) {
    	 if(oc == n && cc==n) {
    		 System.out.println(comb);
    		 return;
    	 }
    	if(oc< n) {
    	    // put open bracket
    		generateParentheses(comb +"(", n, oc+1, cc);
    	}
    	if(oc> cc) {
    		// put close bracket 
    		generateParentheses(comb + ')', n, oc, cc+1);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 2;
       int oc = 0; // count of open parentheses
       int cc = 0; // count of close parentheses
       String comb = ""; // we need to add bracket to fill up space
	  generateParentheses(comb , n,oc,cc);
	}

}
