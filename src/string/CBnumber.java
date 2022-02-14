package string;
//1step -> Sari subString nikale(increasing order of length)
//2step ->check every subString
         // 1. kya CB number
        //  2. kya uska part kuch visited hai

public class CBnumber {
	public static  boolean isvisted(boolean[]vist,int siI ,int eiE) {  //siInclusive ,eiExclusive
		for(int i = siI; i< eiE; i++) {
			 if(vist[i]== true) {
				 return true;
			 }
		}
		return false;
	}
    public static boolean isCBNUmber(String str) {
    
      long subStrLong = Long.valueOf(str);  // fun to convert string to int
      if(subStrLong == 0 || subStrLong == 1) {
    	  return false;
      }
      long[]arr = {2,3,5,7,11,13,17,19,23,29};
      for(long e:arr) {
    	  if(subStrLong == e) {
    		  return true;
    	  }
      }
      for(long e:arr) {
    	  if(subStrLong % e ==0) {
    		  return false;
    	  }
      }
      return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str= "123";
	
	    boolean[] vist =new boolean[str.length()];
	    int count =0;
	    for(int l = 1; l <= str.length(); l++) {
	    	for(int si = 0 ; si<= str.length()-l ; si++) {
	    	  int ei= si+l;
	    	String subStr =  str.substring(si,ei);
	    	  if(isCBNUmber(subStr)== true && isvisted(vist, si, ei)==false) {
	    		  count++;
           for(int i = si ; i<ei; i++) {
        	   vist[i] = true;
           }
	    	  }
	    	}
	    }
	    System.out.println(count);

	}

}
