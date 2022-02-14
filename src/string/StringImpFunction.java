package string;

public class StringImpFunction {

	public static void main(String[] args) {
		String str = "Hello";
		//length
		System.out.println(str.length());
		//indexOf
	   System.out.println(str.indexOf('o')); //4
	   //indexof firstOccurrece when character is repeat in String
	   System.out.println(str.indexOf('l')); //2
	   //lastindexof  lastOccurrece when character is repeat in String
	   System.out.println(str.lastIndexOf('l'));
	   //startsWith
	   System.out.println(str.startsWith("He")); //true
	   System.out.println(str.startsWith("he")); //false
	   //endsWith
 	   System.out.println( str.endsWith("lo")); //true
 	   //concat/+ -> costly
       str.concat("o"); // Hello	
       str = str + 'o';  // Helloo
       str = str.concat("o");  //Hellooo;
       System.out.println(str);
       
     //replace() -> modify
     str =   str.replace("o","l");
     System.out.println(str);
     
     String name = "kartik";
     //extract art
     System.out.println(name.substring(1,4)); //art 
     System.out.println(name.substring(4,4)); //""
     
   //i to end of string
     System.out.println(name.substring(1,6)); //artik (si ,ei)
     System.out.println(name.substring(1));  //artik
     
       		   
	}
}
