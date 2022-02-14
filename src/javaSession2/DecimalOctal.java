package javaSession2;

import java.util.Scanner;

public class DecimalOctal {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter Src Base");
		int srcB= sc.nextInt();
	 System.out.println("Enter decimal base");
	   int deciB = sc.nextInt();
		System.out.println("Enter destiBase");
		int destiB= sc.nextInt();
	  System.out.println(" Enter srcNum");
		int srcNum = sc.nextInt();
		int multiplier= 1;
		int decimalNum= 0;
     //Part1 any to decimal
        while(srcNum>0) {
	    	int rem = srcNum%deciB;
	        int value = rem * multiplier;
	         decimalNum = decimalNum +value;
	    //	System.out.println(rem);
	    	  srcNum = srcNum/deciB;
	    	  multiplier = multiplier * srcB;  
	    }
      //  System.out.println(decimalNum);
        //part2 decimal to any
        multiplier =1;
        int destiNum = 0; 
	    while(decimalNum>0) {
	    	int rem = decimalNum%destiB;
	    	int value = rem * multiplier;
	    	 destiNum = destiNum+value;
	    	//System.out.println(rem);
	    	multiplier = multiplier * deciB;
	    	decimalNum = decimalNum/destiB;
	    }
	    System.out.println(destiNum);
	}

}
