package string;

import java.util.Scanner;

public class checkPalindrome {
	public static  boolean isPalindrome(String str) {
	int 	l = 0,  r = str.length()-1;
	 while(l < r) {
		 if(str.charAt(l)!= str.charAt(r)) {
			 return false;
		 }
		l++;
		r--;
	 }
	return true;	
	}

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   /*
   String str = sc.nextLine();
   boolean ans = isPalindrome(str); 
	System.out.println(ans);  
	*/
   System.out.println(isPalindrome(sc.nextLine()));      //taking input form user
	//System.out.println(true);
	}

}
