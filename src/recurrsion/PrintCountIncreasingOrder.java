package recurrsion;

public class PrintCountIncreasingOrder {
    public static void count(int n) {
    	if(n ==1) {
    		System.out.println(n);
    		return ;
    	}
    	count(n-1);
    	System.out.println(n);
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		count(n);

	}

}
