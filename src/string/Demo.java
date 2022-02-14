package string;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
     String aHouse ="antilla";
     String bHouse = "antilla";
     //System.out.println(aHouse == bHouse); // In this both are pointing to same addresses (ans:- true)
 //    String aHouse = new String("antilla");// this is not possible with same variable name
     //String bHouse = new String("antilla");
     System.out.println(aHouse == bHouse); // this store in different addresses(ans:- false)
     System.out.println("antilla"=="antilla"); //true;
     System.out.println(bHouse.equals(aHouse));
     */
	//STRING FUNCTIONS
		String str ="Hello";
		//length
		System.out.println(str.length());
		//indexof
      System.out.println(str.indexOf('o')); // index of character (ans:4) 
      //Index of Duplicate  firstOccurence-> indexOf
      System.out.println(str.indexOf('l')); // (if we have duplicate char this will get first occurence eg;l
      										//index of character 'l' (ans:2))
    //Index of Duplicate  lastOccurence-> lastindexOf
      System.out.println(str.lastIndexOf('l'));
      //startsWith
      System.out.println(str.startsWith("He")); //true
      System.out.println(str.startsWith("he")); //false // because everything is case sensitive
      //endsWith
      System.out.println(str.endsWith("lo"));//true
      System.out.println(str.endsWith("Lo"));//false
      //concat /+  -> Both are costly
      str.concat("o");
      // string are immutable so orginal string cannot change str pointing to hello
      System.out.println(str); // Hello 
      //now  str pointing to  new concat 
      str = str.concat("o");
      System.out.println(str);// Helloo
      //replace
      // this function is use to replace old char to new char 
      str.replace("o", "L"); // no change in current String
      System.out.println(str); // Heloo
      str =str.replace("o", "L"); //  change in  String new string generated and str to that
      System.out.println(str); // HelLL
      //substring
      String str1 = "kartik";
      System.out.println(str1.substring(1 , 4)); // art starting index Inclusive and ending index exclusive
      System.out.println(str1.substring(4, 4));//"" empty string will print because si and ei both are same so ei will win
      System.out.println(str1.substring(1,6));//artik;
      System.out.println(str1.substring(0));
      //to remove leading for traling space from String use trim function 
      String name = "  hello kartik   ";
        name =name.trim(); //hello kartik   (without leading or trailing space)
       System.out.println(name);
       //split(): this function is use to split the word in string base on same word
       // this split will return array of string
       String name2  = "  helloXeXXXeXworld";
       name2=name2.trim(); // this will remove leading and  triling space
       String[]batwara = name2.split("X+");    // put the word from which we have to split
        //X+ means take all occurence of X and the split between the words same for spaces
        
       for(String s : batwara) {
    	   System.out.println(s); //hello 
    	                          //world
       }
	}

}

