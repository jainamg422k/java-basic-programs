package javaSession2;

import java.util.Scanner;

public class AnytoAny {

	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   int n = sc.nextInt();
	   int src=8;
	   int desti =2;
	   int multiplier =1;
	   int decimal=0;
	   int bin = 0;
	   while(n>0) {
		   int rem= n%10;
		   int values =rem * multiplier;
		    decimal = decimal+values;
		 //  System.out.println(rem);
		   multiplier = multiplier* 8;
		   n =n/10;
	   }
	//   System.out.println(decimal);
	   // part2 base 10 to base2
	   int binary = 0;
	   multiplier = 1; //reintialzation;
	   while(decimal>0) {
		   int rem = decimal%2;
		   decimal=  decimal/2;
		   int value = rem*multiplier;
		   binary= binary+value;
		   multiplier = multiplier*10;
	   }
		  System.err.println(binary);
		   
        
	}

}
