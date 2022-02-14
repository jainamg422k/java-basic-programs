package recurrsion;

public class GenerateAllStringPartition {
public static void partition(String inp ,String outp) {
     if(inp.length() == 0) {
    	 System.out.println(outp);
    	 return;
     }
	//1St observation if  inp String length  is 3 then 3 recursive calls if len 2 then calls is also 2
	 for(int ci = 0 ; ci<inp.length(); ci++) {      //ci means current Index
	     String outpApp = inp.substring(0,ci+1);    //outApp means outAppend
	     String leftInp = inp.substring(ci+1);
		 partition(leftInp, outp+outpApp+"|");
	 }
}
public static void main(String []args) {
	partition("nitin"," ");
}
}
