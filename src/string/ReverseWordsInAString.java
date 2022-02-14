package string;
/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
 The returned string should only have a single space separating the words. Do not include any extra spaces.
Example1:-
Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

 */
public class ReverseWordsInAString{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="  the  sky   is  blue";
		// to remove the leading and trailing space
		str =str.trim();
		// split the string on the bases of spaces //this return string array so we need to store in string array
		String[] batwara =  str.split(" +");  // this store String array 
		// reverse the batwara
		String ans = "";
		for(int  i  = batwara.length-1; i>0; i--) {
			ans = ans + batwara[i] +" ";
		}
		// 0thnindex string will append last ohterwise trailing space will occur
		ans+=batwara[0];
		System.out.println(ans);
	
	}
	
}



