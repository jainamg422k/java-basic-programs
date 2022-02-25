package binarySerach;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[]letters,char target) {
    	 int start = 0 , end = letters.length-1;
    	 /*
    	  // this is optional if we take letters[start] in last so we need this condition also to handle char which is last index or not in array
    	 if(target>= letters[letters.length-1]) {
    		 return letters[0];
    	 }
    	 */
    	 while(start<= end) {
    		 int mid = (start+end)/2;
    		 if(target< letters[mid]) {
    			 end = mid -1;
    		 }
    		 else {
    			 start = mid+1;
    		 }
    	 }
    	
    	 return letters[start%letters.length];  // (we can aslo write letters[start] but for that we need one more conditon that is in line 6-7)
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char [] letters = {'c','d','f','j'};
        char target ='f';
      System.out.println(  nextGreatestLetter(letters,target));
	}

}
