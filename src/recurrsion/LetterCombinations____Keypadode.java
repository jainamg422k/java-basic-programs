package recurrsion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations____Keypadode {
	
    public static String getString(char cc) {
    	if(cc =='2') {
    		return "abc";
    	}
    	else if(cc =='3') {
    		return "def";
    	}
    	else if(cc =='4') {
    		return "ghi";
    	}
    	else if(cc =='5') {
    		return "jkl";
    	}
    	else if(cc =='6') {
    		return "mno";
    	}
    	else if(cc =='7') {
    		return "pqrs";
    	}
    	else if(cc =='8') {
    		return "tuv";
    	}
    	else if(cc =='9') {
    		return "wxyz";
    	}
    	
    	return " ";
    }
   public static void printCombinations(String inp , String out,List<String>ans){
	   if(inp.length()==0) {
		   ans.add(out);
		   System.out.println(out);
		   return;
	   }
    	char cc0th = inp.charAt(0);
    	String mappedString = getString(cc0th);
    	for(int ci = 0 ; ci < mappedString.length();ci++) {
    		printCombinations(inp.substring(1), out+mappedString.charAt(ci),ans);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> ans = new ArrayList<>();
     printCombinations("23", "",ans);
     System.out.println(ans);
	}

}
