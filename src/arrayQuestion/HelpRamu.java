package arrayQuestion;

import java.util.Scanner;

public class HelpRamu {
    public static int minAmount(int c1 , int c2,int c3,int c4, int[]freqR,int []freqC) {
         int totalR = 0; 	
    	for(int i = 0 ; i<freqR.length; i++) {
    		int ridesI = freqR[i];
    		totalR +=Math.min(ridesI *c1,c2);
    	}
    	totalR =Math.min(totalR, c3);
    	int totalC = 0;
    	for(int i = 0 ; i< freqC.length; i++) {
    		int rideI  = freqC[i];
    		  totalC += Math.min(rideI*c1, c2);
    	}
    	totalC = Math.min(totalC,c3);
    	int totalBoth = totalR + totalC ;
    	int total  = Math.min(totalBoth, c4);
    	return total;
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt(); //number of testcases
	while(tc>0) {
		int c1= sc.nextInt(); //1 rickshaw ya cab pr 1 ride
		int c2 = sc.nextInt(); // 1rick ya cab pr unlimited ride
		int c3 = sc.nextInt(); // unlimted rickshaw  or unlimited cab pr unlimited rides
		int c4 = sc.nextInt();//  unlimted rickshaw  and unlimited cab pr unlimited rides
		
		int noR  = sc.nextInt();  //no of rickshaw
		int noC  = sc.nextInt();  //no.of cab
		 int [] freqR = new int[noR];
		 int [] freqC = new int[noC];
		 for(int i = 0 ; i< noR; i++) {
			 freqR[i] = sc.nextInt();  //ith rick par kitni ride
		 }
		 for (int i = 0; i < noC; i++) {
			freqC[i] = sc.nextInt();  //ith cab par kitni ride
		}
		int total=  minAmount(c1, c2, c3, c4, freqR, freqC);
		System.out.println(total);
		tc--; 
 	}
	

	}

}
