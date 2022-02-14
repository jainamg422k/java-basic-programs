package string;

public class JumblesApproach1 {
   public static boolean solution(String str1 , String str2) {
	   // Making freq array of both string
	   // frequency array is array in which we assume  that each index point to a particular character for eg a pointing to 0 b is pointing to 1 
	   int [] freqS1 = new int[26];
	   int [] freqS2 = new int[26];
	   // extracting each char and doing +1 at that particular index (for eg: h-a = 7 i.e.104-97)and we will do 7th index pointing to h will increment 
	   for(int i = 0; i<str1.length(); i++) {
		   char cc = str1.charAt(i);
		   int index = cc -'a';
		   freqS1[index]++;
	   }                                             // we can aslo take single loop for both str1 and str2 arry because both length will be same then only we have to chck  true or false
	   for(int i =0 ; i< str2.length(); i++) {
		   char cc = str2.charAt(i);
		   int index = cc -'a';
		   freqS2[index]++;
	   }
	   //compare both the array if each index store same value so jumbles is possible else not
	   for(int i =  0 ; i< freqS1.length; i++) {
		   if(freqS1[i]!= freqS2[i]) {
			   return false;
		   }
	   }
	   return true;
	   // this just printing whole aaray no use
	   /*
	  for(int i: freqS1) {
		  System.out.print(i +" " );
	  }
	  System.out.println();
	  for(int i: freqS2) {
		  System.out.print(i+" ");
	  }
	  */
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hollew";
		boolean ans =solution(str1 ,str2);
		System.out.println(ans);
		
	}

}
