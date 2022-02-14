package recurrsion;

public class GenerateSubSequence {

	public static void genSub(String inp , String out) {
		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		char cc_0th  = inp.charAt(0);
		String leftInp =  inp.substring(1);
		genSub(leftInp, out);
		genSub(leftInp, out+ cc_0th);
	}
	public static void main(String[] args) {
		genSub("abc", "");

	}

}
