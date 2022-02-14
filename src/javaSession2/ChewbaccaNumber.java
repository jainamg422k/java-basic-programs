package javaSession2;

import java.util.Scanner;

public class ChewbaccaNumber {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
     	long ans = 0;
     	long multiplier =1;
     	
        while(n>0) {
        	long t = n%10;
           
        
           if ((9-t) <t && n/10>0) {
        	  t = 9-t;
           }
           if ((9-t)<t && n/10 ==0 && !(t==9)) {  
            t = 9-t;
        	}
           ans =ans+ t *multiplier;
           multiplier*=10;
        	n = n/10;
        }
        System.out.println(ans);
	}
}
