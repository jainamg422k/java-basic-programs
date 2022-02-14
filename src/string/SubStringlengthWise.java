package string;

public class SubStringlengthWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str= "123";
    for(int l = 1; l <= str.length(); l++) {
    	for(int si = 0 ; si<= str.length()-l ; si++) {
    	  int ei= si+l;
    	  System.out.println(str.substring(si,ei));
    	  
    	}
    }
	}

}
