package string;

public class PaindromicSubString {
	public static  boolean isPalindrome(String str) {
	 int l = 0 , r = str.length()-1;
	 while (l<r) {
		 if(str.charAt(l)!= str.charAt(r)) {
			 return false;
		 }
		 l++;
		 r--;
	 }
	 return true;
	}
	     	

	public static void main(String[] args) {
		String str = "nitin";
		int n = str.length();
		for(int si = 0; si<n;si++) {
			for(int ei = si+1 ; ei <=n;ei++) {
		       String pal =  str.substring(si,ei);
		       if(isPalindrome(pal)== true) {
		        System.out.println(pal);
		       }
			}
		}
		
		  //System.out.println((isPalindrome("nitin")));
	}

}
