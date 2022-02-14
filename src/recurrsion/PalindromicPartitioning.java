package recurrsion;
//this is question is same as GenerateAllStringPartition with little modification
public class PalindromicPartitioning {
	 public static boolean isPlaindrome(String str ){
		 int left = 0  , right = str.length()-1;
		 while(left < right) {  
		 if(str.charAt(left) != str.charAt(right)) {
			   return false;
		   }
		 left++;
		 right--;
	 } 
		 return true;
	 }
	public static void partition(String inp ,String outp) {
	     if(inp.length() == 0) {
	    	 System.out.println(outp);
	    	 return;
	     }
		//1St observation if  inp String length  is 3 then 3 recursive calls if len 2 then calls is also 2
		 for(int ci = 0 ; ci<inp.length(); ci++) {      //ci means current Index
		     String parition = inp.substring(0,ci+1);    //outApp means outAppend
		     String leftInp = inp.substring(ci+1);
		     if(isPlaindrome(parition) == true ) {            // if each partition is plaindrome then only make further recursive calls
		    	 partition(leftInp, outp+parition+"|");
		     }
		     
		
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partition("nitin"," ");
	}

}
