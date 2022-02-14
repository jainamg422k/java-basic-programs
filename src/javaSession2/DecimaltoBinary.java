package javaSession2;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int deci = 37;
	        int multiplier = 1;     // if use mathpow mult = 0
	        int bin =0;
	         while( deci > 0) {
	      	   int rem = deci % 2;
	      	   // int value =   (int)  (rem * Math.pow(10, multiplier++));
	      	    int value =    rem * multiplier;

	      	     bin = bin  + value; 		
	      	   // System.out.println(rem);
	      	    deci = deci/2;
	      	   multiplier = multiplier * 10;
	      	    
	        }
	    		System.out.println(bin);  
	      		  
	}

}
