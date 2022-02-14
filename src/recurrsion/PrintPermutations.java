package recurrsion;

public class PrintPermutations {
    public static void  printPerm(String inp , String prem ) {
    	//2nd Observation if input String length == 0 then we got 1 Permutations
    	if(inp.length() == 0) {
    		System.out.println(prem);
    		return;
    	}
    	//1st Observation  -> number rec calls == length of String
    	for(int ci = 0; ci< inp.length(); ci++) {
    		 char cith = inp.charAt(ci);
    		//3r observation = what string to pass to next recursive calls take out that String
    		String leftInp = inp.substring(0 , ci)+inp.substring(ci+1);
    	 printPerm(leftInp, prem+ cith);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     printPerm("abc", "");
	}

}
