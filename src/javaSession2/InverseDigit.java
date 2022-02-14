package javaSession2;

import java.util.Scanner;

public class InverseDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int invNum = 0;
		 int place = 1;
		 while (num>0) {
			 int digit = num % 10;
			// System.out.println( place +  " " +  digit);
			 int invPlace = digit;
			 int invDigit = place;
			 invNum = (int)(invNum + invDigit * Math.pow(10, invPlace - 1));
			// System.out.println(invPlace +  " "  + invDigit);
			 num = num/10;
			 place++;
			   
		 }
     
		 
		  System.out.println(invNum);
	}

}
