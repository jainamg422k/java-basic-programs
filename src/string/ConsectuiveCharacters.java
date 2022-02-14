package string;

public class ConsectuiveCharacters {
// QUESTION ->
//The power of the string is the maximum length of a non-empty substring that contains only one unique character.
//Given a string s, return the power of s.
	/*
	Input: s = "leetcode"
	Output: 2
    Explanation: The substring "ee" is of length 2 with the character 'e' only.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbccceeefeeeeddeesedddeeeedddddddrfdrf";
		int prev = 0;
		int count = 1;
		int  maxlength = 1;
		for(int curr = prev+1; curr < str.length();curr++) {
			 if(str.charAt(prev)== str.charAt(curr)) {
				  count++;
				  if(maxlength < count) {
					  maxlength = count;
				  }
			 }
			 else {
				 prev = curr;
				 count = 1;
			 }
		}
System.out.println(maxlength);
	}

}
