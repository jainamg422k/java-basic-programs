package recurrsion;

public class IncreasingDecreasingOrder {
    public static void count(int n) {
    	if(n==0) {
    		return ;
    	}
    	System.out.println(n);
    	count(n-1);
    	System.out.println(n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        count(n);
	}

}
