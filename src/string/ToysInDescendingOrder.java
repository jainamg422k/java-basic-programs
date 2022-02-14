package string;

public class ToysInDescendingOrder {
 // ***** INCOMPLETE PROGRAM***** NO FULLY complete
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] toys = {"Kite" ,"Aeroplane","Musical Toy","Rubber Duckey","Mickey Mouse" };
        int n = toys.length;
        int[]arr = new int[n];
        for(int i = 0 ; i< n; i++) {
        	String[] str = toys[i].split(" +");
        	int sum = 0;
        	for(int j = 0 ; j<str.length; j++) {
        		//System.out.println(str[j]);
        		int a = str[j].charAt(0);
        		//System.out.println(a);
        	   sum+= a;
        	}
        	arr[i] = sum;
        }
        for(int i :arr) {
        	System.out.println(i );
        }
	}

}
