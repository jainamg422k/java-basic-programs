package string;
// if the whole array is 0 then ans is true means we can create same string as of other else not 
// not require two array
public class JumblesApproach2 {
   public static boolean solution(String str1 , String str2) {
	   int[] freq = new int[26];
	   if(str1.length()!= str2.length()) {
		   return false;
	   }
	   //if both string length is same so we can take any one String length for loop
	   for(int i = 0; i< str1.length();i++) {
		    char cc1 = str1.charAt(i);
		   int index1 = cc1 - 'a';
		   freq[index1]++;
		   
		   char cc2 = str2.charAt(i);
		   int index2 = cc2 -'a';
		   freq[index2]--;
	   }
	    for(int e : freq) {
	    	if(e != 0) {
	    		return false;
	    	}
	    }
	    return true;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="hello";
        String str2 = "holle";
       boolean ans = solution(str1 , str2);
       System.out.println(ans);
	}

}
