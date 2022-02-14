package javaSession2;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc = new Scanner (System.in);
		Scanner sc = new Scanner (System.in);
        int binary = 100101;
        int multiplier = 1;
      //  int power = 0;   //for mathpowfunct
        int decimal= 0;
        while(binary>0){
       	 int rem = binary %10;
       	// int value=(int)(rem * Math.pow(2 ,power++)); //using  mthpow funct
       	 int value =  rem * multiplier;
       	 decimal = decimal +value;
       	  // System.out.println(rem);
       	   binary = binary/10;
       	   multiplier =  multiplier * 2;
        
        }
        System.out.println(decimal);
       	 

	}

}
