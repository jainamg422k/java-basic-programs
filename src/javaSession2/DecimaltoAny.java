package javaSession2;

import java.util.Scanner;

public class DecimaltoAny {

	public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
          int num = sc.nextInt();
          int destib = sc.nextInt(); //k
          int multiplier =1;
          int destin =0;
          int digit =0;
          while(num > 0) {
        	  int rem = num % destib;
        	  int value = rem * multiplier;
        	   destin= destin+value;
        	   
        	  System.out.println(rem);
        	  multiplier = multiplier * 10;
        	  num =num/destib;
        	  
        	  
          }
          
        
         System.out.println(destin);
         while(destin > 0) {
          int rem1 = destin%10; 
          digit = digit +rem1;
           destin = destin/10;
         }
         System.out.println(digit);

	}

}
